package Interface;

public class person1 {
private String firstname;
private String lastname;
private String address;
public person1() {
	System.out.println("defautlt");
}
public person1(String fn,String ln ) {
	firstname=fn;
	lastname=ln;
    System.out.println("2 peramitrized costuctor");
}
public person1(String fn,String ln,String ad) {
    this(fn,ln);
	this.address=ad;
	System.out.println("3perametrized");
	
}
public static void main(String[] args) {
	person1 p=new person1("aashish","prajapati","93banganga");
}
}
