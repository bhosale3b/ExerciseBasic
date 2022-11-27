package exerciseBasic;

import java.util.Scanner;

//Write a Java program to convert days into years, weeks and days.

public class Days {
	public static void main(String[] args) {
		
	
	
 int a, year,day, week;
 
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the no of days");
 a=sc.nextInt();

 year= a/360;
 System.out.println("no of days :"+year);
 week= a/7;
 System.out.println("no of weeks :"+week);
 year= a/360;
 System.out.println("no of days :"+year);

 day= a;
 System.out.println("no of days :"+day);


	}
}
