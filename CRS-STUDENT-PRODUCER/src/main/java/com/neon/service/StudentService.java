/**
 * 
 */
package com.neon.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class StudentService {

	@Autowired
	private RegistrationRepository registrationRepository;
	@Autowired
	private GradeRepository gradeRepository;
	@Autowired
	private CourseRepository courseRepository;
	
	public String registration(Registration registration) {
		registrationRepository.save(registration);
		return "Student Registration SUccesfully";
	}
	
	public String addCourseforStudent(Course course) {
		courseRepository.save(course);
		return "Course Registered";
	}
	
	public String dropCourseForStudent(int courseId) {
		courseRepository.deleteById(courseId);
		return "Course Deleted";
	}
	
	public Optional<Grade> viewGrade(int studentId) {
	Optional<Grade> grade=	gradeRepository.findById(studentId);
		return grade;
	}
}
