/**
 * 
 */
package com.neon.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neon.model.Admin;
import com.neon.model.Professor;
import com.neon.model.Student;
import com.neon.repository.AdminRepository;
import com.neon.repository.ProfessorRepository;
import com.neon.repository.StudentRepository;

/**
 * @author user364
 *
 */
@Service
public class UserService {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private ProfessorRepository professorRepository;
	public boolean studentLogin(int studentId,String studentPassword) {
			Optional<Student> std=studentRepository.findById(studentId);
			std.get().getStudentId();
			if(studentId==std.get().getStudentId() && studentPassword.equals(std.get().getStudentPassword())) {
				return true;
			}else {
				return false;
			}
			
	}
	public boolean adminLogin(int adminId,String adminPassword) {
		Optional<Admin> ad=adminRepository.findById(adminId);
		ad.get().getAdminId();
		if(adminId== ad.get().getAdminId() && adminPassword.equals(ad.get().getAdminPassword()) ) {
			return true;
		}else {
			return false;
		}
		
}
	public boolean professorLogin(int pId,String pPassword) {
		Optional<Professor> pro=professorRepository.findById(pId);
		pro.get().getpId();
		if(pId== pro.get().getpId() && pPassword.equals(pro.get().getpPassword())) {
			return true;
		}else {
			return false;
		}
		
}
	public String logout() {
		return "Logged out successfully....";
	}
}
