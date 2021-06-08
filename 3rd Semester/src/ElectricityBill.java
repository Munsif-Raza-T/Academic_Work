import java.util.*;
public class ElectricityBill {

	public static void main(String[] args) {
	
		int units;
		int rate=0;
		int temp;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of units consumed: ");
		units=input.nextInt();
		if(units>300) {
			temp = units-300;
			rate+=temp*30;
			units=300;
		}
		if(units>200 && units<=300) {
			temp = units-200;
			rate+=temp*25;
			units=200;
		}
		if(units>100 && units<=200) {
			temp = units-100;
			rate+=temp*20;
			units=100;
		}
		if(units>50 && units<=100) {
			temp = units-50;
			rate+=temp*15;
			units=50;
		}
		if(units>0 && units<=50) {
			rate+=units*10;
			units=0;
		}
		System.out.print("The Electricity bill is: "+rate);
		
		
	}
}
