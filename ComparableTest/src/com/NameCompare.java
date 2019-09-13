package com;

import java.util.Comparator;

//Using Comparator
//Compare using name
public class NameCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
