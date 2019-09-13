package com;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String [] args){
		 ArrayList<Movie> list = new ArrayList<Movie>(); 
	        list.add(new Movie("Force Awakens", 8.3, 2015)); 
	        list.add(new Movie("Star Wars", 8.7, 1977)); 
	        list.add(new Movie("Empire Strikes Back", 8.0, 1980)); 
	        list.add(new Movie("Return of the Jedi", 8.4, 1983)); 
	  
	        Collections.sort(list); 
	  
	        System.out.println("Movies after sorting : "); 
	        for (Movie movie: list) 
	        { 
	            System.out.println(movie.getName() + " " + 
	                               movie.getRating() + " " + 
	                               movie.getYear()); 
	        }
	        
	        //Compare with rating
	        System.out.println("\nCompare with Rating");
	        RatingCompare objRating = new RatingCompare();
	        Collections.sort(list, objRating);
	        for(Movie m : list){
	        	System.out.println(m.getName() + " " + 
                        m.getRating() + " " + 
                        m.getYear()); 
	        }
	        
	        System.out.println("\nCompare with Name");
	        NameCompare objName = new NameCompare();
	        Collections.sort(list, objName);
	        for(Movie m : list){
	        	System.out.println(m.getName() + " " + 
                        m.getRating() + " " + 
                        m.getYear()); 
	        }
	        
	}
}
