/**
 * 
 */
package com.neon.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neon.model.Course;
import com.neon.model.Grade;
import com.neon.model.Registration;
import com.neon.repository.CourseRepository;
import com.neon.repository.GradeRepository;
import com.neon.repository.RegistrationRepository;

/**
 * @author user364
 *
 */
@Service
public class ProfessorService {

	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private GradeRepository gradeRepository;
	@Autowired
	private RegistrationRepository registrationRepository;
	@Transactional
	public List<Course> viewCourse(){
		
		List<Course> courseList=new ArrayList<>();
		courseRepository.findAll().forEach(courseList::add);
		return courseList;
	}
	
	@Transactional
	public void addGrade(Grade grade) {
		gradeRepository.save(grade);
		
	}
	
	@Transactional
	public List<Registration> viewRegisteredStudent(){
		
		List<Registration> register=new ArrayList<>();
		registrationRepository.findAll().forEach(register::add);
		return register;
	}
	
}
