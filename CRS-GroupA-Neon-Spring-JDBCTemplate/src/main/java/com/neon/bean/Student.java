package com.neon.bean;

public class Student {
private int studentId;
private String studentFirstName;
private String studentLastName;
private String studentMailId;
private String studentPassword;
private String studentGender;
private int studentAge;
private Integer courseId;






public Student( String studentFirstName, String studentLastName, String studentMailId,
		String studentPassword, String studentGender,Integer courseId) {
	super();
//	this.studentId = studentId;
	this.studentFirstName = studentFirstName;
	this.studentLastName = studentLastName;
	this.studentMailId = studentMailId;
	this.studentPassword = studentPassword;
	this.studentGender = studentGender;

	this.courseId = courseId;
}
public Student() {
	super();
}


 


public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getStudentFirstName() {
	return studentFirstName;
}

public void setStudentFirstName(String studentFirstName) {
	this.studentFirstName = studentFirstName;
}

public String getStudentLastName() {
	return studentLastName;
}

public void setStudentLastName(String studentLastName) {
	this.studentLastName = studentLastName;
}

public String getStudentMailId() {
	return studentMailId;
}

public void setStudentMailId(String studentMailId) {
	this.studentMailId = studentMailId;
}

public String getStudentPassword() {
	return studentPassword;
}

public void setStudentPassword(String studentPassword) {
	this.studentPassword = studentPassword;
}

public String getStudentGender() {
	return studentGender;
}

public void setStudentGender(String studentGender) {
	this.studentGender = studentGender;
}


public int getStudentAge() {
	return studentAge;
}
public void setStudentAge(int studentAge) {
	this.studentAge = studentAge;
}
public Integer getCourseId() {
	return courseId;
}
public void setCourseId(Integer courseId) {
	this.courseId = courseId;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentFirstName=" + studentFirstName + ", studentLastName="
			+ studentLastName + ", studentMailId=" + studentMailId + ", studentPassword=" + studentPassword
			+ ", studentGender=" + studentGender + ", studentAge=" + studentAge + ", courseId=" + courseId + "]";
}

}
