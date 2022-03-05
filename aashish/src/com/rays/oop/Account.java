package com.rays.oop;

public class Account {
 private String number;
 private String accounttype;
 private double balance;
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getAccounttype() {
	return accounttype;
}
public void setAccounttype(String accounttype) {
	this.accounttype = accounttype;
}
public double getBalance() {
	return balance;
}
public void deposit(double d) {
   double dep= getBalance();
   d=d+dep;
	setBalance(d);
}

public void withdrwal(double w) {
	double wit=getBalance();
	w=wit-w;
	 setBalance(w);
	
	
}
public void setBalance(double balance) {
	this.balance = balance;
}
public void fundtransfer(double w) {
	
	withdrwal(w);
	
}
public void paybill(double w) {
	
	withdrwal(w);
}

}
