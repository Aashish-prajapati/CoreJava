package overriding;

public class Triangle extends shape {
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
