package tasks;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExcepTest {

	   public static void main(String args[]) {
		   //ArrayIndexOutOfBoundsException
	      try {
	         int a[] = new int[2];
	         System.out.println("Access element three :" + a[3]);
	      } catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println("Exception thrown  :" + e);
	      }
	      int c = 1; 
	        int b = 0; 
	         // ArithmeticException
	        try
	        { 
	            int i = c/b; 
	          
	        } 
	        catch(ArithmeticException ex) 
	        { 
	            System.out.println(ex.getMessage()); 
	        }
	        
	        FileReader fr = null;	
	        //IOException
	        try {
	           File file = new File("file.txt");
	           fr = new FileReader(file); char [] a = new char[50];
	           fr.read(a);   // reads the content to the array
	           for(char d : a)
	           System.out.print(c);   // prints the characters one by one
	        } catch (IOException e) {
	           e.printStackTrace();
	        }
	     
	   }
	}