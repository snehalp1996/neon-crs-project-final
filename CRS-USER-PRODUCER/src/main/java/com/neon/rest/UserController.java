/**
 * 
 */
package com.neon.rest;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neon.service.UserService;

/**
 * @author user364
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	/*@studentlogin for student login
	 * by adding @studentId and @studentPassword
	 * return string message login failed or success
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.POST, value = "/studentlogin")
	@ResponseBody 
	public String studentlogin(@RequestHeader int studentId,@RequestHeader String studentPassword) {
		boolean stdlog=userService.studentLogin(studentId, studentPassword);
		if(stdlog==false) {
			return "Login Failed";
		}else {
			return "Login successfully";
		}
	
	}
	
	/*@adminlogin for admin login
	 *  using @adminId and @adminPassword 
	 *  return message admin success or failed
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.POST, value = "/adminlogin")
	@ResponseBody 
	public String adminlogin(@RequestHeader int adminId,@RequestHeader String adminPassword) {
		boolean adlog=userService.adminLogin(adminId, adminPassword);
		if(adlog==false) {
			return "Admin Login Failed";
		}else {
			return "Admin Login successfully";
		}
	}
	/* @professorlogin for professor login
	 * by @pId and @pPassword
	 * return string message professor login successfull or not
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.POST, value = "/professorlogin")
	@ResponseBody 
	public String professorlogin(@RequestHeader int pId,@RequestHeader String pPassword) {
		boolean plog=userService.professorLogin(pId, pPassword);
		if(plog==false) {
			return "Professor Login Failed";
		}else {
			return "Professor Login successfully";
		}
	}
	/* @logout for logout student,admin,professor
	 * return string message for logout successfully
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.GET, value = "/logout")
	@ResponseBody 
	public String logout() {
		return userService.logout();
		
	}
}
