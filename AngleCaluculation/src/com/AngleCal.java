package com;

public class AngleCal {
	
	public int calAngle(int hourHand, int minHand){
		if(hourHand < 0 || minHand < 0 || hourHand > 12 || minHand > 60){
			System.out.println("Wrong Inputs");
		}
		
		if(minHand == 60) minHand = 0;
		if(hourHand == 12) hourHand = 0;
		
		int hour_angle = (int) (0.5 * (hourHand * 60 + minHand));
		int min_angle = (int)(6 * minHand);
		//Difference between hour and min hand
		int angle = Math.abs(hour_angle - min_angle);
		
		angle = Math.min(360 - angle, angle);
		return angle;
	}
	
	public static void main(String[] args) {
		AngleCal obj = new AngleCal();
		
		System.out.println("Angle is " + obj.calAngle(12, 30));
		System.out.println("Angle is " + obj.calAngle(2, 30));
		System.out.println("Angle is " + obj.calAngle(1, 5));
		System.out.println("Angle is " + obj.calAngle(4, 48));
	}
}
