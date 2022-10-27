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
public class RemoveCourseFailException extends Exception {
	@Override
	public String getMessage() {
		
		 return "Dear Student, Could not remove course, Please try again later.";
	}
}
