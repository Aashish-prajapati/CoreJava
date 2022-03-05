package com.rays.io;

import java.io.Serializable;

public class Employee implements Serializable {
	
 private int id;
 private String fname;
 private String lname;
// private Address add;
 private transient String password;
 public Employee() {}
 public Employee(int id,String fname,String lname ,String password) {
 this.id=id;
 this.fname= fname;
 this.lname= lname;
 this.password=password;
 }
public int getId() {
	return id;
}
public String getFname() {
	return fname;
}
public String getLname() {
	return lname;
}
public String getPassword() {
	return password;
}
 
}
