package Exrcise;

public class Triangle extends Shape  {
	 private double base;
	 private double hight;
	public Triangle () {}
	public Triangle (double h,double b) {
		base=b;
		hight=h;
	}
	public double getbase() {
		return base;
	}
	public double gethight() {
		return hight;
	}
	public double area() {
	 	 double a= 0.5*base*hight;
       System.out.println("Area of Triangle"+a);
	return a;
}
	 
}
