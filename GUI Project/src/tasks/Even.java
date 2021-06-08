package tasks;

public class Even extends Thread {
	
	public static void main(String args[]){
		Runnable r1 = new Runnable3();
	    Thread t1 = new Thread(r1);
	    t1.start();
		
	}

}

class Runnable3 implements Runnable{
public void run(){
    for(int i=0; i<=50; i+=2) {
    	if(i==30) {
    		try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
        System.out.println(i);
    }
  }
}
