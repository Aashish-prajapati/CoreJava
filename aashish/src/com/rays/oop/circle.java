package com.rays.oop;

public class circle extends Shape{
	private int radius;
	public static final double PI=3.14;
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public static double getPi() {
		return PI;
	}
	public  double area() {
		return 3.14*radius*radius; 
		
	}
	

}
