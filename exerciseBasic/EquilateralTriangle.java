package exerciseBasic;

import java.util.Scanner;

//Write a Java program to calculate area of an equilateral triangle.
public class EquilateralTriangle {
	public static void main(String[] args) {
		System.out.println("Enter the side");
		Scanner sc = new Scanner(System.in);
		double a =sc.nextDouble();
		double area = ( 1.73 * a*a) / 4 ;;
		System.out.println(area);
		
	}

}
