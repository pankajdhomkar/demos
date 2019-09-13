package com;

public class Singleton implements Cloneable{
	// public instance initialized when loading the class 
	public static Singleton instance = new Singleton();
	
	private Singleton(){
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return instance;
	}
}
