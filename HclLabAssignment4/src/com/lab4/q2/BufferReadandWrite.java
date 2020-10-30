package com.lab4.q2;
import java.io.*;

public class BufferReadandWrite {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in));){
			
			String line="";
			line=br.readLine();
			
			BufferedWriter bw=new BufferedWriter(new FileWriter("src/Files/data1.txt"));
			bw.write(line);
			System.out.println("Written Successfully");
			bw.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
