package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Dollar;

public class ArithmeticTest {

	@Test
	public void multiplicationTest() {
		Dollar value = new Dollar(5);
		Dollar result = value.times(2);
		assertEquals(10, result.getAmount());
		result = value.times(25);
		assertEquals(125, result.getAmount());
	}
	
	@Test
	public void equalityTest() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
	}

}
