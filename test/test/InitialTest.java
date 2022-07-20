package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Dollar;

public class InitialTest {

	@Test
	public void multiplicationTest() {
		Dollar dollar = new Dollar(5);
		dollar.times(2);
		assertEquals(15, dollar.amount);
	}

}
