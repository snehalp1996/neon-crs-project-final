/**
 * 
 */
package com.neon.mapper;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.neon.bean.Admin;
import com.neon.bean.Course;
import com.neon.bean.Professor;

/**
 * @author user364
 *
 */

public class ProfessorMapper implements RowMapper<Professor> {

	@Override
	public Professor mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		Professor professor = new Professor();
		professor.setProfFirstName(rs.getString("ProfFirstName"));
		professor.setProfLastName(rs.getString("ProfLastName"));
		professor.setProfpEmail(rs.getString("ProfEmail"));
	
		professor.setCourseName(rs.getString("courseName"));
		professor.setProfUsername(rs.getString("ProfUserName"));
		professor.setProfPassword(rs.getString("ProfPassword"));
		return professor;

	}

}
