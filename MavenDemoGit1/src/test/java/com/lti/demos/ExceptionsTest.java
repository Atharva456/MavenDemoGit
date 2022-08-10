package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionsTest {

	@Test
	void testExceptions() {
		
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> {Integer.parseInt("one");});
		
		//Integer.parseInt("One");
	}		
    @Test
    public void testmethodExp() {
    	Calculator c = new Calculator();
    	final Exception e = assertThrows(ArithmeticException.class,
    			() -> {c.searchExp(0);});
    	Assertions.assertEquals("You entered zero", e.getMessage());
    }
		

}