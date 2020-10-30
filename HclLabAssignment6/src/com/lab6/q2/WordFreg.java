package com.lab6.q2;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class WordFreg {
	public static void main(String []args) {
		Map<String, Integer> map=new HashMap<String,Integer>();
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(new File("src/Files/Data.txt")));){
			
			String line=null;
			while((line=br.readLine())!=null){
		
		String words[]=line.split(" ");
		for(String word:words) {
			if(map.containsKey(word)) {
				Integer freq=map.get(word);
				map.put(word,++freq);
			}
			else
				map.put(word, 1);
			
		}
	}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		Set<Entry<String,Integer>> entrySet= map.entrySet();
			for(Entry<String,Integer> entry:entrySet)
				System.out.println(entry.getKey()+ " : "+entry.getValue());
		}
	
	

}
