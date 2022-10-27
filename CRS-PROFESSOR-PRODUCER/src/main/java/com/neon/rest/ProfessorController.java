/**
 * 
 */
package com.neon.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neon.model.Course;
import com.neon.model.Grade;
import com.neon.model.Registration;
import com.neon.service.ProfessorService;

/**
 * @author user364
 *
 */
@RestController
public class ProfessorController {

	@Autowired
	private ProfessorService professorService;
	
	/* @viewcourse for return courses for selection of student
	 * @List return courses in list form
	 */
	
	@Transactional
	@RequestMapping(value="/viewcourse", method=RequestMethod.GET)    
	public List<Course> viewcourse()  
	{    
	return professorService.viewCourse();    
	}
	/* @Grade adding grade object in @RequestBody 
	 * @addGrade add grade
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.POST, value = "/addgrade")
	@ResponseBody 
	public void addGrade(@RequestBody Grade grade) {
		 professorService.addGrade(grade);
		 
		System.out.println("Grade Added");
	
	}
	/*@viewRegisteredStudents for display registered students
	 * @List return registered student list
	 */
	@Transactional
	@RequestMapping(value="/viewregisteredstudents", method=RequestMethod.GET)    
	public List<Registration> viewRegisteredStudents()  
	{    
	return professorService.viewRegisteredStudent();    
	}
}
