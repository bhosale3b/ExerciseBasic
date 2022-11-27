package exerciseBasic;

public class TwoNoSum {
      int a=10;
	  int b=4;
	  void addition() {
		  int result =a+b;
		  System.out.println(result);
	  }
	  void sub() {
		  int result =a-b;
		  System.out.println(result);
	  }
	  void mul() {
		  int result =a*b;
		  System.out.println(result);
	  }
	  void div() {
		  int result =a/b;
		  System.out.println(result);
	  }
	  void mod() {
		  int result =a%b;
		  System.out.println(result);
	  }
	public static void main(String[] args) {
      TwoNoSum s=new TwoNoSum();
      s.addition();
      s.sub();
      s.mul();
      s.div();
      s.mod();
	}

}
