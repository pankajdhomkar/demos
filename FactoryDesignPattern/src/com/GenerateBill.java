package com;

public class GenerateBill {
	public static void main(String[] args) {
		GetPlanFactory planGet = new GetPlanFactory();

		Plan n = planGet.getPlan("DOMESTICPLAN");
		int unit = 33;
		System.out.println("Bill amount for "+n+" of  "+unit+" units is: ");

		n.getRate();  
		n.calculateBill(unit);  
	}

}
