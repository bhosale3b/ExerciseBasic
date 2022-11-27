package exerciseBasic;
//Write a Java program to enter length in centimeter and convert it into meter and kilometer.
public class Length {
	int l=1;
	void convert() {
		double a =0.01*l;
		int b= l/100000;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Length L = new Length();
		L.convert();
	}

}
