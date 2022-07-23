package main;

public class Currency {
	
	protected int amount;
	
	public Currency(int amount) {
		this.amount = amount;
	}

	public boolean equals(Object object) {
		Currency value = (Currency) object;
		return amount == value.amount && getClass().equals(value.getClass());
	}
	
	public Currency times(int multiplier) {
		return new Currency(amount * multiplier);
	}

}
