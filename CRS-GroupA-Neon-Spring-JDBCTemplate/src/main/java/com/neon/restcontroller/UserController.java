/**
 * 
 */
package com.neon.restcontroller;

import com.neon.dao.UserDao;
import java.sql.SQLException;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neon.dao.UserDao;
import com.neon.exception.AdminPwdChangeFailExcp;
import com.neon.exception.LoginAdminFailExcp;
import com.neon.exception.LoginProfFailExcp;
import com.neon.exception.LoginStdFailExcp;
import com.neon.exception.LogoutFailExcp;
import com.neon.exception.ProfPwdChangeFailExcp;
import com.neon.exception.StdPwdChangeFailExcp;
import com.neon.exception.StudentCourseRegistrationFailException;

/**
 * @author user368
 *
 */
//@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserDao userDao;

	/**
	 * This method is used for Student login
	 * 
	 * @param studentMailId, @param studentPassword parameters are used to verify
	 *                       student credentials
	 * @exception LoginStdFailExcp
	 * @return Student Login Successful
	 **/
	@Autowired
	LoginStdFailExcp stdLoginFailExcp;

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/student")
	public ResponseEntity<String> stdLogin(String studentMailId, String studentPassword) throws SQLException {
		boolean loginstd = userDao.loginStudent(studentMailId, studentPassword);
		if (loginstd == false) {
			return new ResponseEntity<String>(stdLoginFailExcp.getMessage(), HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<String>("Student Login Successful", HttpStatus.OK);
		}
	}

	/**
	 * This method is used for Professor login
	 * 
	 * @param profUsername, @param profPassword parameters are used to verify
	 *                      professor credentials
	 * 
	 * @exception LoginProfFailExcp
	 * @return Professor Login Successful
	 **/
	@Autowired
	LoginProfFailExcp loginProfFailExcp;

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/student")
	public ResponseEntity<String> profLogin(String profUsername, String profPassword) throws SQLException {
		boolean loginprof = userDao.loginProfessor(profUsername, profPassword);
		if (loginprof == false) {
			return new ResponseEntity<String>(loginProfFailExcp.getMessage(), HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<String>("Professor Login Successful", HttpStatus.OK);
		}
	}

	/**
	 * This method is used for Admin login
	 * 
	 * @param adminUserName, @param adminPassword parameters are used to verify
	 *                       admin credentials
	 * @return Admin Login Successful
	 **/
	@Autowired
	LoginAdminFailExcp loginAdminFailExcp;

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/student")
	public ResponseEntity<String> adminLogin(String adminUserName, String adminPassword) throws SQLException {
		boolean loginadmin = userDao.loginAdmin(adminUserName, adminPassword);
		if (loginadmin == false) {
			return new ResponseEntity<String>(loginAdminFailExcp.getMessage(), HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<String>("Admin Login Successful", HttpStatus.OK);
		}
	}

	/**
	 * This method is used for logout
	 * 
	 * @return Logout Successful
	 **/
	@Autowired
	LogoutFailExcp logoutFailExcp;

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/student")
	public ResponseEntity<String> logout() {
		boolean logout = userDao.logout();
		if (logout == false) {
			return new ResponseEntity<String>(logoutFailExcp.getMessage(), HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<String>("Logout Successful", HttpStatus.OK);
		}
	}

	/**
	 * This method is used to change password
	 * 
	 * @param studentMailId parameters are used to verify student credentials
	 * @return Student Change Password Successful
	 **/
	@Autowired
	StdPwdChangeFailExcp stdChangePwFailExcp;

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/student")
	public ResponseEntity<String> changeStdPass(String studentMailId) {
		boolean chgstdpwd = userDao.changeStudentPassword(studentMailId);
		if (chgstdpwd == false) {
			return new ResponseEntity<String>(stdChangePwFailExcp.getMessage(), HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<String>("Student Change Password Successful", HttpStatus.OK);
		}
	}

	/**
	 * This method is used to change password
	 * 
	 * @param profUsername parameters are used to verify professor credentials
	 * @return Professor Change Password Successful
	 **/
	@Autowired
	ProfPwdChangeFailExcp profPwdChangeFailExcp;

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/prof")
	public ResponseEntity<String> changeProfPass(String profUsername) {
		boolean chgprofpwd = userDao.changeProfessorPassword(profUsername);
		if (chgprofpwd == false) {
			return new ResponseEntity<String>(profPwdChangeFailExcp.getMessage(), HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<String>("Professor Change Password Successful", HttpStatus.OK);
		}
	}

	/**
	 * This method is used to change password
	 * 
	 * @param adminUserName parameters are used to verify admin credentials
	 * @return Admin Change Password Successful
	 **/
	@Autowired
	AdminPwdChangeFailExcp adminPwdChangeFailExcp;

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/admin")
	public ResponseEntity<String> changeAdminPass(String adminUserName) {
		boolean chgadminpwd = userDao.changeAdminPassword(adminUserName);
		if (chgadminpwd == false) {
			return new ResponseEntity<String>(adminPwdChangeFailExcp.getMessage(), HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<String>("Admin Change Password Successful", HttpStatus.OK);
		}
	}
}
