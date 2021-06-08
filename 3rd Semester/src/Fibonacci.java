import java.util.*;
class Fibonacci{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input number of terms to display: ");
		int nums = scan.nextInt();
		int last=1;
		int front=1;
		int middle;
		System.out.println("Fibonacci Series: ");
		for(int i=0; i<nums; i++){
			
			System.out.print(front+" ");
			
			middle=front;
			front=last;
			last+=middle;
			
		}
	}
}