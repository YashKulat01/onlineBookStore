/**
 * 	AUTHOR:-> YASH KULAT
 */
package com.book_next.exceptions;

/**
 *  THIS IS NOT FOUND EXCEPTION OF THE PROJECT.
 */
public class NotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3883429380988437655L;
	
	
	public NotFoundException() {
		super();
	}
	
	public NotFoundException(String message) {
		super(message);
	}

}
