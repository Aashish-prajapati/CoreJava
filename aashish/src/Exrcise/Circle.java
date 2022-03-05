package Exrcise;

public class Circle extends Shape {
   private double radius;
   public static final double pi=3.14;
	public Circle(){}
	public Circle(double r) {
		radius =r;
	}
	 public double getradius(double r) {
		 return r;
	 }
	 public static double getpi() {
		 return pi;
	 }
	public double area() {
		double a= pi*radius*radius;
		System.out.println("Area of circle "+a);
		return a;
	}

}
