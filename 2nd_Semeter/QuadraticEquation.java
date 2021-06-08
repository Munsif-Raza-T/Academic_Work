package Practice;
import java.util.*;

public class QuadraticEquation {
	
	private int a,b,c;
	Scanner input = new Scanner(System.in);
	
	public void getCoefficients() {
		System.out.print("Enter the value for a:");
		a = input.nextInt();
		System.out.print("Enter the value for b:");
		b = input.nextInt();
		System.out.print("Enter the value for c:");
		c = input.nextInt();
	}
	
	public void equation() {
		System.out.println(a+"x\u00B2+"+b+"x+"+c);
	}
	
	public void solution() {
		double num1;
		double num2;
		num1 = (b+(Math.sqrt(Math.pow(b,2)+(4*a*c))))/(2*a);
		num2 = (b-(Math.sqrt(Math.pow(b,2)+(4*a*c))))/(2*a);
		System.out.println("Required Solution set is {"+num1+","+num2+"}");
	}

	public static void main(String[] args) {
	
		QuadraticEquation eq = new QuadraticEquation();
		eq.getCoefficients();
		eq.equation();
		eq.solution();
		
	}

}
