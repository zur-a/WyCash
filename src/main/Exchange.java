package main;

public class Exchange {
	
	public Currency reduce(Expression source, String to) {
		Sum sum = (Sum) source;
		return sum.reduce(to);
	}

}
