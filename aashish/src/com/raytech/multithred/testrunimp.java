package com.raytech.multithred;

public class testrunimp {
	public static void main(String[] args) {
		runimp r1=new runimp("rasiya");
		Thread th=new Thread(r1);
		th.start();
		
	}

}

