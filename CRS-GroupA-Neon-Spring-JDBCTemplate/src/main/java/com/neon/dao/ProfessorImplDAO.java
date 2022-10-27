package com.neon.dao;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.neon.bean.Grade;
import com.neon.bean.Student;
import com.neon.configuration.JDBCConfiguration;
import com.neon.constant.SQLConstant;
import com.neon.mapper.GradeMapper;
import com.neon.mapper.StudentMapper;

@Service
public class ProfessorImplDAO implements ProfessorDao {

	// create the reference of looger here
	//Logger logger = LoggerFactory.getLogger(ProfessorImplDAO.class);

		// DI injection of JDBCTemplate
		@Autowired
		private JDBCConfiguration jdbcTemplateObject;

		/**
		 * grade added
		 * @return 
		 */
		
		
		
		/**
		 * This method is used to add the grades
		 * 
		 * @return Grade has been added
		 */
		@Override
		@Transactional
		public boolean addGrades(Grade grade) {
		
			 jdbcTemplateObject.jdbcTemplate().update( SQLConstant.SQL_INSERT_GRADE, grade.getStudentGrade(), grade.getStudentId());
			return true;
				
		}

		
		/**
		 * This method is used to view enrolled student
		 * 
		 * @param courseId this parameter used to find enrolled student by Id
		 * @return Enrolled students
		 */
		@Override
		@Transactional
		public List<Student> viewEnrolledStudent(int courseId) {
		
			return jdbcTemplateObject.jdbcTemplate().query( SQLConstant.SQL_SELECT_STUDENT, new StudentMapper());
		}

		/**
		 * This method is used to view the grades
		 *
		 * 
		 */
		@Override
		@Transactional
		public List<Grade> viewGrades() {
			
			return jdbcTemplateObject.jdbcTemplate().query( SQLConstant.SQL_SELECT_GRADE, new GradeMapper());
		}

}
