import java.util.Scanner;

public class AreaC {
    private int length;
    private int breadth;

    public AreaC(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int returnArea(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l,b;
        System.out.print("Enter the length of Rectangle: ");
        l = input.nextInt();
        System.out.print("Enter the breadth of Rectangle: ");
        b = input.nextInt();
        AreaC rectangle = new AreaC(l,b);
        System.out.println("Area of the Rectagnle is: "+rectangle.returnArea());
    }
}
