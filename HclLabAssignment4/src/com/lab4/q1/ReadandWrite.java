package com.lab4.q1;

import java.io.*;
import java.io.FileNotFoundException;

public class ReadandWrite {
	public static void main(String[] args) throws FileNotFoundException ,IOException{
	 
		try (FileInputStream FI=new FileInputStream("src/Files/Data.txt");){
		
		int line=0;
		while((line= FI.read())!= -1){
			System.out.println((char)line);
			
		}
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
