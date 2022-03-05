package Interface;

public class employee extends person1 {
	private String designation;
	public employee() {
		System.out.println("defalt employee");
	}
	public employee(String fn,String ln,String des) {
		super(fn,ln);
		designation=des;
		System.out.println("3parameterized constructor ");
		
	}

}
