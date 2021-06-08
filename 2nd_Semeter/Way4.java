package Practice;

public class Way4 {

	public static void main(String[] args) {
		int balance=200;
		int withdraw=500;
		try {
			if(balance<withdraw)
				throw new ArithmeticException("Insufficient Balance");
			balance-=withdraw;
			System.out.println("With draw succesful");
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program Ended");
	}

}
