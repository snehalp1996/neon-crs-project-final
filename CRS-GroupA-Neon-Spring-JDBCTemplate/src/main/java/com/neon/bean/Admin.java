package com.neon.bean;

public class Admin {
private int adminId;
private String AdminFirstName;
private String AdminLastName;
private String AdminEmail;
private String AdminUserName;
private String AdminPassword;

/**
 * @return the adminId
 */
public int getAdminId() {
	return adminId;
}
/**
 * @param adminId the adminId to set
 */
public void setAdminId(int adminId) {
	this.adminId = adminId;
}
/**
 * @return the adminFirstName
 */
public String getAdminFirstName() {
	return AdminFirstName;
}
/**
 * @param adminFirstName the adminFirstName to set
 */
public void setAdminFirstName(String adminFirstName) {
	AdminFirstName = adminFirstName;
}
/**
 * @return the adminLastName
 */
public String getAdminLastName() {
	return AdminLastName;
}
/**
 * @param adminLastName the adminLastName to set
 */
public void setAdminLastName(String adminLastName) {
	AdminLastName = adminLastName;
}
/**
 * @return the adminEmail
 */
public String getAdminEmail() {
	return AdminEmail;
}
/**
 * @param adminEmail the adminEmail to set
 */
public void setAdminEmail(String adminEmail) {
	AdminEmail = adminEmail;
}
/**
 * @return the adminUserName
 */
public String getAdminUserName() {
	return AdminUserName;
}
/**
 * @param adminUserName the adminUserName to set
 */
public void setAdminUserName(String adminUserName) {
	AdminUserName = adminUserName;
}
/**
 * @return the adminPassword
 */
public String getAdminPassword() {
	return AdminPassword;
}
/**
 * @param adminPassword the adminPassword to set
 */
public void setAdminPassword(String adminPassword) {
	AdminPassword = adminPassword;
}


/**
 * @param adminId
 * @param adminFirstName
 * @param adminLastName
 * @param adminEmail
 * @param adminUserName
 * @param adminPassword
 * @param adminAge
 * @param adminGender
 */
public Admin(int adminId, String adminFirstName, String adminLastName, String adminEmail, String adminUserName,
		String adminPassword) {
	super();
	this.adminId = adminId;
	AdminFirstName = adminFirstName;
	AdminLastName = adminLastName;
	AdminEmail = adminEmail;
	AdminUserName = adminUserName;
	AdminPassword = adminPassword;
	
}
/**
 * 
 */
public Admin() {
	super();
}
@Override
public String toString() {
	return "Admin [adminId=" + adminId + ", AdminFirstName=" + AdminFirstName + ", AdminLastName=" + AdminLastName
			+ ", AdminEmail=" + AdminEmail + ", AdminUserName=" + AdminUserName + ", AdminPassword=" + AdminPassword
			+ "]";
}





}
