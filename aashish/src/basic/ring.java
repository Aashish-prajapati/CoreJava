package basic;

public class ring {
   public static void main(String[]arg) {
	  
   
	String firstname="Aashish";
	String lastname="PrajapatI";
	String name=firstname+ lastname;
	name=firstname.concat(lastname);
	 String n=name;
	System.out.println("   "+name);
	System.out.println("String lenght: "+n.length());
	System.out.println("7th character: "+n.charAt(6));
	System.out.println("Index of :"+n.indexOf(""));
    System.out.println("Index of :"+n.indexOf("I"));
    System.out.println("Index of :"+n.lastIndexOf("I"));
    System.out.println(n.replace("I", "i"));
    System.out.println(n.toUpperCase());
    System.out.println(n.startsWith("Prajapati"));
    System.out.println(n.substring(7));
    int count = 0 ;
    char search='a';
    for(int i=0; n.length()>i;i++)
    {	
		if(n.charAt(i)==search) {
			 count++;
    }
    }
    System.out.println(count);
    n.toLowerCase(); 
    System.out.println(n);
   }
}