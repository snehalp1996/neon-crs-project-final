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

/**
 * @author user364
 *
 */

public class AdminMapper implements RowMapper<Admin> {

	@Override
	public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		Admin admin = new Admin();
		admin.setAdminFirstName(rs.getString("AdminFirstName"));
		admin.setAdminLastName(rs.getString("AdminLastName"));
		admin.setAdminEmail(rs.getString("AdminEmail"));
		
		admin.setAdminUserName(rs.getString("AdminUserName"));
		admin.setAdminPassword(rs.getString("AdminPassword"));
		return admin;

	}

}
