/*
 *(c) Copyright QNX Software Systems Ltd. 2002.
 * All Rights Reserved.
 * 
 */
package org.eclipse.cdt.debug.core.cdi;

/**
 * 
 * Represents an information provided by the session when the program 
 * exited.
 * 
 * @since Jul 10, 2002
 */
public interface ICDIErrorInfo extends ICDISessionObject {

	/**
	 * Returns the error message.
	 */
	public String getMessage();
	
	/**
	 * Returns a more verbatim error message(if any).
	 */
	public String getDetailMessage();
}
