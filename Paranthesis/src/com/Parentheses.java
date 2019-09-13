package com;

import java.util.Stack;

public class Parentheses {

	public boolean checkBalance(String str){
		Stack<Character> stack = new Stack<Character>();
		if(str.length() == 0) return false;
		for(int i = 0; i < str.length(); i++){

			if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
				stack.push(str.charAt(i));
			}

			if(str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']'){
				if(stack.empty())
					return false;

				Character top = stack.pop();
				if ((top == '(' && str.charAt(i) != ')') ||
						(top == '{' && str.charAt(i) != '}') ||
						(top == '[' && str.charAt(i) != ']')) {

					return false;
				}
			}
		}
		return stack.empty();
	}
	
	public static void main(String[] args) {
		Parentheses obj = new Parentheses();
		if(obj.checkBalance("()(){([[]])[]}")){
			System.out.println("Balanced");
		}else{
			System.out.println("Not Balance");
		}
	}
}
