/**
 * 
 */
package com.neon.restcontroller;

import java.sql.SQLException;
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

import com.neon.bean.Catlog;
import com.neon.bean.Course;
import com.neon.bean.Grade;
import com.neon.bean.Professor;
import com.neon.bean.Student;
import com.neon.dao.AdminDao;
import com.neon.dao.AdminImplDAO;
import com.neon.exception.AdminAddCourseFailException;
import com.neon.exception.AdminAddProfessorFailException;
import com.neon.exception.AdminApproveStudentFailException;
import com.neon.exception.AdminDeleteCourseFailException;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author user368
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/adminController")
public class AdminController {

	@Autowired
	private AdminDao admindao;

	/**
	 * This method is used to add the course into catalog by using catalog object as
	 * a parameter
	 * 
	 * @return Course Added Successfully
	 */

	@Autowired
	private AdminAddCourseFailException Adminaddcoursefail;

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/addcourse")
	@ResponseBody
	public ResponseEntity<String> addCourse(@RequestBody Catlog catlog) {
		boolean resistrationStatus = admindao.addCourse(catlog);
		if (resistrationStatus == false) {
			return new ResponseEntity<String>(Adminaddcoursefail.getMessage(), HttpStatus.NOT_FOUND);
		}

		else {

			return new ResponseEntity<String>("Course Added Successfully", HttpStatus.OK);
		}

	}

	/**
	 * This method is used to add the Professor by using Professor object as a
	 * parameter
	 * 
	 * @return Professor Added Successfully
	 */

	@Autowired
	private AdminAddProfessorFailException Adminaddprofessorfail;

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/professor")
	@ResponseBody
	public ResponseEntity<String> addProfessor(@RequestBody Professor prof) {

		boolean resistrationStatuspro = admindao.addProfessor(prof);
		if (resistrationStatuspro == false) {
			return new ResponseEntity<String>(Adminaddprofessorfail.getMessage(), HttpStatus.OK);
		}

		else {

			return new ResponseEntity<String>("Professor Added Successfully", HttpStatus.OK);
		}
	}

	/**
	 * This method is used to delete Course
	 * 
	 * @param catalogId is used as a parameter to delete course by id
	 * @return Remove Course Successful
	 */

	@Autowired
	private AdminDeleteCourseFailException Admindeletecoursefail;

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.DELETE, value = "/removeCourse/{catalogId}")
	@ResponseBody
	public ResponseEntity<String> deleteCourse( int catalogId) {
		boolean resistrationStatuscourse = admindao.removeCourse(catalogId);
		if (resistrationStatuscourse == false) {
			return new ResponseEntity<String>(Admindeletecoursefail.getMessage(), HttpStatus.OK);
		}

		else {

			return new ResponseEntity<String>("Course Deleted Successfully.", HttpStatus.OK);
		}
	}

	/**
	 * This method is used to approve Student Resistration
	 * 
	 * @param stduentId is used as a parameter to approve Student Resistration id
	 * @return Student is Approve Successfully
	 */
	@Autowired
	private AdminApproveStudentFailException Adminapprovestudentfail;

	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value = "/approvestd")
	@ResponseBody
	public ResponseEntity<String> approveStd(@PathVariable("stduentId") int stduentId) throws SQLException {
		boolean resistrationStatusdeletecourse = admindao.approveStudentResistration(stduentId);
		if (resistrationStatusdeletecourse == false) {
			return new ResponseEntity<String>(Adminapprovestudentfail.getMessage(), HttpStatus.OK);
		}

		else {

			return new ResponseEntity<String>("Student is Approve Successfully..", HttpStatus.OK);

		}
	}

}
//@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value = "/reportcard")
//@ResponseBody
//public  String reportcard(int studentId, String studentGrade )
//{
//	admindao.generateReportCard(studentId, studentGrade);
//	return "Report card Genrated";
//	
//}