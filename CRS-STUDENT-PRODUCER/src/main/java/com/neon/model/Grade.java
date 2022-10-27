/**
 * 
 */
package com.neon.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

/**
 * @author user364
 *
 */
@Entity
@Table(name="grade")
public class Grade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int gId;
	private String sGrade;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="studentId_fk")
	private Student student;

	
	public int getgId() {
		return gId;
	}

	public void setgId(int gId) {
		this.gId = gId;
	}

	public String getsGrade() {
		return sGrade;
	}

	public void setsGrade(String sGrade) {
		this.sGrade = sGrade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
