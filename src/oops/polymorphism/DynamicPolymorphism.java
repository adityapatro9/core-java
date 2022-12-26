package oops.polymorphism;

class A{
	void noise() {
		System.out.println("This is bad Noise");
	}
}

class B extends A{
	@Override
	void noise() {
		System.out.println("This is good Noise");
	}
}

public class DynamicPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A b=new B();
		A a=new A();
		
		b.noise();
		a.noise();
	}

}
