package com.coforge.day3_java.Assignment;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(reverse(1234));
		
	}
	
	static boolean evenOdd(int n) {
		return n % 2 == 0;
	}
	
	static int largestOfThree(int a, int b, int c) {
		return Math.max(a,  Math.max(b, c));
	}
	
	static char gradeCalculator(int marks) {
		if(marks >= 90 && marks <= 100) {
			return 'A';
		}else if (marks >= 80 && marks <= 89) {
			return 'B';
		}else if(marks >= 70 && marks <= 79) {
			return 'C';
		}else if(marks >= 60 && marks <= 69) {
			return 'D';
		}else {
			return 'F';
		}
	}
	
	static void multiplicationTable(int n) {
		for(int i=1; i<=n; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}
	}
	
	static int sumOfN(int n) {
		return n * (n + 1) / 2;
	}
	
	static boolean primeOrNot(int n) {
		if (n <= 1) return false; 
		 
		for(int i=2; i<Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		
		return true;
	}
	
	static int reverse(int n) {
		int num = 0;
		
		while(n != 0) {
			num = num * 10 +(n % 10);
			n = n / 10;
		}
		
		return num;
	}
	
	
}
