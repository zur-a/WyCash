package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Dollar;

public class ArithmeticTest {

	@Test
	public void multiplicationTest() {
		Dollar value = new Dollar(5);
		assertEquals(new Dollar(10), value.times(2));
		assertEquals(new Dollar(125), value.times(25));
	}
	
	@Test
	public void equalityTest() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
	
	

}
