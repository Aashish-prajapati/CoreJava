package com.rays.excaption;

public class classAssignment12 {
	public static void main(String[] args) {
	 int k=45;
	 int i=0;
	 int div;
	 try {
		 
		 div=k/i;
		 System.out.println(div);
	 }catch(Exception e) {
		 System.out.println(e.getMessage());
		try {
			int j=20;
		 int h=0;
		 div=j/h;
		 System.out.println(div);
		}catch(Exception b) {
			
			System.out.println(b.getMessage());
		}
		 
		 
	 }
	}
}


