package main;

public class Franc {
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Franc(int amount) {
		this.amount = amount;
	}

	public Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}
	
	public boolean equals(Object object) {
		Franc value = (Franc) object;
		return amount == value.amount;
	}
}
