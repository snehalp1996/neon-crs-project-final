package com.neon.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.neon.bean.Course;
import com.neon.bean.FeePayment;
import com.neon.bean.Grade;
import com.neon.bean.Student;

public interface StudentDao {
	public boolean studentResistratioForCourse(Student student) throws SQLException, ClassNotFoundException ;
			
	public boolean addCourse(Course course);

	public boolean removeCourse(Integer courseId);

	public List<Student> liststudent() throws SQLException;

	public List<Course> listcourse();

	public boolean viewGrades();

	public boolean payFee(FeePayment FeePayment);

}
