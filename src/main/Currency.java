package main;

public class Currency implements Expression {
	
	protected int amount;
	protected String currency;
	
	public Currency(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public boolean equals(Object object) {
		Currency value = (Currency) object;
		return amount == value.amount && currency().equals(value.currency());
	}
	
	public Expression times(int multiplier) {
		return new Currency(amount * multiplier, currency);	
	}

	
	public static Currency dollar(int amount) {
		return new Currency(amount, "USD");
	}
	
	public static Currency franc(int amount) {
		return new Currency(amount, "CHF");
	}
	
	public String currency() {
		return currency;
	}

	public Expression plus(Expression addend) {
		return new Sum(this, addend);
	}
	
	public Currency reduce(Exchange bank, String to) {
		int rate = bank.rate(currency, to);
		return new Currency(amount / rate, to);
	}
	
	
	

}
