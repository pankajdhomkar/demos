package com;

public abstract class Plan {
	protected double rate;
	
	void getRate(){}
	
	public void calculateBill(int units){
		System.out.println("Bill is "+ (units * rate));
	}
}
