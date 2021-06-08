package Practice;
import java.util.*;

public class Alphabetics {

	private String ch;
	Scanner in = new Scanner(System.in);
	
	public void getChar() {
		System.out.print("Enter the Character: ");
		ch = in.next();
		if(ch.length()>1) {
			System.out.println("Invalid Entry");
			getChar();
		}
	}
	
	public void check() {
		
		if(ch=="a"||ch=="e"||ch=="i"||ch=="o"||ch=="u"||ch=="A"||ch=="E"||ch=="I"||ch=="O"||ch=="U") {
			System.out.println(ch+" is a vowel letter");
		}
		else {
			System.out.println(ch+" is a consonent letter");
		}
			
	}
	public static void main(String[] args) {
		
		Alphabetics ob = new Alphabetics();
		ob.getChar();
		ob.check();

	}

}
