package com.coforge.day4_java.Classwork.arrays_strings;
import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		System.out.println("Enter 5 values");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("Sum of Array : " + sum);
		
	}
}
