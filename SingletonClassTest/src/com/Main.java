package com;

public class Main {
	public static void main(String [] args){
		SingletonCl x = SingletonCl.singleton();
		
		// instantiating Singleton class with variable y 
		SingletonCl y = SingletonCl.singleton(); 
  
        // instantiating Singleton class with variable z 
		SingletonCl z = SingletonCl.singleton(); 
  
        // changing variable of instance x 
        x.s = (x.s).toUpperCase(); 
  
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s); 
        System.out.println("\n"); 
  
        // changing variable of instance x 
        z.s = (z.s).toLowerCase(); 
  
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s);
        
        Singleton insta = Singleton.instance;
        try {
			Singleton insta1 = (Singleton) insta.clone();
			System.out.println("Instance 1 "+ insta.hashCode());
			System.out.println("Instance 2 "+ insta1.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
