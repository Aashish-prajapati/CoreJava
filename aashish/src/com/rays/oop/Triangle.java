package com.rays.oop;

public class Triangle extends Shape{
private double base;
 private double hight;
public double getBase() {
	return base;
}
public void setBase(double base) {
	this.base = base;
}
public double getHight() {
	return hight;
}
public void setHight(double hight) {
	this.hight = hight;
}
public double  area() {
	 return 0.5*base*hight;
	 }
}
