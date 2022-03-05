package Exrcise;

import java.awt.Rectangle;

public class TestShape {
	public static void main(String[] args) {

	Shape c= new Circle(5.0);
	Shape r=new rectangle(50.5,12.6);
	Shape t=new Triangle(25.3,65.3);
	c.area();
	r.area();
	t.area();

	System.out.println("Total Area"+(c.area()+r.area()+t.area()));
			
	}
}
