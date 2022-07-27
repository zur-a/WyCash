package main;

import java.util.Hashtable;

public class Exchange {
	
	private Hashtable rates = new Hashtable();
	
	public Currency reduce(Expression source, String to) {
		return source.reduce(this, to);
	}
	
	public int rate(String from, String to) {
		Integer rate = (Integer) rates.get(new Pair(from, to));
		return rate.intValue();
	}

	public void addRate(String from, String to, int rate) {
		rates.put(new Pair(from, to), new Integer(rate));
	}

}
