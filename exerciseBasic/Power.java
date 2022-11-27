package exerciseBasic;

import java.io.InputStream;
import java.util.Scanner;

//Write a Java program to find power of any number x ^ y.

public class Power {
	int a,b,c;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=(int)Math.pow(a, b);
		System.out.println(c);
		
		
	}



	
}
