/**
 * 
 */
package com.neon.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author user364
 *
 */
@Entity
@Table(name="catlog")
public class Catlog {

	@Id
	private int catlogId;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="courseId")
//	private Course course;
	
	private String catlogCourseName;

	public int getCatlogId() {
		return catlogId;
	}

	public void setCatlogId(int catlogId) {
		this.catlogId = catlogId;
	}

//	public Course getCourse() {
//		return course;
//	}
//
//	public void setCourse(Course course) {
//		this.course = course;
//	}
	

	public Catlog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCatlogCourseName() {
		return catlogCourseName;
	}

	public void setCatlogCourseName(String catlogCourseName) {
		this.catlogCourseName = catlogCourseName;
	}
	
	
}
