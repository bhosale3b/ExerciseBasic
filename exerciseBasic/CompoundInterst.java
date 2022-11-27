package exerciseBasic;

import java.util.Scanner;

public class CompoundInterst {
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter principal vale");
		int p= sc.nextInt();
		System.out.println("Enter rate vale");
		int r= sc.nextInt();
		System.out.println("Enter time vale");
		int t= sc.nextInt();
		System.out.println("pls find out compound interest");
		int CI= (int) (p * (Math.pow((1 + r / 100), t)));;
		System.out.println(CI);
		
	}

}
