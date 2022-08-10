package com.lti.demos;

public class Calculator {

	public String sayHello()
	{
		return "Hello World";
	}
	
	public int addnos(int x , int y)
	{
		int result = x + y ;
		return result;
		
	}
	
	public int subnos(int x , int y)
	{
		int result = x - y ;
		return result;
		
	}
	
	public void searchExp(int empId)
	{
		if(empId ==0) {
		
			throw new ArithmeticException("Entered Zero");
		}
		else
		{
			System.out.println("do something");
		}
		
	}
}

