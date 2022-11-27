package exerciseBasic;

//Write a Java program to enter any number and calculate its square root.

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
       
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		double a=sc.nextInt();
	    double b;
		b=Math.sqrt(a);
		System.out.println(b);
		
		
		
	
}
}