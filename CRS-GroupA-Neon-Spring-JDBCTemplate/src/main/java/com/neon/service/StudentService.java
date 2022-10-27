package com.neon.service;

import com.neon.bean.Course;
import com.neon.bean.Student;

public interface StudentService {

public void addCourse();
public void dropCourse();
public void viewGreade();
public void payFee();
public void addStudent(Student student);
public void removeStudent(Long studentId);
public void addCourse(Course course);

}
