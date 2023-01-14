package Exception;

public class Trycatch {
	
	public static void dual() {
		
		String s=null;
		char c=s.charAt(2);
		System.out.println(c);
	}

	public static void main(String[] args) throws ArithmeticException {
		int a=10/0;
		System.out.println();
		
		try {
			dual();
		}catch(NullPointerException e) {
			System.out.println("Sorry There was a null");
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
