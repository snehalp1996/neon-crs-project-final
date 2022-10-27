/**
 * 
 */
package com.neon.restcontroller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neon.bean.Grade;
import com.neon.bean.Student;
import com.neon.dao.ProfessorDao;
import com.neon.exception.ProfessorAddingGradeFailException;

/**
 * @author user368
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/Prof")
public class ProfessorController {

	@Autowired
	private ProfessorDao professordao;

	@Autowired
	private ProfessorAddingGradeFailException professorAddingGradeFailException;

	/**
	 * This method is used to add the grades
	 * 
	 * @return Grade has been added
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/addGrade")
	@ResponseBody
	public ResponseEntity<String> addGrade(@RequestBody Grade grade) {

		boolean addGradeStatus = professordao.addGrades(grade);
		if (addGradeStatus == false) {
			return new ResponseEntity<String>(professorAddingGradeFailException.getMessage(), HttpStatus.NOT_FOUND);
		} else {

			return new ResponseEntity<String>("Grade has been added", HttpStatus.OK);
		}
	}

	/**
	 * This method is used to view enrolled student
	 * 
	 * @param courseId this parameter used to find enrolled student by Id
	 * @return Enrolled students
	 */

	@GetMapping("/viewEnrolledStudent/{courseId}")
	public List<Student> viewEnrolledStudent(@PathVariable("courseId") int courseId) {
		return professordao.viewEnrolledStudent(courseId);
	}

	/**
	 * This method is used to view the grades
	 *
	 * 
	 */
	@GetMapping("/viewgrade")
	public List<Grade> viewGrades() {
		return professordao.viewGrades();
	}
}
