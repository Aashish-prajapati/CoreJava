package com.rays.oop;

import java.util.*;
import java.text.SimpleDateFormat;


public class Person {
      private String name;
      private String address;
      private Date dob;
      public  static final int AVGAGE=20;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob=dob ;
	}
	public static int getAvgage() {
		return AVGAGE;
	}
      
}