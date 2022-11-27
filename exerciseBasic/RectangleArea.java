package exerciseBasic;
//Write a Java program to enter length and breadth of a rectangle and find its area.
public class RectangleArea {
	int l=2;
	int b=4;
	void area() {
		int  a=l*b;
		System.out.println(a);
	}
public static void main(String[] args) {
	RectangleArea s=new RectangleArea();
	s.area();
}
}
