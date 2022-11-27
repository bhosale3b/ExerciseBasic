package exerciseBasic;
//Write a Java program to enter P, T, R and calculate Simple Interest.
import java.util.Scanner;

public class SimpleInterst {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter principal vale");
		int p= sc.nextInt();
		System.out.println("Enter rate vale");
		int r= sc.nextInt();
		System.out.println("Enter time vale");
		int t= sc.nextInt();
		System.out.println("pls find out simple interest");
		int SI=(p*r*t)/100;
		System.out.println(SI);
		
	}

}
