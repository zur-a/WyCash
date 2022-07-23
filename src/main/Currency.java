package main;

public abstract class Currency {
	
	protected int amount;
	protected String currency;
	
	public Currency(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public boolean equals(Object object) {
		Currency value = (Currency) object;
		return amount == value.amount && getClass().equals(value.getClass());
	}
	
	public abstract Currency times(int multiplier);
	
	public static Currency dollar(int amount) {
		return new Dollar(amount, "USD");
	}
	
	public static Currency franc(int amount) {
		return new Franc(amount, "CHF");
	}
	
	public String currency() {
		return currency;
	}

}
