import java.util.*;
public class Square {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		int num;
		int square=0;
		System.out.print("Enter the number: ");
		num= input.nextInt();
		for(int i=0; i<num; i++) {
			square+=num;
		}
		System.out.print("The square of the number is: "+square);

	}

}
