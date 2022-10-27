package com.neon.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class Registration {

	@Id
	private int registerId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="student_fk")
	private Student student;
	
	
	public int getRegisterId() {
		return registerId;
	}


	public void setRegisterId(int registerId) {
		this.registerId = registerId;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
}
