package net.javaguides.springboot.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException(String Message)
	{
		super(Message);
	}
	
	public ResourceNotFoundException(String Message, Throwable throwable)
	{
		super(Message, throwable);
	}

}
