package main;

public class Franc extends Currency {

	public Franc(int amount) {
		super(amount);
	}
	
	public Currency times(int multiplier) {
		return new Franc(amount * multiplier);	
	}

}
