package com.rays.io;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class primitivedata {
public static void main(String[] args) throws Exception {
	main1(args);
	
	FileOutputStream file=new FileOutputStream("d://primitiv.dat");
   DataOutputStream out=new DataOutputStream(file);
   out.writeInt(10);
   out.writeBoolean(false);
   out.writeChar('a');
   out.writeDouble(25.25);
   out.close();
   file.close();
   System.out.println("Data enter");
  
}
public static void main1(String[] args) throws Exception {
	FileInputStream file=new FileInputStream("d://primitiv.dat");
	DataInputStream in=new DatanInputStream(file);
	
	
	System.out.println(in.readInt());
	System.out.println(in.readBoolean());

	System.out.println(in.readChar());

	System.out.println(in.readDouble());
	in.close();
	file.close();

}
}
