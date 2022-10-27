package com.neon.bean;

import org.springframework.stereotype.Component;


public class User {
	
	private Integer userId;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private String userName;
	private String userPassword;
	private int userAge;
	private String userGender;
	private String address;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @param userId
	 * @param userFirstName
	 * @param userLastName
	 * @param userEmail
	 * @param userName
	 * @param userPassword
	 * @param userAge
	 * @param userGender
	 * @param address
	 */
	public User(Integer userId, String userFirstName, String userLastName, String userEmail, String userName,
			String userPassword, int userAge, String userGender, String address) {
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userAge = userAge;
		this.userGender = userGender;
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userEmail=" + userEmail + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userAge=" + userAge + ", userGender=" + userGender + ", address=" + address + "]";
	}
	
	
	
	
}
