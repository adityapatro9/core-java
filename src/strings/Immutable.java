package strings;

final class Bank {
	final float interestRate;

	public Bank(float interestRate) {
		super();
		this.interestRate = interestRate;
	}

	public float getInterestRate() {
		return interestRate;
	}

}

public class Immutable {

	public static void main(String[] args) {

		Bank b1 = new Bank(7.5f);
		System.out.println(b1.getInterestRate());

	}

}
