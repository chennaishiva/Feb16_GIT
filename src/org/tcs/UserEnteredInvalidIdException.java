package org.tcs;

public class UserEnteredInvalidIdException extends Exception {

	@Override
	public String getMessage() {
		
		String msg = "User entered Invalid ID";
		
		return msg;
	}
	
}
