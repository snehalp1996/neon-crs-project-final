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
public class AdminAddCourseFailException extends Exception {
	@Override
	public String getMessage() {
		
		return "Dear Student, Could not Add course, Please try again later.";
	}
}
