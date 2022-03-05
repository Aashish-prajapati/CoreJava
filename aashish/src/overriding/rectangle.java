package overriding;

public class rectangle extends shape {
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
	public double area() {
		double a=0.5*base*hight;
		return a;
	}

}
