package oops.polymorphism;

public class StaticPolymorphism {
	
	public static float area(int l,int h) {
		return (float) (0.5*l*h);
	}
	
	public static int area (int n) {
		return n*n;
	}
	
	public static float area(float l,float b) {
		return l*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(area(10,20));
		System.out.println(area(12));
		System.out.println(area(23.5f,34.3f));

	}

}
