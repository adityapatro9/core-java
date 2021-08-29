package assignments;

public class CurrencyConverter {
	int rupee = 63;
	int dirham = 3;
	int real = 3;
	int chilean_peso = 595;
	int mexican_peso = 18;
	int _yen = 107;
	int $australian = 2;
	int dollar;
	int Rupee = 63;

	void printCurrencies() {

		System.out.println("rupee: " + rupee);
		System.out.println("dirham: " + dirham);
		System.out.println("real: " + real);
		System.out.println("chilean peso " + chilean_peso);
		System.out.println("mexican peso: " + mexican_peso);
		System.out.println("yen: " + _yen);
		System.out.println("australian: " + $australian);
		System.out.println("dollar: " + dollar);
		System.out.println("Rupee: " + Rupee);

	}

	public static void main(String[] args) {
		CurrencyConverter cc = new CurrencyConverter();
		cc.printCurrencies();
	}

}
