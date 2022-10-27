/**
 * 
 */
package com.neon.restcontroller;

import java.sql.SQLException;
import java.util.*;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neon.bean.Course;
import com.neon.bean.FeePayment;
import com.neon.bean.Grade;
import com.neon.bean.Student;
import com.neon.dao.StudentDao;
import com.neon.exception.AddCourseFailException;
import com.neon.exception.GetCourseFailException;
import com.neon.exception.GetStudentFailException;
import com.neon.exception.RemoveCourseFailException;
import com.neon.exception.StudentCourseRegistrationFailException;
import com.neon.exception.ViewGradesFailException;
import com.neon.service.StudentService;

/**
 * @author user368
 *
 */

@RestController
@RequestMapping("/std")
@CrossOrigin
public class StudentController {

	@Autowired
	private StudentDao studentdao;

	private static List<Student> list = new ArrayList<>();
	private static List<Course> list1 = new ArrayList<>();
	private static List<Grade> grade = new ArrayList<>();

	@Autowired
	StudentCourseRegistrationFailException studregfailexcp;

	/**
	 * This method is used to approve Student Resistration
	 * 
	 * @param stduentId is used as a parameter to approve Student Resistration id
	 * @return Student is Approve Successfully
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/student")
	@ResponseBody

	public ResponseEntity<String> addStudent(@RequestBody Student student) throws SQLException, ClassNotFoundException {

		boolean registrationStatus = studentdao.studentResistratioForCourse(student);
		if (registrationStatus == false) {
			return new ResponseEntity<String>(studregfailexcp.getMessage(), HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<String>("Student Registered Successfully. Your default password is: password. "
					+ "Please change your password after login.", HttpStatus.OK);
		}
	}

	@Autowired
	AddCourseFailException addCourseFailException;

	/**
	 * This method is used to add the course into catalog by using Course object as
	 * a parameter
	 * 
	 * @return Course Added Successfully
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/course")
	public ResponseEntity<String> addCourse(@RequestBody Course course) {

		boolean addCourse = studentdao.addCourse(course);

		if (addCourse == false) {
			return new ResponseEntity<String>(addCourseFailException.getMessage(), HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<String>("Add Course Successful", HttpStatus.OK);
		}
	}

	@Autowired
	RemoveCourseFailException removeCourseFailExcp;

	/**
	 * This method is used to delete Course
	 * 
	 * @param courseId is used as a parameter to delete course by id
	 * @return Remove Course Successful
	 */

	@DeleteMapping("/course/{courseId}")
	public ResponseEntity<String> removeCourse(Integer courseId) {
		boolean remcourse = studentdao.removeCourse(courseId);
		if (remcourse == false) {
			return new ResponseEntity<String>(removeCourseFailExcp.getMessage(), HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<String>("Remove Course Successful", HttpStatus.OK);
		}
	}

	@Autowired
	GetStudentFailException getStdFailExcp;

	/**
	 * This method is used to approve Student Resistration
	 * 
	 * @param stduentId is used as a parameter to approve Student Resistration id
	 * @return Student is Approve Successfully
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/student")

	public ResponseEntity<List<Student>> getStudent() throws SQLException {

		list = studentdao.liststudent();
//		if (list ) {
//			return new ResponseEntity<List<Student>>(getStdFailExcp.getMessage(), HttpStatus.NOT_FOUND);
//		} else {
			return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
//		}
	}

	@Autowired
	GetCourseFailException getCourseFailExcp;

	/**
	 * This method is used to approve Student Resistration
	 * 
	 * @param stduentId is used as a parameter to approve Student Resistration id
	 * @return Student is Approve Successfully
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/course")

	public ResponseEntity<List<Course>> getCourse() {
		list1 = studentdao.listcourse();
//		if (list1 !=null) {
//			return new ResponseEntity<List<Course>>(getCourseFailExcp.getMessage(), HttpStatus.NOT_FOUND);
//		} else {
			return new ResponseEntity<List<Course>>(list1, HttpStatus.OK);
//		}

	}

	@Autowired
	ViewGradesFailException viewGradesFailExcp;

	/**
	 * This method is used to View Grades
	 * 
	 * 
	 * @return View Grades Successful
	 */

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/grade")

	public ResponseEntity<String> viewGrades() {

		boolean viewgrade = studentdao.viewGrades();
		if (viewgrade == false) {
			return new ResponseEntity<String>(viewGradesFailExcp.getMessage(), HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<String>("View Grades Successful", HttpStatus.OK);
		}
	}

	/**
	 * This method is used to fee payment
	 * 
	 * @param This method is used to pay fees by using FeePayment object as a
	 *             parameter
	 * @return fee paid successfully
	 */
	@PostMapping("/fee")
	public String payFee(@RequestBody FeePayment FeePayment) {
		studentdao.payFee(FeePayment);
		return "fee paid successfully";

	}

}
