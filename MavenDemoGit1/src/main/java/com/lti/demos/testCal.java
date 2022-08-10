package com.lti.demos;

public class testCal {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		String msg = c.sayHello();
		System.out.println(msg);
		
		int sum = c.addnos(100,200);
		System.out.println(sum);

	}

}
