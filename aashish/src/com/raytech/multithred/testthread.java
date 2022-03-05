package com.raytech.multithred;

public class testthread {
	public static void main(String[] args) {
		helloThread t1=new helloThread("pinkesh");
		helloThread t2=new helloThread("janvi");
		t1.start();
		t2.start();

		
	}

}
