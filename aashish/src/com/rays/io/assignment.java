package com.rays.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class assignment {
public static void main(String[] args) throws Exception {
	
	FileReader file=new FileReader("d:\\email.txt");
	Scanner sc=new Scanner(file);
	FileWriter file1=new FileWriter("d://rightemil,txt");
	PrintWriter pw=new PrintWriter(file1);
	 String regex="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	while (sc.hasNext()) {
		String s=sc.nextLine();
	    
	    if(s.matches(regex)) {
	    	pw.println(s);
	    	
	    	
	    }
	}
	pw.close();
	file1.close();
	sc.close();
	file.close();
		 
		  
		 }
	
   
   
    
}
