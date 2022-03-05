package Exrcise;

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
		return base;
	}
		public double area() {
			 double a= 0.5*base*hight;
		System.out.println("Area of rectanlgle "+a);
		return a;
	}
	
}
