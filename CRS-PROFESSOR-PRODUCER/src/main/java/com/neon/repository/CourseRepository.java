/**
 * 
 */
package com.neon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.neon.model.Course;

/**
 * @author user364
 *
 */
@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

}
