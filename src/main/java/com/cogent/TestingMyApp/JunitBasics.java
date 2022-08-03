package com.cogent.TestingMyApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.cogent.MyApp.*;



public class JunitBasics {

	BusinessLogic c = new BusinessLogic();
	BusinessLogic2 d = new BusinessLogic2();
	
	
	@DisplayName("TestingBusinessLogic2Method")
	@Test
	public void test3() {
		String message = "Method Successful";
		show(message);
		assertEquals(message, d.method(1));
	}
	
	private void show(String message) {
		System.out.println(message);
		
	}

	@DisplayName("TestingProcess")
	@Test
	public void test1() {
		String message = "success";
		System.out.println("Hello");
		assertEquals(message, c.process());
	}
	
	@DisplayName("TestingBusinessLogic2")
	@Test
	public void test2() {
		int res = 3;
		assertEquals(res, c.bL2());
	}
	
	@After
	public void afterSetting() {
		System.out.println("this will get excecuted after  test ");
	}
	
	@Before
	public void breforeSetting() {
		System.out.println("this will get excecuted Before  test ");
	}
}
