package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
  public static void main(String[] args) throws ParseException {
	Person p=new Person();
	p.setName("Aashish");
	p.setAddress("33 marimata");
	String s="11/12/1999";
	SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
	Date d= sdf.parse(s);
	p.setDob(d);
	System.out.println(p.getName());
	System.out.println(p.getAddress());
	System.out.println(p.getDob());
	System.out.println(p.getAvgage());

	
	

    
	
	
	
	
	
}
}
