package basic;

import java.util.Stack;

public class testcollection1 {
public static void main(String[] args) {
	Stack s=new Stack();
	Stack s1=new Stack();
	for (char i = 'A'; i<='Z'; i++) {
		s.push(i);
		s1.push(s.pop());
		System.out.println(s1.pop());	
	}
	
  /*  System.out.println("Stack"+s);
    Stack k=new Stack();
   for(char i='Z'; i>='A'; i--)
   {
	   char v=(char)s.pop();
	   k.push(v);
	   
   }
   System.out.println(k);
   Stack f=new Stack();
    for(char i='z';i<='a';i++) {
    	char w=(char)k.pop();
    	f.push(w);
    }
    System.out.println(k);
    System.out.println(f);
    
    }	}
*/
}
}