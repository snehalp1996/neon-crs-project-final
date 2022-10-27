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
public class AddCourseFailException extends Exception {
	@Override
	public String getMessage() {
		
		return "Dear Student, Could not Add course, Please try again later.";
	}
}
