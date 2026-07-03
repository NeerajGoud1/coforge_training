package com.coforge.day3_java;

import java.util.Scanner;

public class FactorialTableApp {
	
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Limit : ");
        int n = sc.nextInt();

        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
            System.out.println("Factorial of " + i + " is " + fact);
        }
    }
}
