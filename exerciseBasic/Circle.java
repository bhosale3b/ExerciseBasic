package exerciseBasic;
//Write a Java program to enter radius of a circle and find its diameter, circumference and  area.
public class Circle {
	int r= 2;
	void circle() {
		double a= 3.14*r*r;
		int d = 2*r;
		double c = 2*3.14*r;
		System.out.println(a);
		System.out.println(d);
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		Circle c= new Circle();
		c.circle();
	}

}
