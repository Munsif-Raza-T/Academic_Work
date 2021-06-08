
public class StarPyramid {

	public static void main(String[] args) {
		// Code for Pyramid of stars
		for(int i=1;i<=5;i++){
			
			for(int j=0;j<5-i;j++){
				
                        System.out.print(" ");
                	}
                for(int j=0;j<(i*2)-1;j++){
                	
                        System.out.print("*");
                	}
               System.out.println();
        	}
		System.out.println("\n\n");
		
	// Code for Up side down Triangle of stars
		for (int i=0; i<5; i++)
        {
            for (int j=5; j>i; j--)
            {    
                System.out.print("*");
            }
            System.out.println("");
        }
		System.out.println("\n\n");
		
	//Code for Number Pyramid.
		int rows = 5, k = 0, count = 0, count1 = 0;

	    for (int i = 1; i <= rows; ++i) {
	      for (int space = 1; space <= rows - i; ++space) {
	        System.out.print("  ");
	        ++count;
	      }

	      while (k != 2 * i - 1) {
	        if (count <= rows - 1) {
	          System.out.print((i + k) + " ");
	          ++count;
	        } else {
	          ++count1;
	          System.out.print((i + k - 2 * count1) + " ");
	        }

	        ++k;
	      }
	      count1 = count = k = 0;

	      System.out.println();
	    }
	
		  }

		
	
	}

