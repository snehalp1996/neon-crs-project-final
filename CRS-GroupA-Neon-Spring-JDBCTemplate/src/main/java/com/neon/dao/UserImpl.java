package com.neon.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.neon.configuration.JDBCConfiguration;
import com.neon.constant.SQLConstant;
import com.neon.mapper.AdminMapper;
import com.neon.mapper.ProfessorMapper;
import com.neon.mapper.StudentMapper;

@Service
public class UserImpl implements UserDao {

	Scanner sc = new Scanner(System.in);
	ResultSet rs;

	@Autowired
	private JDBCConfiguration jdbcTemplateObject;

	/**
	 * This method is used for Student login
	 * 
	 * @param studentMailId,
	 * @param studentPassword parameters are used to verify student credentials for
	 *                        login
	 * 
	 **/
	@Override
	public boolean loginStudent(String studentMailId, String studentPassword) throws SQLException {

		jdbcTemplateObject.jdbcTemplate().query(SQLConstant.SQL_SELECT_STUDENT, new StudentMapper());
		String uName = rs.getString(studentMailId);
		String pass = rs.getString(studentPassword);
		if (studentMailId.equals(uName) && studentPassword.equals(pass)) {
			System.out.println("Student Login successful....");
		} else {
			System.out.println("Please enter the correct details....");
		}
		return true;
	}

	/**
	 * This method is used for Professor login
	 * 
	 * @param profUsername,
	 * @param profPassword  parameters are used to verify professor credentials
	 **/
	@Override
	public boolean loginProfessor(String profUsername, String profPassword) throws SQLException {

		jdbcTemplateObject.jdbcTemplate().query(SQLConstant.SQL_SELECT_PROFESSOR, new StudentMapper());
		String pUname = rs.getString(profUsername);
		String pPass = rs.getString(profPassword);
		if (profUsername.equals(pUname) && profPassword.equals(pPass)) {
			System.out.println("Professor Login successful....");
		} else {
			System.out.println("Please enter the correct details....");
		}
		return true;
	}

	/**
	 * This method is used for Admin login
	 * 
	 * @param adminUserName,
	 * @param adminPassword  parameters are used to verify admin credentials
	 **/

	@Override
	public boolean loginAdmin(String adminUserName, String adminPassword) throws SQLException {
		jdbcTemplateObject.jdbcTemplate().query(SQLConstant.SQL_SELECT_ADMIN, new StudentMapper());
		String aUname = rs.getString(adminUserName);
		String aPass = rs.getString(adminPassword);
		if (aUname.equals(adminUserName) && aPass.equals(adminPassword)) {
			System.out.println("Admin Login successful....");
		} else {
			System.out.println("Please enter the correct details....");
		}
		return true;
	}

	/**
	 * This method is used for logout
	 **/
	@Override
	public boolean logout() {
		System.out.println("Logged out successfully....");
		return true;
	}

	/**
	 * This method is used to change password
	 * 
	 * @param studentMailId parameters are used to verify student credentials
	 **/
	@Override
	public boolean changeStudentPassword(String studentMailId) {
		System.out.println("Enter new password");
		String newStdPass = sc.next();
		jdbcTemplateObject.jdbcTemplate().update(SQLConstant.SQL_UPDATE_STUDENT, new StudentMapper());
		return true;
	}

	/**
	 * This method is used to change password
	 * 
	 * @param profUsername parameters are used to verify professor credentials
	 **/
	@Override
	public boolean changeProfessorPassword(String profUsername) {
		System.out.println("Enter new password");
		String newProfPass = sc.next();
		jdbcTemplateObject.jdbcTemplate().update(SQLConstant.SQL_UPDATE_PROFESSOR, new ProfessorMapper());
		return true;
	}

	/**
	 * This method is used to change password
	 * 
	 * @param adminUserName parameters are used to verify admin credentials
	 **/
	@Override
	public boolean changeAdminPassword(String adminUserName) {
		System.out.println("Enter new password");
		String newAdminPass = sc.next();
		jdbcTemplateObject.jdbcTemplate().update(SQLConstant.SQL_UPDATE_ADMIN, new AdminMapper());
		return true;
	}
}