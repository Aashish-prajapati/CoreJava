package com.rays.io;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class fr
{
public static void main(String[] args) throws Exception{
	
	FileReader reader =new FileReader("D:\\aashish.txt");
	int ch=reader.read();
	char chr;
	while(ch!=-1) {
		chr=(char)ch;
		System.out.print(chr);
		ch=reader.read();
		}
}
}
