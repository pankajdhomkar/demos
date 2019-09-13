package com;

public class Palindrome {
	public int checkPalinDrome(String str){
		String s = "";
		for(int i = str.length() - 1; i >= 0; i--){
			System.out.println("yes " + str.charAt(i));
			s = s + str.charAt(i);
			System.out.println("no " + s);
		}
		
		if(str.equals(s)){
			System.out.println("yes");
			return 0;
		}else{
			System.out.println("no");
			return 1;
		}	
	}
}
