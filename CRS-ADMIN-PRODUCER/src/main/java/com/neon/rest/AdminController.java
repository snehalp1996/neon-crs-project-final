package com.neon.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neon.model.Catlog;
import com.neon.model.Professor;

import com.neon.service.AdminService;

@RestController
public class AdminController {

	//autowired services here
	@Autowired
	private AdminService adminService;
	

	@Transactional
	@RequestMapping(value="/get-professor", method=RequestMethod.GET)    
	public List<Professor> getAllProfessor()  
	{    
	return adminService.getAllProfessor();    
	}
	
	/* @addProfessor adding professor
	 * @addException add exception for null object
	 * @ResponseEntity string return string type message 
	 * professor added
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.POST, value = "/addprofessor")
	@ResponseBody 
	public String addProfessor(@RequestBody Professor professor) {
		 adminService.addProfessor(professor);
		return "Professor Added SUccessfully";
	}
		
	/*@addCourse adding course
	 * @Catlog adding course catlog object
	 */
		
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.POST, value = "/addcourse")
	@ResponseBody 
	public void addCourse(@RequestBody Catlog catlog) {
		 adminService.addCourse(catlog);
		 
		System.out.println("Course Added");
	
	}
	/* @catlogId adding course catlog id
	 *@removeCourse remove course by catlog id
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON,
			method = RequestMethod.DELETE,value = "/removecourse/{catlogId}")
	@ResponseBody
	public void removeCourse(@PathVariable("catlogId") int catlogId){
		System.out.println("Deleted Course");
		adminService.removeCourse(catlogId);
		
	}
	
	/*@studentId adding student id for approve process
	 * @approveRegistration approve student registartion
	 * @boolean return boolean result for approve
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.GET, value = "/approve/{studentId}")
	@ResponseBody
	public  boolean approveRegistration(@PathVariable("studentId") int studentId) {
	
		return adminService.approveRegistration(studentId);

	}
	
}
