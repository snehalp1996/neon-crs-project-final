package com.neon.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.neon.mapper.AdminMapper;
import com.neon.mapper.GradeMapper;
import com.neon.mapper.StudentMapper;

import com.neon.bean.Admin;
import com.neon.bean.Catlog;
import com.neon.bean.Course;
import com.neon.bean.Professor;
import com.neon.bean.Student;
import com.neon.configuration.JDBCConfiguration;
import com.neon.constant.SQLConstant;

@Repository
public class AdminImplDAO implements AdminDao {
	@Autowired
	private JDBCConfiguration jdbcTemplateObject;
	static private ResultSet rs;

	/**
	 * This method is used to add the Professor by using Professor object as a
	 * parameter
	 * 
	 * 
	 */
	@Override
	public boolean addProfessor(Professor prof) {
		jdbcTemplateObject.jdbcTemplate().update(SQLConstant.SQL_INSERT_PROFESSOR, prof.getProfFirstName(),
				prof.getProfLastName(), prof.getProfpEmail(), prof.getProfUsername(), prof.getProfPassword(),
				prof.getCourseName());
		return true;

	}

	/**
	 * This method is used to add the course into catalog by using catalog object as
	 * a parameter
	 * 
	 */
	@Override
	public boolean addCourse(Catlog cat) {

		String SQL = "insert into catlog (courseName,courseDescription) values (?,?)";
System.out.println("add course");
		jdbcTemplateObject.jdbcTemplate().update(SQL, cat.getCourseName(), cat.getCourseDescription());
		System.out.println("complete");
		return true;

	}

	/**
	 * This method is used to delete Course
	 * 
	 * @param catalogId is used as a parameter to delete course by id
	 * 
	 */
	@Override
	public boolean removeCourse(int catalogId) {
		jdbcTemplateObject.jdbcTemplate().update(SQLConstant.SQL_DELETE_CATLOG, catalogId);
		System.out.println("Course deleted with CourseId = " + catalogId);
		return true;

	}

	/**
	 * This method is used to approve Student Resistration
	 * 
	 * @param stduentId is used as a parameter to approve Student Resistration id
	 * 
	 */

	@Override
	public boolean approveStudentResistration(int studentId) throws SQLException {

		if (studentId >= 11) {
			System.out.println("Course registration is full");
		} else {
			getStudentById(studentId);
		}
		return true;

	}

	
	
	/**
	 * This method is used to get Student By Id
	 * 
	 * @param stduentId is used as a parameter to get Student By Id
	 * 
	 */
	@Override
	public void getStudentById(@PathVariable("studentId") int studentId) {
		String SQL = "select * from student where studentId=?";

		jdbcTemplateObject.jdbcTemplate().query(SQL, new StudentMapper());
		return;

	}

}
