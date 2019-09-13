package com;

//Immutable Class 
/*
 * Make class is final and make data member is final 
 **/
public final class ImmutableClass {
	final String Name;
	final int regNo;
	//final Address obj;
	
	public ImmutableClass(String name, int regNo) {
		super();
		Name = name;
		this.regNo = regNo;
	}
	
	public String getName(){
		return Name;
	}
	
	public int getId(){
		return regNo;
	}
	
	/*public void setName(String na){
		this.Name = na;
	}*/
	
}
