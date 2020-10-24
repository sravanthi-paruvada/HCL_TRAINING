package day6.p1;

import java.util.*;


public class DemoArrayList {

	public static void main(String []args)
{
		ArrayList<String> list=new ArrayList<>();
		list.add("dat");
		list.add("car");
		list.add("bike");		
		
		
		Collections.sort(list);
		System.out.println(list);//prints in alpha betical order
		
		
		//binary search: pre condition all elements are sorted
		int index=Collections.binarySearch(list, "car");
		System.out.println(index);//if var is not present in list it gives -ve value of the last index num t
		
		
	//	for(String temp: list)
		//	System.out.println(temp);
		
	
	Iterator<String> it=list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		//it.next();
		//it.remove();
	}
}
}