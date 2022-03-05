package com.rays.excaption;

public class classassignment23 {
public static void main(String[] args) {
	try {
		String name=null;
		System.out.println(name.length());
	}catch(NullPointerException e) {
		System.out.println("its a NullPointerException"+e.getMessage());
	    System.exit(2); 
	}
	finally {
		
		System.out.println("it's a final");
	}
}
}
