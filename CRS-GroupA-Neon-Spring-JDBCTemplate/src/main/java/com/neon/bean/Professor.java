package com.neon.bean;

public class Professor {
private int profId;
private String profLastName;
private String profFirstName;
private String profpEmail;
private String profUsername;
private String profPassword;
private String courseName;

/**
 * @return the courseName
 */
public String getCourseName() {
	return courseName;
}
/**
 * @param courseName the courseName to set
 */
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
/**
 * @return the profId
 */
public int getProfId() {
	return profId;
}
/**
 * @param profId the profId to set
 */
public void setProfId(int profId) {
	this.profId = profId;
}
/**
 * @return the profLastName
 */
public String getProfLastName() {
	return profLastName;
}
/**
 * @param profLastName the profLastName to set
 */
public void setProfLastName(String profLastName) {
	this.profLastName = profLastName;
}
/**
 * @return the profFirstName
 */
public String getProfFirstName() {
	return profFirstName;
}
/**
 * @param profFirstName the profFirstName to set
 */
public void setProfFirstName(String profFirstName) {
	this.profFirstName = profFirstName;
}
/**
 * @return the profpEmail
 */
public String getProfpEmail() {
	return profpEmail;
}
/**
 * @param profpEmail the profpEmail to set
 */
public void setProfpEmail(String profpEmail) {
	this.profpEmail = profpEmail;
}
/**
 * @return the profUsername
 */
public String getProfUsername() {
	return profUsername;
}
/**
 * @param profUsername the profUsername to set
 */
public void setProfUsername(String profUsername) {
	this.profUsername = profUsername;
}
/**
 * @return the profPassword
 */
public String getProfPassword() {
	return profPassword;
}
/**
 * @param profPassword the profPassword to set
 */
public void setProfPassword(String profPassword) {
	this.profPassword = profPassword;
}

/**
 * @param profId
 * @param profLastName
 * @param profFirstName
 * @param profpEmail
 * @param profUsername
 * @param profPassword
 * @param courseName
 */
public Professor(int profId, String profLastName, String profFirstName, String profpEmail, String profUsername,
		String profPassword, String courseName) {
	super();
	this.profId = profId;
	this.profLastName = profLastName;
	this.profFirstName = profFirstName;
	this.profpEmail = profpEmail;
	this.profUsername = profUsername;
	this.profPassword = profPassword;
	this.courseName = courseName;
}
/**
 * 
 */
public Professor() {
	super();
}
@Override
public String toString() {
	return "Professor [profId=" + profId + ", profLastName=" + profLastName + ", profFirstName=" + profFirstName
			+ ", profpEmail=" + profpEmail + ", profUsername=" + profUsername + ", profPassword=" + profPassword
			+ ", courseName=" + courseName + "]";
}








}
