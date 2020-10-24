package day7.p2;

import java.util.*;

public class DemoPriorityWQueus {

	public static void main(String []args) {
		PriorityQueue<Student> pq= new PriorityQueue<>();
		pq.add(new Student(122,"raj",90));
		pq.add(new Student(322,"raj",70));
		pq.add(new Student(452,"raj",80));
		while(!pq.isEmpty()) {
			System.out.println(pq.remove());//less marks printed first we can use poll but returns null
		}
	}
}
