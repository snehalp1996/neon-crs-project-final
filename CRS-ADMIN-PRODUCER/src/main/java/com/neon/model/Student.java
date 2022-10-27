package com.neon.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	private int studentId;
	private String studentPassword;
	private String studentName;
	private String studentCity;
	private String studentGender;
	
//	@ManyToOne
//	@JoinColumn(name="courseId",nullable = false)
//	private Course course;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="gId_fk")
//	private Grade grade;
	
	
	
//	public Grade getGrade() {
//		return grade;
//	}
//	public void setGrade(Grade grade) {
//		this.grade = grade;
//	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentPassword() {
		return studentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public Student(int studentId, String studentPassword, String studentName, String studentCity,
			String studentGender) {
		super();
		this.studentId = studentId;
		this.studentPassword = studentPassword;
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.studentGender = studentGender;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
