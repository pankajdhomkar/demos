package com;

import java.util.Comparator;

//Using Comparator 
//Compare by rating
public class RatingCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		if(o1.getRating() < o2.getRating()) return -1;
		if(o1.getRating() > o2.getRating()) return 1;
		else return 0;
	}

}
