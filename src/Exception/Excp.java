package Exception;

public class Excp {

	public static void main(String[] args) {

		int a = 0;
		
			try {
				a = 5 / 0;
			} catch (ArithmeticException e) {
				System.out.println("Caught an Arithmetic Exception");
				a = 10 / 1;
				//System.exit(0);
			} catch (Exception e) {
				System.out.println("Got An Exception");
			} 
			finally {

				System.out.println("Aradhya Signing off, a=" + a);
			}
		
	}

}
