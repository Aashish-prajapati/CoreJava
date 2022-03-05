package com.rays.oop;

public class Testaccount {
	public static void main(String[] args) {
		 Account A=new Account();
		 A.setBalance(2015);
		 A.setNumber("123456789");
		 A.setAccounttype("current");
		A.deposit(2000);
		System.out.println(A.getBalance());
		A.fundtransfer(252);
		System.out.println(A.getBalance());
		A.withdrwal(250);
		System.out.println(A.getBalance());
		A.paybill(200.00);
		System.out.println(A.getBalance());
	}

}
