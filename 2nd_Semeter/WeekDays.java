package Practice;
import java.util.*;

public class WeekDays {
	
	private int number;
	Scanner input = new Scanner(System.in);

	public void getNum() {
		System.out.print("Enter the number for week day: ");
		number = input.nextInt();
	}
	
	public void show() {
		switch(number) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Number");
		}
	}
	public static void main(String[] args) {
	
		WeekDays day = new WeekDays();
		day.getNum();
		day.show();

	}

}
