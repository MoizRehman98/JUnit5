package com.cogent.TestingMyApp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.cogent.MyApp.NumberCalculations;

public class NumberCalculationTest {

	
	NumberCalculations addingLogic;
	
	@BeforeEach
	public void intialize() {
		addingLogic = new NumberCalculations();
	}
 	
//	@Test
//	public void testAdd() {
//		assertEquals(5, addingLogic.add(2, 3));
//	}
	
	
	//Testing Multiple tests together using nested class
	@Nested
	class TestingAllAdd {
		
		@Test
		public void testPlusMinus() {
			assertEquals(1, addingLogic.add(-2, 3));
		}
		
		@Test
		public void testPlusPLus() {
			assertEquals(5, addingLogic.add(2, 3));
		}
		
		@Test
		public void testMinusMinus() {
			assertEquals(-5, addingLogic.add(-2, -3));
		}
	}
	
	
	@Test
	public void testMultiply() {
		
		assertAll(
				() -> assertEquals(6, addingLogic.multiply(3, 2)),				
				() -> assertEquals(-6, addingLogic.multiply(-3, 2)),				
				() -> assertEquals(0, addingLogic.multiply(0, 2))
				);
	}
	
	@Test
	public void testdivide() {
		assertThrows("Divide should throw an error", ArithmeticException.class, () -> addingLogic.divide(1, 0));
	}
 	
	
}
