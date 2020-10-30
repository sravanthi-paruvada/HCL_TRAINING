package com.lab6.q1;

import java.util.*;

public class DemoList {
	public static void main(String[] args) {
	
	List<String> list=new ArrayList<>();
	
	list.add("raj");
	list.add("hari");
	list.add("sri");
			
	List<String> list1=new ArrayList<>();
	list1.add("v");
	list1.add("zoey");
	
	list.addAll(list1);
	System.out.println(" After add all" +list);
	
	list.remove("v");
	System.out.println(" After remove " +list);
	
	list.removeAll(list1);
	System.out.println(" After remove all" +list);
	
	
	System.out.println(" contains :" +list.contains("hari"));
	
	
	System.out.println(" size : " +list.size());
	
	
	Object[] arrSet = new String[list.size()];
	arrSet = list.toArray();
	
	
	
	Iterator<String> it=list.iterator();
	System.out.println("Using Iterator ");
	  while(it.hasNext()){
          System.out.println(it.next());
      }
	
	  System.out.println("list in array");
		for(Object item: arrSet) {
			System.out.println(item + " ");
		}
		
	list.clear();
	System.out.println(" After clear " +list);
	
		//System.out.println(set1);
}
	
}


