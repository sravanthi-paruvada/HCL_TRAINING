package com.lab6.q1;
import java.util.*;
public class DemoSet {
public static void main(String []args) {
		
		HashSet<String> set=new HashSet<>();
		set.add("raj");
		set.add("hari");
		set.add("sri");
				
		HashSet<String> set1=new HashSet<>();
		set1.add("v");
		set1.add("zoey");
		
		set.addAll(set1);
		System.out.println(" After add all" +set);
		
		set.remove("v");
		System.out.println(" After remove " +set);
		
		set.removeAll(set1);
		System.out.println(" After remove all" +set);
		
		
		System.out.println(" contains :" +set.contains("hari"));
		
		
		System.out.println(" size : " +set.size());
		
		
		Object[] arrSet = new String[set.size()];
		arrSet = set.toArray();
		
		System.out.println("set in array");
		for(Object item: arrSet) {
			System.out.println(item + " ");
		}
		
	            set.clear();
	    		System.out.println(" After clear " +set);
	    		
		
		
		
		
		
		
		
			//System.out.println(set1);
	
		
	}
}
