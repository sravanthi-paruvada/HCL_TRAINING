package day7.p2;
import java.util.*;
import java.util.Map.Entry;

//class myMapSorter implements comparator
public class demoSortedmap {
	public static void main(String []args) {

	SortedMap<Integer,String> map=new TreeMap<>();
	map.put(101,"A");
	map.put(102,"B");
	map.put(103,"C");
	map.put(104,"D");
	
    System.out.println("First key : "+map.firstKey());
    System.out.println("Last key : "+map.lastKey());
    System.out.println("Head key : "+map.headMap(102));
    System.out.println("tail key : "+map.tailMap(102));
    
	Set<Entry<Integer,String>> set=  map.entrySet();
	
		for(Entry<Integer,String> entry:set) {
		System.out.println(entry.getKey() +" : " +entry.getValue());
		
	}
	
	
	
	
	}
	
	
}
