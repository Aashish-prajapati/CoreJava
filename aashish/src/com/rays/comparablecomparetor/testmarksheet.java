package com.rays.comparablecomparetor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class testmarksheet {
public static void main(String[] args) {
	marksheet m=new marksheet("101","Aashish","prajapati",65,56,89);
	marksheet m1=new marksheet("101","Aashish","lole",65,56,89);
	marksheet m2=new marksheet("103","birju","gome",65,56,89);
	ArrayList a=new ArrayList();
	a.add(m);
	a.add(m1);
	a.add(m2);
	Collections.sort(a,new orderbyname());

	Iterator it = a.iterator();
   while (it.hasNext()) {
	marksheet o = (marksheet) it.next();
System.out.println(o);	
}
   
}}
