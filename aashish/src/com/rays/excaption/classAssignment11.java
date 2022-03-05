package com.rays.excaption;

public class classAssignment11 {
public static void main(String[] args) {
	try {
		
		double div=20/0;
		System.out.println(div);
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e){
			
			System.out.println(e.getMessage());		}
		
	 finally {
		 
		 System.out.println("ok");
	 }
	}catch(Exception r) {
		System.out.println(r.getMessage());
		
	}
	
}
}
