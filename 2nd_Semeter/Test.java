package Practice;

public class Test {

	public static void main(String[] args) {
		try {
			int a = 20/0;
		}catch(Exception e)
		{
			e.printStackTrace();
			
			System.out.println(e);
		}

	}

}
