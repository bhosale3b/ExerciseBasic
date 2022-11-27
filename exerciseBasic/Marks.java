package exerciseBasic;
//Write a Java program to enter marks of five subjects and calculate total, average and
//percentage.
import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter mark sub1");
		int a=sc.nextInt();
		System.out.println("enter mark sub2");
		int b=sc.nextInt();
		System.out.println("enter mark sub3");
		int c=sc.nextInt();
		System.out.println("enter mark sub4");
		int d=sc.nextInt();
		System.out.println("enter mark sub5");
		int e=sc.nextInt();
		System.out.println("total of marks");
		int t=a+b+c+d+e;
		System.out.println(t);
		System.out.println("average of subjects");
		int avg= t/5;
		System.out.println(avg);
		System.out.println("percentage of sub");
		int per=avg/100;
		System.out.println(per);
	}

}
