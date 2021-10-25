package com.nology;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		//ONE DOG YEAR IS 7 HUMAN YEARS
        final byte DOG_YEAR = 7;
	Scanner myScan = new Scanner(System.in);
//
//	System.out.println("What is your name??" );
//	String input = myScan.nextLine();
//
//	System.out.println("Hi, " + input + " let's find your age in dog years!");
//	System.out.println("How old are you?" );
//	byte myAge = myScan.nextByte();
//
//	int dogYears = DOG_YEAR * myAge;
//	int yearsDiff = dogYears - myAge;
//
//	System.out.println("Your age in dog years is " + dogYears + "! How about that!?");
//	System.out.println("That is a massive difference of " + yearsDiff + " dog years! Feeling young again I bet!" );


//		Get 3 numbers from the user
//		Print "n is the largest", n being the largest of the 3 inputs

//		System.out.println("Please input three numbers line by line");

//		int n1 = myScan.nextInt();
//		int n2 = myScan.nextInt();
//		int n3 = myScan.nextInt();
//
//		if(n1 > n2 && n1 > n3) {
//			System.out.print(n1 + " Is the largest number");
//		} else if(n2 > n1 && n2 > n3) {
//			System.out.print(n2 + " Is the largest number");
//		} else {
//			System.out.print(n3 + " Is the largest number");
//		}



		System.out.println("Please input the amount of numbers to input");
		int numLines = myScan.nextInt();
		int a, b, c;
		System.out.println("Please input three numbers line by line");
		for (int i = 0; i < numLines; i++) {
			a = myScan.nextInt();
			b = myScan.nextInt();
			c = myScan.nextInt();

			if (a > b && a > c) {
				System.out.print(a + " Is the largest number");
			} else if (b > a && b > c) {
				System.out.print(b + " Is the largest number");
			} else {
				System.out.print(c + " Is the largest number");
			}
		}
    }
}
