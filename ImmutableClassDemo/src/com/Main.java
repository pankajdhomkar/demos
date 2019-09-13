package com;

public class Main {
	public static void main(String [] args){
		ImmutableClass obj = new ImmutableClass("Test", 12);
		
		System.out.println("Name is "+ obj.getName());
		System.out.println("Register no is "+ obj.getId());
		
//		obj.regNo = 123;
	}
}
