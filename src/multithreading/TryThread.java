package multithreading;

class th extends Thread{
	public void run() {
		
		for(int i=0;i<5;i++) {
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getLocalizedMessage());
			}
			
			System.out.println(this.currentThread().getName());
		}
	}
}

public class TryThread {

	public static void main(String[] args) {
		Thread t= new Thread(new th());
		t.setName("Thread-Arya");
		t.start();
	}

}
