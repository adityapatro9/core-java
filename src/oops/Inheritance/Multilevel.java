package oops.Inheritance;

class Animal{
	
	void eat() {
		System.out.println("The Animal is Eating");
	}
}

class Aquatic extends Animal{
	void swim() {
		System.out.println("I am Swimming");
	}
}

class Fish extends Aquatic{
	void name() {
		System.out.println("I am A Fish");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		Fish f=new Fish();
		
		f.swim();
		f.eat();
		f.name();
	}

}
