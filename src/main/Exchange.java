package main;

public class Exchange {
	
	public Currency reduce(Expression source, String to) {
		if(source instanceof Currency) 
			return (Currency) source.reduce(to);
		Sum sum = (Sum) source;
		return sum.reduce(to);
	}

}
