package com.coforge.day4_java.Classwork.arrays_strings;

public class StringTest1 {
	public static void main(String[] args) {
		String s1 = "Neeraj";
		String s2 = new String("Neeraj");
		
		System.out.println(s1.equalsIgnoreCase(s2)); // content level comparison - true
		System.out.println(s1 ==  s2); //object level comparison - false 
		
		System.out.println(s1.length());
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		System.out.println(s1.charAt(1));
		
		System.out.println(s1.indexOf("e"));
		System.out.println(s1.lastIndexOf('e'));
		
		String s3 = s1.concat(" Kumar"); //Neeraj Kumar
		System.out.println(s1);
		
		System.out.println(s1.substring(2, 5)); //end not included
		System.out.println(s1.substring(2)); //substring is method overloaded method in string class
	}
}
