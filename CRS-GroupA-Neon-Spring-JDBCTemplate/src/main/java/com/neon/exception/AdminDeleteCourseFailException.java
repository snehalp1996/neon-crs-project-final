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
public class AdminDeleteCourseFailException extends Exception {
	@Override
	public String getMessage() {
		
		return "Dear Admin, Could not delete course, Please try again later.";
	}
}
