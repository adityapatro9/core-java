package oops.abstraction;

interface engi{
	String name="XDragon";
	
	void start();
	void stop();
	void operate();
}

interface Wheels{
	int numberOfwheels=4;
	
	default void move() {
		System.out.println("The Wheels are Moving");
	}
	
	static void stopWheel() {
		System.out.println("The Wheels have stopped");
	}
}

interface seats{
	
	void quality();
}

class vehicle implements engi,Wheels,seats{

	@Override
	public void quality() {
		// TODO Auto-generated method stub
		System.out.println("Seats Quality is A1");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Engine was Started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		Wheels.stopWheel();
		System.out.println("The Engine was stopped");
	}

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		System.out.println("The Car is Functioning Smoothly");
	}
	
	@Override
	public void move() {
		System.out.println("The Wheels are moving for the Car");
	}
	
}

public class InterfacePrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle c=new vehicle();
		c.start();
		c.move();
		c.operate();
		//c.stopWheel();
		c.stop();
	}

}
