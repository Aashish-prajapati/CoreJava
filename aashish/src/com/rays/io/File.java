package com.rays.io;

public class File {


public static void main(String[] args) {
	File f =new File("F:/class");
	String [] s=f.list();
	for(String s:list) {
		
		if(f.isFile()) {
			
			System.out.println(f);
		}
	}
	System.out.println(f.exists());
	
	
	
}
}
