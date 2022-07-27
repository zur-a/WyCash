package main;

public class Sum implements Expression {
	public Expression augend;
	public Expression addend;
	
	public Sum(Expression augend, Expression addend) {
		this.addend= addend;
		this.augend = augend;
	}
	
	public Currency reduce(Exchange bank, String to) {
		int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
		return new Currency(amount, to);
	}
}
