package com.neon.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neon.model.Catlog;
import com.neon.model.Professor;
import com.neon.model.Registration;
import com.neon.repository.CatlogRepository;
import com.neon.repository.ProfessorRepository;
import com.neon.repository.RegistrationRepository;




@Service
public class AdminService {

	@Autowired    
	private ProfessorRepository  professorRepository;  
	
	
	@Autowired
	private RegistrationRepository  registerRepository;

	@Autowired
	private CatlogRepository catlogRepository;
	
	@Transactional
	public List<Professor> getAllProfessor()  
	{    
		List<Professor> professor = new ArrayList<>();    
		professorRepository.findAll().forEach(professor::add);    
		return professor;    
	}

	
	@Transactional
	public Professor addProfessor(Professor professor) {
		// TODO Auto-generated method stub
		return professorRepository.save(professor);
		
	}


	public void addCourse(Catlog catlog) {
		// TODO Auto-generated method stub
		catlogRepository.save(catlog);
	}


	public void removeCourse(int catlogId) {
		// TODO Auto-generated method stub
		catlogRepository.deleteById(catlogId);
	}


	public boolean approveRegistration(int registerId ) {
		// TODO Auto-generated method stub
		Optional<Registration> register =registerRepository.findById(registerId);
		if(registerId == register.get().getRegisterId() ) {
			
			return true;
		}else {
		return false;
	}  
	}	
}
	
