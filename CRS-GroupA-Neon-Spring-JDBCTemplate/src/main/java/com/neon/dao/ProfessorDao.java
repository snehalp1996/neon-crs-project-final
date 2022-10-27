package com.neon.dao;





import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.neon.bean.Grade;
import com.neon.bean.Student;
@Repository
public interface ProfessorDao  {
	public boolean addGrades(Grade grade);

	public List<Student> viewEnrolledStudent(int courseId);
	public List<Grade> viewGrades() ;
}
