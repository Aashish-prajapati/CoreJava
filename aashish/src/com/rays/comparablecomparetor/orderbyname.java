package com.rays.comparablecomparetor;

import java.util.Comparator;

public class orderbyname implements Comparator<marksheet> {

	public int compare(marksheet m1, marksheet m2) {
		if(m1.getFname()==m1.getFname())
		{
		return m1.getFname().compareTo(m1.getFname()) ;
	}else {
		return m1.getLname().compareTo(m2.getLname());
	}
		}

}
