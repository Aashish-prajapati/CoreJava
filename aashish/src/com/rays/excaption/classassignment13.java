package com.rays.excaption;

public class classassignment13 {
	public static void main(String[] args) {
 int i=25;
 int j=0;
 
  try {
	 double div=i/j;
	  System.out.println(div);
  }
    catch(ArithmeticException e) {
	  System.out.println("ArithmeticException"+e.getMessage());  
  }
  finally {
	  try {
		  String s="globle user";
		  System.out.println(s.charAt(22));
		  
	  }catch(Exception c) {
		 System.out.println( c.getMessage()); 
	  }
	  
  }
}
}