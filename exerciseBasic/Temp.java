package exerciseBasic;
//Write a Java program to enter temperature in °Celsius and convert it into °Fahrenheit
public class Temp {
	int celsius= 13;
	void convert() {
	int	fahrenheit =((celsius*9)/5)+32; 
	System.out.println(fahrenheit);
		
	}
	public static void main(String[] args) {
		Temp t= new Temp();
		t.convert();
	}
      

}
