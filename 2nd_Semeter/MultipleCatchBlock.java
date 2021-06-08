package Practice;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 20/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithemtic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
	}

}
