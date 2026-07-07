package com.coforge.day6_java.assignment.ems.exception;

import com.coforge.day6_java.assignment.ems.util.ApplicationProperties;

public class InvalidEmployeeObjectException extends Exception{

	@Override
	public String toString() {
		return ApplicationProperties.validationFailed;
	}
	
}
