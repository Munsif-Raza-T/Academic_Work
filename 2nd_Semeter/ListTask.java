package Practice;
import java.util.*;

public class ListTask {
    private int listlength=0;
    private int[] list=new int[listlength];
    Scanner input=new Scanner(System.in);
    public void getTheSize() {
    	System.out.print("Enter the Size of the List: ");
    	listlength=input.nextInt();
    	for(int i=0; i<list.length;i++) {
    		list[i]=0;
    	}
    }
    public void getValues() {
    	System.out.println("Enter the Values the list: ");
    	for(int i=0; i<list.length; i++) {
    		System.out.println("Value for number "+(i+1)+": ");
    		list[i]=input.nextInt();
    	}
    }
    public void showList() {
    	System.out.print("List is: ");
    	for(int x: list) {
    		System.out.print(x+",");
    	}
    	System.out.println("");
    }
    public void greatestNumber() {
    	int greatestNumber=list[0];
    	for(int x:list) {
    		if(x>greatestNumber)
    			greatestNumber=x;
    	}
    	System.out.println("The greatest Number is: "+ greatestNumber);
    }
    public void leastNumber() {
    	int leastNumber=list[0];
    	for(int x:list) {
    		if(x<leastNumber)
    			leastNumber=x;
    	}
    	System.out.println("The least Number is: "+ leastNumber);
    }
    public void listSum() {
    	int sum=0;
    	for(int x:list) {
    		sum+=x;
    	}
    	System.out.println("Sum of the list is: "+ sum);
    }
    public void ascendingList() {
    	int temp=0;
    	for(int i=0; i<list.length; i++) {
    		temp=list[i];
    	    for(int x:list) {
    	    	if(temp>x)
    	    		temp=x;
    	    }
    	    list[i]=temp;
    	}
    	System.out.print("Ascending ");
    	showList();
    }
    public void descendingList() {
    	int temp=0;
    	for(int i=0; i<list.length; i++) {
    		temp=list[i];
    	    for(int x:list) {
    	    	if(temp<x)
    	    		temp=x;
    	    }
    	    list[i]=temp;
    	}
    	System.out.print("Descending ");
    	showList();
    }
    public void selection() {
    	int select=0;
        System.out.print("Select the Option:\n1)Show the list\n2)Sum of the list\n3)Greatest Number\n4)Least Number\n5)Ascending List\n6)Descending List\n7)Exit: ");
        select=input.nextInt();
        switch(select) {
        case 1:
        	showList();
        	selection();
        	break;
        case 2:
        	listSum();
        	selection();
        	break;
        case 3:
        	greatestNumber();
        	selection();
        	break;
        case 4:
        	leastNumber();
        	selection();
        	break;
        case 5:
        	ascendingList();
        	selection();
        	break;
        case 6:
        	descendingList();
        	selection();
        	break;
        case 7:
        	return;
        default:
        	System.out.println("Invalid Entry!");
        	selection();
        }

    }
    
    
	public static void main(String[] args) {
   ListTask obj=new ListTask();
   obj.getTheSize();
   obj.getValues();
   obj.selection();
	}

}
