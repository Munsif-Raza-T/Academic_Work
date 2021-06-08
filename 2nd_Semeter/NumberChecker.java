package Practice;
import java.util.*;

public class NumberChecker {
	
	private int number;
	Scanner input = new Scanner(System.in);
	
	public void getnumber() {
		System.out.print("Enter the Number: ");
		number = input.nextInt();
		
	}
	
	public void checknumber() {
		if(number<0) {
			System.out.println(number+ " is a -ve number");
		}
		else if(number>0) {
			System.out.println(number+ " is a +ve number");
		}
		else if(number==0) {
			System.out.println("It is Zero.");
		}
		else {
			System.out.println("It is a wrong entry");
		}
	}

	public static void main(String[] args) {
		
		NumberChecker num = new NumberChecker();
		num.getnumber();
		num.checknumber();
	}

}
