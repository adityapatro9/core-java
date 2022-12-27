package oops;

class PrimeMinister {
	String HeadofStatename;
	int age;

	public PrimeMinister(String name, int age) {
		this.HeadofStatename = name;
		this.age = age;
	}

	void speech() {
		System.out.println("Welcome my brothers and sisters");
	}
}

class DefenceMinistry extends PrimeMinister {
	int armynumber;
	int divisions;

	public DefenceMinistry(String name, int age, int armynumber, int divisions) {
		super(name, age);
		this.armynumber = armynumber;
		this.divisions = divisions;
	}

	void startAttack() {
		System.out.println("Start the Attack Soldiers");
	}

}

class FinanceMinistry extends PrimeMinister {
	float totalBudgut;

	void expenditure() {
		System.out.println("The Expenditry is = " + totalBudgut);
	}

	public FinanceMinistry(String name, int age, float totalBudgut) {
		super(name, age);
		this.totalBudgut = totalBudgut;
	}

}

public class heirarchy {

	public static void main(String[] args) {
		DefenceMinistry d = new DefenceMinistry("Arya", 21, 50000, 5);
		d.speech();
		d.startAttack();

		FinanceMinistry f = new FinanceMinistry("Aradhya", 21, 34567f);
		f.expenditure();
	}

}
