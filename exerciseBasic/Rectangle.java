package exerciseBasic;
//Write a Java program to enter length and breadth of a rectangle and find its perimeter
public class Rectangle {
	int l=2;
	int b=4;
	void rectangleperimeter() {
		int p = 2*(l+b);
		System.out.println(p);
	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.rectangleperimeter();
	}

}
