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
public class GetCourseFailException extends Exception {
	@Override
	public String getMessage() {
		
		return "Dear Student,Could not get list of course, Please try again later.";
	}
}
