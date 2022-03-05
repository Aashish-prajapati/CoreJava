package com.rays.excaption;

public class LoginException extends Exception {
	LoginException() {
	
	super("user not found");
	}
}
