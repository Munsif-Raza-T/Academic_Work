package Practice;

class MyException extends Exception {
	int id;
	public MyException(int id) {
		super();
		this.id = id;
	}
	public String toString() {
		return "CustomException["+id+"]";
	}

}
public class Sample{
	static void compute(int a ) throws MyException {
		if(a> 10)
			throw new MyException(a);
		System.out.println("No error in prog. no exception caught");
	}
	public static void main(String[] args) {
		
		try {
			compute(5);
			compute(12);
		}catch(MyException e)
		{
			System.out.println(e.toString());
		}
	

	}

}

