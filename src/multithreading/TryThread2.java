package multithreading;

import java.util.concurrent.TimeUnit;

class thr implements Runnable{
	int c1=0;
	int c2=0;
	
	
	public void run() {
		while(true) {
			System.out.println(c1+"=="+c2);
			
			try {
				c1++;
				TimeUnit.MILLISECONDS.sleep(1000);
				c2++;
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getLocalizedMessage());
				break;
			}
		}
	}
}

public class TryThread2 {

	public static void main(String[] args) throws InterruptedException {
		thr t=new thr();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		
		t1.start();
		t2.start();
		
		TimeUnit.SECONDS.sleep(3);
		t1.interrupt();
		t2.interrupt();
		
		t1.wait();
		t2.wait();
		
		
		t1.setDaemon(true);
		t2.setDaemon(true);

	}

}
