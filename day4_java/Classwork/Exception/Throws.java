package com.coforge.day4_java.Classwork.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;


public class Throws {
	public static void read() throws FileNotFoundException {
	
		FileReader fr = new FileReader("demo.txt");
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
//		int a = 10 / 0;  //unchecked exception (your wish to handle it)
		
//		FileReader fr = new FileReader("demo.txt"); // checked exception (must be handled)
		try {
			  Throws.read();
		}catch(Exception e) {
			
		}
	}
}
