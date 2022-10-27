/**
 * 
 */
package com.neon.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author user364
 *
 */

@Entity
@Table(name="course")
public class Course {

		@Id
		private int courseId;
		private String courseName;
		
		private int studentId;
		
		
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public int getCourseId() {
			return courseId;
		}
		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}
		public String getCourseName() {
			return courseName;
		}
		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
//		public Student getStudent() {
//			return student;
//		}
//		public void setStudent(Student student) {
//			this.student = student;
//		}
		
		
		
	}

