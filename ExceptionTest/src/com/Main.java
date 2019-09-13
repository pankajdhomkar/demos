package com;

public class Main {
	public static void main(String [] args) throws Exception{
		TestB obj = new TestB();
		try{
			System.out.println("Call the class");
			obj.display();
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Catch the exception..."+e);
		}
		
	}
}
