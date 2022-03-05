package com.rays.excaption;

public class HelloVijay {
	public static void main(String[] args) {
		try {
			auth("Vijay");
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} public static void auth(String name) throws LoginException {
		if(!"Admin".equals(name)) {
			LoginException e= new LoginException();
			throw e;
			
		}
	}

}
