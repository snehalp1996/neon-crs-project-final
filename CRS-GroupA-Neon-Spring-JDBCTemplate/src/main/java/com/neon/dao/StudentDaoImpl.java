package com.neon.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mysql.cj.xdevapi.Statement;
import com.neon.bean.Course;
import com.neon.bean.FeePayment;
import com.neon.bean.Grade;
import com.neon.bean.Student;
import com.neon.configuration.JDBCConfiguration;
import com.neon.constant.SQLConstant;
import com.neon.mapper.CourseMapper;
import com.neon.mapper.GradeMapper;
import com.neon.mapper.StudentMapper;

@Service
public class StudentDaoImpl implements StudentDao {
	// create the reference of loger here

	Logger logger = LoggerFactory.getLogger(StudentDaoImpl.class);

	// DI injection of JDBCTemplate

	@Autowired
	private JDBCConfiguration jdbcTemplateObject;

	private Student student;

	/**
	 * This method is used to approve Student Resistration
	 * 
	 * @param stduentId is used as a parameter to approve Student Resistration id
	 * 
	 */

	@Override
	@Transactional
	public boolean studentResistratioForCourse(Student student) throws SQLException, ClassNotFoundException {
		System.out.println(student.getStudentFirstName() + ":" + student.getStudentLastName() + ":"
				+ student.getStudentMailId() + "," + student.getStudentPassword() + "," + student.getStudentGender()
				+ "," + student.getStudentAge() + "," + student.getCourseId());

		String SQL = "insert into student (studentFirstName,studentLastName,studentMailId,studentPassword,studentGender,studentAge, courseId) values (?,?,?,?,?,?,?)";

		jdbcTemplateObject.jdbcTemplate().update(SQL, student.getStudentFirstName(), student.getStudentLastName(),
				student.getStudentMailId(), student.getStudentPassword(), student.getStudentGender(),
				student.getStudentAge(), student.getCourseId());
		return true;

	}

	/**
	 * This method is used to add the course into catalog by using Course object as
	 * a parameter
	 * 
	 * 
	 */
	@Override
	public boolean addCourse(Course course) {

		String SQL = "insert into course (courses, coursePrice) values (?,?)";

		jdbcTemplateObject.jdbcTemplate().update(SQL, course.getCourses(), course.getCoursePrice());

		System.out.println("dao impl complete");
		return true;
	}

	/**
	 * This method is used to delete Course
	 * 
	 * @param courseId is used as a parameter to delete course by id
	 * 
	 */
	@Override
	public boolean removeCourse(Integer courseId) {

		
		jdbcTemplateObject.jdbcTemplate().update(SQLConstant.SQL_DELETE_COURSE, courseId);
		System.out.println("Deleted Record with ID = " + courseId);
		return true;
	}

	/**
	 * This method is used to approve Student Resistration
	 * 
	 * @param stduentId is used as a parameter to approve Student Resistration id
	 * 
	 */

	@Override
	public List<Student> liststudent() throws SQLException {

		List<Student> student = jdbcTemplateObject.jdbcTemplate().query(SQLConstant.SQL_SELECT_STUDENT,
				new StudentMapper());
		logger.debug("in debug");
		return student;
	}

	/**
	 * This method is used to approve Student Resistration
	 * 
	 * @param stduentId is used as a parameter to approve Student Resistration id
	 * 
	 */
	@Override
	public List<Course> listcourse() {

		List<Course> course = jdbcTemplateObject.jdbcTemplate().query(SQLConstant.SQL_SELECT_COURSE,
				new CourseMapper());
		logger.debug("in debug");
		return course;
	}

	/**
	 * This method is used to View Grades
	 * 
	 */
	@Override
	public boolean viewGrades() {
		
		List<Grade> grade = jdbcTemplateObject.jdbcTemplate().query(SQLConstant.SQL_SELECT_GRADE, new GradeMapper());
		logger.debug("in debug");
		return true;

	}

	/**
	 * This method is used to fee payment
	 * 
	 * @param This method is used to pay fees by using FeePayment object as a
	 *             parameter
	 * 
	 */
	@Override
	public boolean payFee(FeePayment FeePayment) {

		jdbcTemplateObject.jdbcTemplate().update(SQLConstant.SQL_INSERT_FEEPAYMENT, FeePayment.getStudentId(),
				FeePayment.getPaymentid(), FeePayment.getCourseName(), FeePayment.getCoursePrice(),
				FeePayment.getPaymentMode(), FeePayment.getTotalAmount());

		return true;

	}


}
