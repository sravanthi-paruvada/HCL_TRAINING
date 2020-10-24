package day6.q2;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class DemoIO {
	public static void main(String []args) {
		TreeSet<String> words=new TreeSet<String>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(new File("src/Files/Data.txt")));){
			
			String line=null;
			while((line=br.readLine())!=null){
		
		String tokens[]=line.split(" ");
		for(String token:tokens) {
			words.add(token.toLowerCase());
			System.out.println(token);
		}
	}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	
		}
	}

