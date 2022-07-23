package main;

public class Franc extends Currency {

	public Franc(int amount, String currency) {
		super(amount, currency);
	}
	
	public Currency times(int multiplier) {
		return Currency.franc(amount * multiplier);	
	}
}
