package overriding;

public class test {
	public static void main(String[] args) {
		circle c=new circle();
		c.setBorderwidth(5);
		c.setColor("blue");
		System.out.println(c.getColor());
		System.out.println(c.getBorderwidth());
		System.out.println("area of circle"+c.area());
		
		 Triangle t=new Triangle();
         t.setBorderwidth(5);
         t.setColor("black");
		 t.setBase(5);
		 t.setHight(6);
		 System.out.println("areaa of triangle"+t.area());
		 System.out.println(t.getBorderwidth());
		 System.out.println(t.getColor());
		 
		 rectangle r= new rectangle(25.0,65.0);
		 r.setBorderwidth(45);
		 r.setColor("golden");
		 System.out.println(r.getBorderwidth());
		 System.out.println(r.getColor());
		 System.out.println("area of rectangle"+r.area());
	
}
	}
