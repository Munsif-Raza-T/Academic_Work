package Practice;

public class Test2 {

	public static void main(String[] args) {
		try {
			int a = 20/0;
		}catch(Exception e)
		{
			
			System.out.println(e.getMessage());
		}

	}

}
