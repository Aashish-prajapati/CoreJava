package basic;

public class marks {
	public static void main(String[]args) {
		
		int m=65;
		if(m>90) {
			System.out.println("A+");
		}
	  
	    else if(m>60 && m<86){ 
			System.out.println("A");

	    }
	    else if(m>55 && m<59){ 
			System.out.println("B+");
	    }
	    else if(m>50 && m<54){ 
			System.out.println("B");
	    }
	    else if(m>40 && m<49){ 
			System.out.println("c");
	    }
	    else if(m>33 && m<39){ 
			System.out.println("D");
	    }
	    else
	    {
			System.out.println("F");

	    }
	} 
	

}
