package main;

public class Sum implements Expression {
	public Currency augend;
	public Currency addend;
	
	public Sum(Currency augend, Currency addend) {
		this.addend= addend;
		this.augend = augend;
	}
	
	public Currency reduce(Exchange bank, String to) {
		int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
		return new Currency(amount, to);
	}
}
