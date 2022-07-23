package main;

public class Dollar extends Currency {

	public Dollar(int amount, String currency) {
		super(amount, currency);
	}

	public Currency times(int multiplier) {
		return Currency.dollar(amount * multiplier);	
	}
}
