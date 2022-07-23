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
		Currency value = Currency.franc(10);
		assertEquals(Currency.franc(10), value.times(1));
		assertEquals(Currency.franc(100), value.times(10));
	}
	
	@Test
	public void dollarEqualityTest() {
		assertTrue(Currency.dollar(5).equals(Currency.dollar(5)));
		assertFalse(Currency.dollar(5).equals(Currency.dollar(6)));
	}
	
	@Test
	public void francEqualityTest() {
		assertTrue(Currency.franc(15).equals(Currency.franc(15)));
		assertFalse(Currency.franc(2).equals(Currency.franc(16)));
	}
	
	@Test
	public void compareDollarsToFrancs() {
		assertFalse(Currency.dollar(5).equals(Currency.franc(5)));
	}
	
	@Test
	public void currencyTest() {
		assertEquals("USD", Currency.dollar(1).currency());
		assertEquals("CHF", Currency.franc(1).currency());
	}
}
