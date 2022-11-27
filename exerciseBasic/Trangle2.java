package exerciseBasic;
//Write a Java program to enter base and height of a triangle and find its area.
import java.util.Scanner;

public class Trangle2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of traingle");
		int b=sc.nextInt();
		System.out.println("Enter the height of traingle");
		int h=sc.nextInt();
		int a=(h*b)/2;
		System.out.println("area of traingle");
		System.out.println(a);
	}
	

}
