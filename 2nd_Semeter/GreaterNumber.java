package Practice;
import java.util.*;

public class GreaterNumber {
	
	private int a,b,c;
	Scanner input = new Scanner(System.in);
	
	public void getNumbers() {
		System.out.print("Enter Number 1: ");
		a = input.nextInt();
		System.out.print("Enter Number 2: ");
		b = input.nextInt();
		System.out.print("Enter Number 3: ");
		c = input.nextInt();
	}
	
	public void check() {
		if(a>b&&a>c) {
			System.out.println(a+" is the largest number");
		}
		else if(b>a&&b>c) {
			System.out.println(b+" is the largest number");
		}
		else {
			System.out.println(c+" is the largest number");
		}
	}

	public static void main(String[] args) {
		
		GreaterNumber ob = new GreaterNumber();
		ob.getNumbers();
		ob.check();
		
	}

}
