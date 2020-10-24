package day6.q3;
import java.util.*;
import java.util.Map.Entry;
public class DemoMap {
	public static void main(String []args) {
		HashMap<String, Integer> map=new HashMap<>();
		map.put("raj",90);
		map.put("hari",97);
		map.put("sri",100);
		map.put("v",100);
		
		//gets key first and later gets the value at the key
		Set<String> keys=map.keySet();
		for(String key:keys) {
			System.out.println(key+" : "+map.get(key));
		
		}
		
		
		//gets both the value and key together
		Set<Entry<String,Integer>> entryset=map.entrySet();
		
		for(Entry<String,Integer> entry:entryset) {
			System.out.println(entry.getKey() +" : " +entry.getValue());
		}
	}

}
