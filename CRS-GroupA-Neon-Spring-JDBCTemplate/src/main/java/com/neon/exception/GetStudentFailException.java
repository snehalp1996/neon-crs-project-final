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
public class GetStudentFailException extends Exception {
	@Override
	public String getMessage() {
		
		return "Dear Student,Could not get list of students, Please try again later.";
	}
}
