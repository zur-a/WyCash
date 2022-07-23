package main;

public class Franc extends Currency {

	public Franc(int amount, String currency) {
		super(amount, currency);
	}
	
	public Currency times(int multiplier) {
		return new Currency(amount * multiplier, currency);	
	}
}
