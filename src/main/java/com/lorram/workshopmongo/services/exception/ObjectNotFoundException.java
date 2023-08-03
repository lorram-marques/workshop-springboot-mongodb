package com.lorram.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(Object id) {
		super("Object not found. Id " + id);
	}
}
