package com.cogent.MyApp;

public class BusinessLogic {
	public String process() {
		String msg = "";

//		Business Logic
		msg = "success";
		
		return msg;
	}
	
	public int bL2() {
		
		int x = 1;
		int y = 3;
		
		//Business logic performing multiplication instead of addition/subtraction etc
		int result = x*y;
		return (result);
	}
}
