package overriding;

public class circle extends shape {
	private double radius;
	public static final double PI=3.14;
    public circle() {}
    public circle(double r) {
    	radius=r;
    }
    public double getradius() {
    	return radius;
    }
    
    public double area() {
    	double a= PI*radius*radius;
    	return a;
    }

}
