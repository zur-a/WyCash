package main;

public interface Expression {

	Currency reduce(Exchange bank, String to);

	Expression plus(Expression addend);

}
