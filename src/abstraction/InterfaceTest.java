package abstraction;

interface Oneplus {
	String name = "Oneplus";
	abstract String ux();
}

interface Samsung {
	String name = "Samsung";
	abstract String ux();
}

class Smartphone implements Oneplus, Samsung {

	@Override
	public String ux() {
		return "Oxygen UI";
	}
	
}

public class InterfaceTest {
	public static void main(String[] args) {

		Smartphone sm = new Smartphone();
		System.out.println(sm.ux());
		// System.out.println(sm.name); //Compilation error, ambiguous  
		System.out.println();
	}
}
