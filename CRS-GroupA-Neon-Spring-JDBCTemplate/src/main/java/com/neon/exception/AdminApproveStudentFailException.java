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
public class AdminApproveStudentFailException {
	public String getMessage()
	{
		return " Dear Admin you are unable to Approve Student  please try again later";
	}
}
