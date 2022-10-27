/**
 * 
 */
package com.neon.mapper;


import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.neon.bean.Course;
import com.neon.bean.Student;


/**
 * @author user364
 *
 */


	public class StudentMapper implements RowMapper<Student>{

		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			
			Student student = new Student();
			student.setStudentId(rs.getInt("StudentId"));
			student.setStudentFirstName(rs.getString("StudentFirstName"));
			student.setStudentLastName(rs.getString("StudentLastName"));
			student.setStudentMailId(rs.getString("StudentMailId"));
			student.setStudentPassword(rs.getString("StudentPassword"));
		student.setStudentAge(rs.getInt("StudentAge"));
			student.setStudentGender(rs.getString("StudentGender"));
		student.setCourseId(rs.getInt("CourseId"));
		      return student;
			
		}

	}

