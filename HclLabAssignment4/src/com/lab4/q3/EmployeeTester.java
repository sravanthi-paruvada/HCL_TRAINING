package com.lab4.q3;
import java.io.*;

public class EmployeeTester {
	public static void main(String[] args) throws ClassNotFoundException {
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/Files/data2.txt"));){
			
			Employee emp = new Employee("bhavani", 51894685, "sklm", 24400.0);
			oos.writeObject(emp);
			emp.display();
			System.out.println("data successfully serialized..!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Files/data2.txt"));){
			
			Employee emp1 = (Employee) ois.readObject();
			emp1.display();
			System.out.println("deserialized data successfully....!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
