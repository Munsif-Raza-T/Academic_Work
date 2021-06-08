import java.util.Scanner;

public class Area {
    private int length;
    private int breadth;

    public void setDim(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Area rectangle = new Area();
        Scanner input = new Scanner(System.in);
        int l,b;
        System.out.print("Enter the length of Rectangle: ");
        l = input.nextInt();
        System.out.print("Enter the breadth of Rectangle: ");
        b = input.nextInt();
        rectangle.setDim(l,b);
        System.out.println("Area of the Rectagnle is: "+rectangle.getArea());
    }
}
