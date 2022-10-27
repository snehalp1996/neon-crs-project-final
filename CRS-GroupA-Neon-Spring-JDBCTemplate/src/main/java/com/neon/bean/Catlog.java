package com.neon.bean;

public class Catlog {
private int catalogId;
private String courseName;
private String courseDescription;
public int getCatalogId() {
	return catalogId;
}
public void setCatalogId(int catalogId) {
	this.catalogId = catalogId;
}


public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getCourseDescription() {
	return courseDescription;
}
public void setCourseDescription(String courseDescription) {
	this.courseDescription = courseDescription;
}
/**
 * @param catalogId
 * @param courseName
 * @param courseFee
 */
public Catlog(int catalogId, String courseName, String courseFee) {
	super();
	this.catalogId = catalogId;
	this.courseName = courseName;
	this.courseDescription = courseFee;
}
/**
 * 
 */
public Catlog() {
	super();
}

@Override
public String toString() {
	return "Catlog [catalogId=" + catalogId + ", courseName=" + courseName + ", courseDescription=" + courseDescription
			+ "]";
}
}
