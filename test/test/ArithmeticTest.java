package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Dollar;
import main.Franc;

public class ArithmeticTest {

	@Test
	public void dollarMultiplicationTest() {
		Dollar value = new Dollar(5);
		assertEquals(new Dollar(10), value.times(2));
		assertEquals(new Dollar(125), value.times(25));
	}
	
	@Test
	public void francMultiplicationTest() {
		Franc value = new Franc(10);
		assertEquals(new Franc(10), value.times(1));
		assertEquals(new Franc(100), value.times(10));
	}
	
	@Test
	public void equalityTest() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
	
	

}