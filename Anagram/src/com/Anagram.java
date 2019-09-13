package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;

/*
 * An anagram of a string is another string that contains same characters,
 * only the order of characters can be different.
 * For example, “abcd” and “dabc” are anagram of each other.
 */
public class Anagram {
	
	
	
	  public static void main(String[] args) {
		
		  makePattern("{i{j{kl}{m}}p}");
	}
	
	
	
	public boolean anagramString(String str1, String str2){
		int n1 = str1.length();
		int n2 = str2.length();
		
		if(n1 != n2)
			return false;
		char [] s1 = str1.toCharArray();
		char [] s2 = str2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		for(int i = 0; i < n1; i++){
			if(s1[i] != s2[i])
				return false;
		}
		return true;
	}
	
	
	public static void makePattern(String str) {
		
				int count = 0;
				
				for (int i = 0; i < str.length(); i++) {
					
							if(str.charAt(i) == '{') {
								count++;
							}
							
							if(str.charAt(i) >= 97 && str.charAt(i) <= 122  ) {
								 
								int temp = count;
								
								while(temp > 0) {
									System.out.print("-");
									temp--;
								}
								System.out.println(str.charAt(i));
								
							}
					
							if(str.charAt(i) == '}') {
								count--;
							}
					
				}
		
	}

}
