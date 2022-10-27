/**
 * 
 */
package com.neon.mapper;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.neon.bean.Course;

/**
 * @author user364
 *
 */

public class CourseMapper implements RowMapper<Course> {

	@Override
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		Course course = new Course();
		course.setCourseId(rs.getInt("courseId"));
		course.setCourses(rs.getString("courses"));
		course.setCoursePrice(rs.getInt("coursePrice"));
		
		return course;

	}

}
