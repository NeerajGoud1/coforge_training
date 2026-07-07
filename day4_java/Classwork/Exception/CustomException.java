package com.coforge.day4_java.Classwork.Exception;

import java.util.Scanner;

public class CustomException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age : ");
		int age = sc.nextInt();

//		if (age >= 18) {
//			System.out.println("Welcome to Vote");
//		} else {
//			try {
//				throw new InvalidAgeException("Age is less than 18");
//			} catch (InvalidAgeException e) {
//				System.out.println(e.message);
//			}
//		}
		
		if (age >= 18) {
			System.out.println("Welcome to Vote");
		} else {
			try {
				throw new InvalidAgeException();
			} catch (InvalidAgeException e) {
				System.out.println(e);
			}
		}
	}

}
