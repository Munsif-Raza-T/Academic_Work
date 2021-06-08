package Practice;

public class Way2 {

	public static void main(String[] args) {
	try
	{int a = 30/0;
	System.out.println(a);}
	catch(ArithmeticException e) {
		e.printStackTrace();
	}
	System.out.println("end statement");

	}

}