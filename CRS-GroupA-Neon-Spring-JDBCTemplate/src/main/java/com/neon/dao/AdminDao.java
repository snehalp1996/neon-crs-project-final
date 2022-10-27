package com.neon.dao;





import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.neon.bean.Admin;
import com.neon.bean.Catlog;
import com.neon.bean.Course;
import com.neon.bean.Professor;
import com.neon.bean.Student;
@Repository
public interface AdminDao  {
	
		//public void  generateReportCard();
		public boolean addProfessor(Professor prof);
		public boolean approveStudentResistration(int studentId) throws SQLException ;
		public boolean addCourse(Catlog catlog);
		public boolean removeCourse(int catalogId);
		public void getStudentById(int studentId);
}
