package Practice;

public class Way3 {
	
	public static void wd() throws ArithmeticException {
		int balance=200;
		int withdraw=500;
		try {
			if(balance<withdraw)
				throw new ArithmeticException("Insufficient Balance");
			balance-=withdraw;
			System.out.println("With draw succesful");
		}
		finally {
			System.out.println("Program end");
		}

	}
	
public static void main(String[] args) {
		
wd();
	

}
}
