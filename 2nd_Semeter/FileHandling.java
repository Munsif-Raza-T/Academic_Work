package Practice;
import java.io.*;

public class FileHandling {

	public static void main(String[] args)throws IOException {
		BufferedWriter fout=new BufferedWriter(new FileWriter("F:/Munsif.txt"));
		fout.write("Munsif is the boss of his life");
		fout.close();
		File f=new File("F:/Munsif.txt");
		System.out.println("Does file exist? "+f.exists());
		FileOutputStream ff= new FileOutputStream(f,true);
		String s=" And he can do anything that he want to do in his life.";
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			ff.write(arr[i]);
		}
		ff.close();

	}

}
