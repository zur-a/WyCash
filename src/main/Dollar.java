package main;

public class Dollar extends Currency {

	public Dollar(int amount) {
		super(amount);
	}

	public Currency times(int multiplier) {
		return new Dollar(amount * multiplier);	
	}

}
