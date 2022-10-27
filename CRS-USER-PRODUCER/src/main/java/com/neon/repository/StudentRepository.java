/**
 * 
 */
package com.neon.repository;

import org.springframework.data.repository.CrudRepository;

import com.neon.model.Student;

/**
 * @author user364
 *
 */
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
