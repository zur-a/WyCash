package main;

public abstract class Currency {
	
	protected int amount;
	
	public Currency(int amount) {
		this.amount = amount;
	}

	public boolean equals(Object object) {
		Currency value = (Currency) object;
		return amount == value.amount && getClass().equals(value.getClass());
	}
	
	public abstract Currency times(int multiplier);
	
	public static Currency dollar(int amount) {
		return new Dollar(amount);
	}

}
