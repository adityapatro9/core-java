package oops;

public class SleepOperation {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(9000);
			System.out.println("After Sleep");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
