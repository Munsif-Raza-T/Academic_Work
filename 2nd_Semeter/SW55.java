package Practice;

public class SW55 {
	
	int real;
	int imaginary;
	
	

	public SW55(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	
	public SW55 sum(SW55 temp) {
		temp.real+=this.real;
		temp.imaginary+=this.imaginary;
		return temp;
	}



	public static void main(String[] args) {
		
		SW55 ob1=new SW55(2,3);
		SW55 ob2=new SW55(5,-2);
		System.out.println("Before addition 1st number is: "+ob1.real+"+"+ob1.imaginary+"i");
		System.out.println("Before addition 2nd number is: "+ob2.real+"+"+ob2.imaginary+"i");
		SW55 ob3;
		ob3=ob1.sum(ob2);
		System.out.println("Sum is:"+ob3.real+"+"+ob3.imaginary+"i");
	}

}
