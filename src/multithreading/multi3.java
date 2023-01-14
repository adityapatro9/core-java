package multithreading;

class Multi3 implements Runnable{  
	public void run(){  
		System.out.println("thread is running...");  

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}  

	public static void main(String args[]){  
		Runnable m1=new Multi3();  
		Thread t1 =new Thread(m1, "T1");   // Using the constructor Thread(Runnable r)  
		t1.setPriority(1);
		t1.start();
	}  
}
