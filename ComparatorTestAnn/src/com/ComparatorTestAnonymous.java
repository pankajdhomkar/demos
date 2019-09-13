package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTestAnonymous {
	public static void main(String [] args){
		List<String> list = new ArrayList<>();
		
		list.add("SpiderMan ");
        list.add("Wolverine ");
        list.add("Xavier ");
        list.add("Cyclops ");
		
        Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
        
       // Collections.sort(list, (l1,l2) -> l1.compareTo(l2));
        Collections.sort(list, Comparator.naturalOrder());
        list.forEach(System.out::println);
	}
}
