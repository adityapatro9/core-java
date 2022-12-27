package oops;

public class StaticPolymorphism {
	
	public static void print(Object o) {
		System.out.println("Object method called");
	}
	
	public static void print(Integer o) {
		System.out.println("Integer method called");
	}
	
	public static float area(int l,int h) {
		return (float) (0.5*l*h);
	}
	
	public static int area (int n) {
		return n*n;
	}
	
	public static float area (float n) {
		return n*n;
	}
	
	public static float area(float l,float b) {
		return l*b;
	}
	
	public static float area(float l,int b) {
		return l*b;
	}

	public static void main(String[] args) {
		
		System.out.println(area(10,20));
		System.out.println(area(12));
		System.out.println(area(23.5f,34.3f));
		print(5.9);

	}

}
