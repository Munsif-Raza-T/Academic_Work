package Practice;

public class CatchingMultipuleExceptions {

	public static void main(String[] args) {
		try {
			int x = 9/0;  //Throws ArithmeticException
			int a[] = new int[2];
			a[5] = 8;    //Throws ArrayIndexOutOfBoundsException
		}
		
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			
			e.printStackTrace();
			
			
		}
        System.out.println("rest of the code is executed");
	}

}
