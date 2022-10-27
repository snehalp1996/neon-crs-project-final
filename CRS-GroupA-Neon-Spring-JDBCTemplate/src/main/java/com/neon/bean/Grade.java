/**
 * 
 */
package com.neon.bean;

/**
 * @author user368
 *
 */
public class Grade {
private String studentGrade;
private int studentId;
/**
 * @return the studentGrade
 */
public String getStudentGrade() {
	return studentGrade;
}
/**
 * @param studentGrade the studentGrade to set
 */
public void setStudentGrade(String studentGrade) {
	this.studentGrade = studentGrade;
}
/**
 * @return the studentId
 */
public int getStudentId() {
	return studentId;
}
/**
 * @param studentId the studentId to set
 */
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
/**
 * @param studentGrade
 * @param studentId
 */
public Grade(String studentGrade, int studentId) {
	super();
	this.studentGrade = studentGrade;
	this.studentId = studentId;
}
@Override
public String toString() {
	return "Grade [studentGrade=" + studentGrade + ", studentId=" + studentId + "]";
}
/**
 * 
 */
public Grade() {
	super();
}

}
