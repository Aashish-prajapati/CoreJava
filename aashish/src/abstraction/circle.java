package abstraction;

public class circle extends shape {

		private double radius;
		public static final double pi=3.14;
		public circle() {}
		public circle(double r) {
			radius=r;
		}
		public double getradius(double r) {
			return r;
		}
		public static double getPi() {
			return pi;
}
	
		public double area() {
			return pi*radius*radius;
		
		}
		
}
