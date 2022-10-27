/**
 * 
 */
package com.neon.rest;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neon.model.Course;
import com.neon.model.Registration;
import com.neon.service.StudentService;

/**
 * @author user364
 *
 */
@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	/*@registration for student registration
	 * return String format message student register 
	 * successfully
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.POST, value = "/registerstudent")
	@ResponseBody 
	public String registration(@RequestBody Registration registration) {
		return studentService.registration(registration);

	}
	/*@addCourseForStudent adding course for student
	 * return string format course is added
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.POST, value = "/addcourseforstudent")
	@ResponseBody 
	public String addCourseForStudent(@RequestBody Course course) {
		return studentService.addCourseforStudent(course);

	}
	/*
	 * @viewgrade return grade by student id
	 * @Object return grade with student information
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.GET, value = "/viewgrade/{studentId}")
	@ResponseBody 
	public Object viewGrade(@PathVariable("studentId") int studentId) {
		return studentService.viewGrade(studentId);

	}
	/* @dropCourseForStudent for drop course by course id
	 * return @string message delete course
	 */
	@RequestMapping(produces = MediaType.APPLICATION_JSON, 
			method = RequestMethod.DELETE, value = "/dropcourseforstudent/{courseId}")
	@ResponseBody 
	public String dropCourseForStudent(@PathVariable("courseId") int courseId) {
		return studentService.dropCourseForStudent(courseId);

	}
}
