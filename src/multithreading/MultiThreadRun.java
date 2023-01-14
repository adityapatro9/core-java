package multithreading;

class Count extends Thread {
	
	public void run(){  
		for (int i = 0 ; i <= 10; i++)
			System.out.println(Thread.currentThread().getName() + " - " + i);  
	} 
	
}

public class MultiThreadRun {

	public static void main(String[] args) {
		
		Count t1 = new Count();
		t1.setName("T1");
		Count t2 = new Count();
		t2.setName("T2");
		t2.setPriority(10);
		t1.setPriority(9);

		t1.start();
		t2.start();
	}

}
