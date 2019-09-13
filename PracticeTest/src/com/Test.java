package com;

public class Test {

	public static void main(String[] args) {
		
		
		int[] arr = new int[]{3,2,8,6,7,6};
		
		int max = 0, smax = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
					if(max < arr[i]) {
						smax = max;
						max = arr[i];
					}
					
					if(smax < arr[i] && max > arr[i]) {
						smax = arr[i];
					}
		}
		
		
		System.out.println("Max is " + max);
		System.out.println("Smax is " + smax);
	}
}
