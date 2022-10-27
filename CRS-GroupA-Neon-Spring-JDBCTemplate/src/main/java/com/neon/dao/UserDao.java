package com.neon.dao;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository

public interface UserDao {

	public boolean loginStudent(String studentMailId, String studentPassword) throws SQLException;

	public boolean loginProfessor(String profUsername, String profPassword) throws SQLException;

	public boolean loginAdmin(String adminUserName, String adminPassword) throws SQLException;

	public boolean logout();

	public boolean changeStudentPassword(String studentMailId);

	public boolean changeProfessorPassword(String profUsername);
	public boolean changeAdminPassword(String adminUserName) ;
}
