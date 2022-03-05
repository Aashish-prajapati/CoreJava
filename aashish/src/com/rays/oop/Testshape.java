package com.rays.oop;

public class Testshape {
	public static void main(String[] args) {
		circle c=new circle();
		 Triangle t=new Triangle();
		c.setBorderwidth(5);
		c.setColor("blue");
		System.out.println(c.getColor());
		System.out.println(c.getBorderwidth());
		c.setRadius(5);
		t.setBase(5);
		t.setHight(6);
		 System.out.println("areaa of triangle"+t.area());
		 System.out.println("area of circle"+c.area());
		 rectangle r= new rectangle(25.0,65.0);
		  System.out.println("area of rectangle"+r.area());
		 
	}

}
