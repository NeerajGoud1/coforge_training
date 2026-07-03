package com.coforge.day3_java;

public class StudentApp {
	public static void main(String[] args) {
		Student neeraj = new Student();
		neeraj.setSid(101);
		neeraj.setSname("Neeraj");
		neeraj.setEmail("neeraj@gmail.com");
		
		System.out.println(neeraj);
	}

}
