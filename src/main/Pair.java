package main;

public class Pair {
	private String from;
	private String to;
	
	public Pair(String from, String to) {
		this.from = from;
		this.to = to;
	}
	
	public boolean equals(Object object) {
		Pair pair = (Pair) object;
		return from.equals(pair.from)&&to.equals(pair.to);
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
		return result;
	}
}
