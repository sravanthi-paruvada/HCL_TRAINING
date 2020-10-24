package day6.p1;

import java.util.*;

public class ThreeTypeofIterators {
	
	//enumration   
	public static void main(String []args) {
		Vector<String> v=new Vector<>();
		v.add("foo");
		v.add("car");
		v.add("bus");
		
		Enumeration<String> en=v.elements();
		while(en.hasMoreElements()) {
			
		}
		
		
		//list iterator you can iterate fron both side
		
		ArrayList<String> list=new ArrayList<>();
		list.add("dat");
		list.add("car");
		list.add("bike");		
		
		ListIterator<String> it=list.listIterator(list.size());
		while(it.hasPrevious()) {
			System.out.println(it.previous());//hasNext and next() for forward operation
		}
		
		//crud operation with listiterator
		while(it.hasNext()) {
			String val=it.next();
			if(val.equals("car")) {
				it.set("new car");
			}
			if(val.contentEquals("bike")) {
				it.add("bus");
				it.remove();
			}
		}
		while(it.hasNext()) {
			System.out.println(it.next());//hasNext and next() for forward operation
		}
	}

}
