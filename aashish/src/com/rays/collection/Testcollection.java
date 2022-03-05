package com.rays.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Testcollection {
public static void main(String[] args) {
	List list=new LinkedList();
	list.add(786);
	list.add(930);
	list.add(7734);
	list.add("aashish");
	//System.out.println(list.removeAll(list));  
	//System.err.println(list);	
 List a=new ArrayList();
  a.add(565);
  a.add(9090);
  a.add(329);
  a.addAll(list);
  a.clear();
 //System.out.println( a.iterator());
  System.out.println(a);
  System.out.println(a.retainAll(a));
  System.out.println(a.size());
  //System.out.println(list);
 
 LinkedList x=new LinkedList();
 x.add(769);
 x.add(772);
 x.add(6325);
 x.addAll(a);
System.out.println(x.size());
System.out.println(x);
}
}