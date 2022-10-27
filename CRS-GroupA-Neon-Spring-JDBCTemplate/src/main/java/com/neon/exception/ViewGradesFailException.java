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

public class ViewGradesFailException extends Exception {
	@Override
	public String getMessage() {
		
		return "Dear Student, Could not View Grades, Please try again later.";
	}
}
