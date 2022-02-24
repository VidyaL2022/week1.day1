package assignmentweek1;

import java.util.Scanner;

public class Sumofdigits {

		public static void main(String args[])  
		{  
		int num, d, s = 0;  
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		num = sc.nextInt();  
		while(num > 0)  
		{  
		//finds the last digit of the given number    
		d = num % 10;  
		//adds last digit to the variable sum  
		s = s + d;  
		//removes the last digit from the number  
		num = num / 10;  
		}  
		//prints the result  
		System.out.println("Sum of Digits: "+s);  
		}  

	}

