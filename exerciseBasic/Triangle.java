package exerciseBasic;

import java.util.Scanner;

//Write a Java program to enter two angles of a triangle and find the third angle.
public class Triangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter the angle");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c= 180-(a+b);
		System.out.println(c);
		

}
}