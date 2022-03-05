package com.rays.comparablecomparetor;

public class marksheet implements Comparable<marksheet> {
	private String rollno;
	private String fname;
	private String lname;
	private int phy;
	private int chem;
	private int math;
	//public marksheet(String string, String string, String string, int i, int j, int k) {}
	public marksheet(String r,String f,String l,int p,int c,int m) {
		rollno=r;
		fname=f;
		lname=l;
		phy=p;
		chem=c;
		math=m;
	}
	public String getRollno() {
		return rollno;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public int getPhy() {
		return phy;
	}
	public int getChem() {
		return chem;
	}
	public int getMath() {
		return math;
	}
	public int compareTo(marksheet o) {
	 return this.fname.compareTo(fname);
	}
	public String toString() {
		return rollno+""+fname+""+lname+" "+phy+" "+chem+" "+math;	
	} 
}
