package assignment3;

import java.util.Scanner;

public class NegativetoPositive {

	public static void main(String[] args) {
	        int num;
	        int positiveNumber;

	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number: ");

	        num= sc.nextInt();

	        if (num < 0) {
	            positiveNumber = num* (-1);
	            System.out.println("Positive number: " + positiveNumber);
	        }
	    }
	}