package com.rays.oop;

public class rectangle extends Shape {
private double base;
private double hight;
public rectangle() {}
public rectangle(double b,double h) {
	base=b;
	hight=h;
	
}
  public double getbase() {
	return base;
}
   public double gethight() {
	return hight;
}
   public void area() {
	double a=base*hight;
	System.out.println("Area of Triangle "+a);
}

}

