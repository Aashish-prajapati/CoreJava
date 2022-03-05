package basic;

public class Fibonacci {
  public static void main(String[]args) {
	  int a=2;
	  int sum=0;
	  int c=3;
	  int i;
	  System.out.println("  series is =  ");
	  for(i=0;i<=10;i++)
	    {
		  System.out.println(a);
		  sum=a+c;
		  a=c;
		  c=sum;
	    }
	  System.out.print(" sum of series is ="+sum);
  }
  
  
}
