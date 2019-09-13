package com;

public class Main {
	
	public static void main(String[] args) {
		String str1 = "geeksforgeeks";
		String str2 = "fowweeksgeeks";
		
		Anagram obj = new Anagram();
		
		if(obj.anagramString(str1, str2)){
			System.out.println("Anagram string");
		}else{
			System.out.println("Not Anagram string");
		}
	}
}
