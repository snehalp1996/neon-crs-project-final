/**
 * 
 */
package com.neon.constant;

import java.sql.SQLException;
import java.util.List;

import com.neon.bean.Course;
import com.neon.bean.Grade;
import com.neon.bean.Student;
import com.neon.mapper.CourseMapper;
import com.neon.mapper.StudentMapper;

/**
 * @author user368
 *
 */
public class SQLConstant {
    // define all the SQL constants admin,professor,student here
	
	public static final String SQL_UPDATE_STUDENT="insert into student (studentPassword) values (?) where studentMailId = ? ";

	public static final String SQL_UPDATE_PROFESSOR="insert into professor (proPassword) values (?) where profUsername = ? ";

	public static final String SQL_UPDATE_ADMIN="insert into admin (adminPassword) values (?) where adminUserName = ? ";

	public static final String SQL_SELECT_ADMIN = "select * from admin";
	
	public static final String SQL_SELECT_COURSE = "select * from course";
	public static final String SQL_DELETE_CATLOG = "delete  from catlog where catalogId=?";
	public static final String SQL_SELECT_PROFESSOR = "select * from professor";
	public static final String SQL_INSERT_STUDENT = "insert into student (studentFirstName,studentLastName, studentMailId,studentPassword,studentGender) values (?,?,?,?,?)";
	public static final String SQL_INSERT_COURSE = "insert into course (courses, coursePrice) values (?,?)";
	public static final String SQL_DELETE_COURSE = "delete from course where courseId = ?";
	
	public static final String SQL_SELECT_STUDENT = "select * from student";
	
	

	public static final String SQL_SELECT_GRADE = "select * from grade";
	public static final String SQL_INSERT_GRADE = "insert into grade( studentGrade,studentId) values (?, ?)";
	public static final String SQL_INSERT_FEEPAYMENT ="insert into student(paymentid, courseName,coursePrice, paymentMode,totalAmount) values (?,?,?,?,?)";
			
	public static final String SQL_INSERT_PROFESSOR="insert into professor   (profLastName, profFirstName,  profEmail, profUsername, profPassword , courseName) values (?,?,?,?,?,?)";	
					 
					


}
