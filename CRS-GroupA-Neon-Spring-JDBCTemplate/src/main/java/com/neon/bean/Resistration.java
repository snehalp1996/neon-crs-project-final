package com.neon.bean;

public class Resistration {
private int regId;
private String regFirstName;
private String regLastName;
private String regEmail;
private String regUserName;
private String regPassword;
private int regAge;
private String regGender;
private String regAddress;
/**
 * @return the regId
 */
public int getRegId() {
	return regId;
}
/**
 * @param regId the regId to set
 */
public void setRegId(int regId) {
	this.regId = regId;
}
/**
 * @return the regFirstName
 */
public String getRegFirstName() {
	return regFirstName;
}
/**
 * @param regFirstName the regFirstName to set
 */
public void setRegFirstName(String regFirstName) {
	this.regFirstName = regFirstName;
}
/**
 * @return the regLastName
 */
public String getRegLastName() {
	return regLastName;
}
/**
 * @param regLastName the regLastName to set
 */
public void setRegLastName(String regLastName) {
	this.regLastName = regLastName;
}
/**
 * @return the regEmail
 */
public String getRegEmail() {
	return regEmail;
}
/**
 * @param regEmail the regEmail to set
 */
public void setRegEmail(String regEmail) {
	this.regEmail = regEmail;
}
/**
 * @return the regUserName
 */
public String getRegUserName() {
	return regUserName;
}
/**
 * @param regUserName the regUserName to set
 */
public void setRegUserName(String regUserName) {
	this.regUserName = regUserName;
}
/**
 * @return the regPassword
 */
public String getRegPassword() {
	return regPassword;
}
/**
 * @param regPassword the regPassword to set
 */
public void setRegPassword(String regPassword) {
	this.regPassword = regPassword;
}
/**
 * @return the regAge
 */
public int getRegAge() {
	return regAge;
}
/**
 * @param regAge the regAge to set
 */
public void setRegAge(int regAge) {
	this.regAge = regAge;
}
/**
 * @return the regGender
 */
public String getRegGender() {
	return regGender;
}
/**
 * @param regGender the regGender to set
 */
public void setRegGender(String regGender) {
	this.regGender = regGender;
}
/**
 * @return the regAddress
 */
public String getRegAddress() {
	return regAddress;
}
/**
 * @param regAddress the regAddress to set
 */
public void setRegAddress(String regAddress) {
	this.regAddress = regAddress;
}
/**
 * @param regId
 * @param regFirstName
 * @param regLastName
 * @param regEmail
 * @param regUserName
 * @param regPassword
 * @param regAge
 * @param regGender
 * @param regAddress
 */
public Resistration(int regId, String regFirstName, String regLastName, String regEmail, String regUserName,
		String regPassword, int regAge, String regGender, String regAddress) {
	super();
	this.regId = regId;
	this.regFirstName = regFirstName;
	this.regLastName = regLastName;
	this.regEmail = regEmail;
	this.regUserName = regUserName;
	this.regPassword = regPassword;
	this.regAge = regAge;
	this.regGender = regGender;
	this.regAddress = regAddress;
}
@Override
public String toString() {
	return "Resistration [regId=" + regId + ", regFirstName=" + regFirstName + ", regLastName=" + regLastName
			+ ", regEmail=" + regEmail + ", regUserName=" + regUserName + ", regPassword=" + regPassword + ", regAge="
			+ regAge + ", regGender=" + regGender + ", regAddress=" + regAddress + "]";
}
/**
 * 
 */
public Resistration() {
	super();
}





}


