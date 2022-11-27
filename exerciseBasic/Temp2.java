package exerciseBasic;
//Write a Java program to enter temperature in Fahrenheit(°F) and convert it into Celsius(°C)
public class Temp2 {
	int Fahrenheit= 54;
	void convert(){
		Float Celsius = ((Fahrenheit-32)*5)/9f; 
		
	}
			public static void main(String[] args) {
				Temp2 t=new Temp2();
				t.convert();
			}
}
