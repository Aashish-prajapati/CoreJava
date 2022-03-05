package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class testSerializaton {
	public static void main(String[] args) throws Exception {
       
		main1(args);

		FileOutputStream file = new FileOutputStream("d://obj.ser");
		ObjectOutputStream out = new ObjectOutputStream(file);
		Employee emp = new Employee(181, "raju", "rastogi", "gfgfgfgf");
		out.writeObject(emp);
		out.close();
		System.out.println("objcject is successfully persisted");
	}

	public static void main1(String[] args) throws Exception, IOException {

		FileInputStream file1 = new FileInputStream("d://obj.ser");
		ObjectInputStream in = new ObjectInputStream(file1);
		Employee e = (Employee) in.readObject();
		System.out.println("ID" + e.getId());
		System.out.println("first naame" + e.getFname());
		System.out.println("last name" + e.getLname());
		System.out.println("password" + e.getPassword());
		in.close();
	}
}