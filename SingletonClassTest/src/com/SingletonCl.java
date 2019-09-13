package com;
//Normal Singleton class without handling a any drawbacks
public class SingletonCl {
	private static SingletonCl object = null;
	
	public String s;
	
	//private con
	private SingletonCl(){
		s = "singleton without handling drawbacks";
	}
	
	// static method to create instance of Singleton class 
	public static SingletonCl singleton(){
		if(object == null){
			object = new SingletonCl();
		}
		return object; 
	}
}
