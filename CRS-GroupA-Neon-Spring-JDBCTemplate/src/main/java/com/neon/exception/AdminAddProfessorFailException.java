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
public class AdminAddProfessorFailException extends Exception {
	@Override
	public String getMessage() {
		
		return "Dear Admin, Could not Add professor, Please try again later.";
	}
}
