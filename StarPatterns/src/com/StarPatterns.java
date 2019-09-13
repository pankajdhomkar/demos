package com;

public class StarPatterns {
	public void displayPattern1(int noOfLine){
		//Space sp and Star st
		int sp = noOfLine, st = 1;
		
		//Outer loop 
		for(int i = 1; i <= noOfLine; i++){
			for(int j = 1; j <= sp; j++){
				System.out.print(" ");
			}
			int count = 1;
			for(int k = 1; k <= st; k++){
				if(k % 2 == 0){
					System.out.print("*");
				}else{
					System.out.print(count++);
				}
			}
			System.out.println();
			
			if(i <= noOfLine/2){
				sp = sp - 1;
				st = st +2;
			}else{
				sp = sp + 1;
				st = st - 2;
			}
		}
	}
	
	/*
	 * 1 
	 * 2 3 
	 * 3 4 5 
	 * 4 5 6 7 
	 * 5 6 7 8 9 
	 * */
	
	public void pattern2(int no){
		for(int i = 1; i < no; i++){
			for(int j = 1; j <= i; j++){
				if(j == 1){
					System.out.print(i + " ");
				}else{
					System.out.print(j + i -1 + " ");
				}
			}
			System.out.println("");
		}
	}
	
	/*
	 * 987654321 
	 * 87654321 
	 * 7654321 
	 * 654321 
	 * 54321 
	 * 4321 
	 * 321 
	 * 21 
	 * 1
	 * */
	public void pattern3(int no){
		for(int i = no; i >= 1; i--){
			for(int j = i; j >= 1; j--){
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
	
	
	public void pattern4(int no){
		for(int i = no; i >= 1; i--){
			for(int j = i; j >= 1; j--){
				if(j == 9){
					System.out.print(6);
				}else if(j == 6){
					System.out.print(9);
				}else{
					System.out.print(j);
				}
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		int no = 6;
		StarPatterns obj = new StarPatterns();
		obj.pattern4(9);
	}
}
