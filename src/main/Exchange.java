package main;

public class Exchange {
	
	public Currency reduce(Expression source, String to) {
		return source.reduce(to);
	}

}
