package oops;

class Bird {
	String featureType;
	float height;

	public Bird(String featureType, float height) {
		this.featureType = featureType;
		this.height = height;
	}

	void eat() {
		System.out.println("The Bird Eats");
	}

	void fly() {
		System.out.println("The Bird Flys");
	}
}

class Swan extends Bird {
	static String name = "Swan";

	Swan(String featureType, float height) {
		super(featureType, height);
		System.out.println("Swan was Constructed");
	}

	void noise() {
		System.out.println("It makes the noise of swan");
	}

}

public class Single {

	public static void main(String[] args) {

		Swan s = new Swan("Swan white type", 3.6f);
		s.noise();
		s.eat();
		s.fly();
	}

}
