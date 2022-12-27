package oops;

abstract class Engine{
	String name="XDragon";
	
	abstract void start();
	abstract void stop();
	abstract void operate();
	void power() {
		System.out.println("100cc power");
	}
}



class Car extends Engine{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Engine was Started");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("The Engine was stopped");
	}

	@Override
	void operate() {
		// TODO Auto-generated method stub
		System.out.println("The Car is Functioning Smoothly");
	}
	
}


public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		
		c.start();
		c.operate();
		c.stop();
	}

}
