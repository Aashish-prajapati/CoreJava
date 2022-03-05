package com.rays.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class testio {
public static void main(String[] args)  {
	File f=new File("c:/");
	if(f.exists()) {
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.length());
		System.out.println(new Date(f.lastModified()));
		System.out.println(f.canExecute());
//       System.out.println(f.getCanonicalPath());
		System.out.println(f.getParent());
		System.out.println(f.getFreeSpace());
		System.out.println();
}
}
}