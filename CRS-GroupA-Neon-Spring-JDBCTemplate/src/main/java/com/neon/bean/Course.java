package com.neon.bean;



public class Course {
	private Integer courseId;
	private String courses;
	private Integer coursePrice;
	
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	
	
	public Integer getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(Integer coursePrice) {
		this.coursePrice = coursePrice;
	}
	public Course(Integer courseId, String courses, Integer coursePrice) {
		super();
		this.courseId = courseId;
		this.courses = courses;
		this.coursePrice = coursePrice;
	}
	public Course() {
		super();
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courses=" + courses + ", coursePrice=" + coursePrice + "]";
	}
	
	
	
	

}
