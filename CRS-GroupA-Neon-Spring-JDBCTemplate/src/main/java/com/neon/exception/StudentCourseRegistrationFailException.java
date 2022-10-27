/**
 * 
 */
package com.neon.exception;
import org.springframework.stereotype.Component;
/**
 * @author user368
 *
 */
@Component
public class StudentCourseRegistrationFailException extends Exception{
	/**
	 * @exception StudentCourseRegistrationFailException
	 */
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Dear Student, your registration to the course could not be completed. Please try again later.";
	}
}
