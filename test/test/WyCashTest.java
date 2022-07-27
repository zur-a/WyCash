package test;

import static org.junit.Assert.*;

import org.junit.Test;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import main.Currency;
import main.Expression;
import main.Exchange;
import main.Sum;

public class WyCashTest {

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
	public void sameCurrencyAditionTest() {
		Currency value = Currency.dollar(5);
		Expression sum = value.plus(value);
		Exchange bank = new Exchange();
		Currency reduced = bank.reduce(sum, "USD");
		assertEquals(Currency.dollar(10), reduced);
	}
	
	@Test
	public void differentCurrencyAditionTest() {
		Expression sevenDollars = Currency.dollar(7);
		Expression sixFrancs = Currency.franc(6);
		Exchange bank = new Exchange();
		bank.addRate("CHF", "USD", 2);
		Currency result = bank.reduce(sevenDollars.plus(sixFrancs), "USD");
		assertEquals(Currency.dollar(10), result);
	}
	
	@Test
	public void plusMustReturnsSum() {
		Currency value = Currency.dollar(5);
		Expression result = value.plus(value);
		Sum sum = (Sum) result;
		assertEquals(value, sum.augend);
		assertEquals(value, sum.addend);
	}
	
	@Test
	public void reduceSumTest() {
		Expression sum = new Sum(Currency.dollar(2), Currency.dollar(3));
		Exchange bank = new Exchange();
		Currency result = bank.reduce(sum, "USD");
		assertEquals(Currency.dollar(5), result);
	}
	
	@Test
	public void reduceCurrencyTest() {
		Exchange bank = new Exchange();
		Currency result = bank.reduce(Currency.dollar(1), "USD");
		assertEquals(Currency.dollar(1), result);
	}
	
	@Test
	public void reduceDifferentCurrencyTest() {
		Exchange bank = new Exchange();
		bank.addRate("CHF", "USD", 2);
		Currency result = bank.reduce(Currency.franc(2), "USD");
		assertEquals(Currency.dollar(1), result);
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
