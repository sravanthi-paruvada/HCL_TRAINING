package day6.q3;
import java.util.*;
public class Demoset {
	public static void main(String []args) {
		
		TreeSet<String> set2=new TreeSet<>();
		set2.add("raj");
		set2.add("hari");
		set2.add("sri");
		set2.add("v");
		set2.add("zoey");
		
		//for(String name:set) {
			System.out.println(set2);
		
		LinkedHashSet<String> set1=new LinkedHashSet<>();
		set1.add("raj");
		set1.add("hari");
		set1.add("sri");
		set1.add("v");
		set1.add("zoey");
		
		//for(String name:set) {
			System.out.println(set1);
		
		HashSet<String> set=new HashSet<>();
		set.add("raj");
		set.add("hari");
		set.add("sri");
		set.add("v");
		set.add("zoey");
		
		//for(String name:set) {
			System.out.println(set);
		//}
		
	}

}
