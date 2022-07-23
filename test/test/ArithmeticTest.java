package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Currency;
import main.Dollar;
import main.Franc;

public class ArithmeticTest {

	@Test
	public void dollarMultiplicationTest() {
		Currency value = Currency.dollar(5);
		assertEquals(Currency.dollar(10), value.times(2));
		assertEquals(Currency.dollar(125), value.times(25));
	}
	
	@Test
	public void francMultiplicationTest() {
		Franc value = new Franc(10);
		assertEquals(new Franc(10), value.times(1));
		assertEquals(new Franc(100), value.times(10));
	}
	
	@Test
	public void dollarEqualityTest() {
		assertTrue(Currency.dollar(5).equals(new Dollar(5)));
		assertFalse(Currency.dollar(5).equals(new Dollar(6)));
	}
	
	@Test
	public void francEqualityTest() {
		assertTrue(new Franc(15).equals(new Franc(15)));
		assertFalse(new Franc(2).equals(new Franc(16)));
	}
	
	@Test
	public void compareDollarsToFrancs() {
		assertFalse(Currency.dollar(5).equals(new Franc(5)));
	}
	
	

}
