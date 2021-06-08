import java.util.*;

public class Table {

	public static void main(String[] args) {
	
		int table,starting,ending;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number for the table: ");
		table=input.nextInt();
		System.out.print("Enter the starting number: ");
		starting=input.nextInt();
		System.out.print("Enter the ending number: ");
		ending=input.nextInt();
		
		for(int i=starting; i<=ending; i++ ) {
			System.out.println(table+"*"+i+" = "+(table*i));
		}
		
	}

}
