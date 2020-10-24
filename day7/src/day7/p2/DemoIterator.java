package day7.p2;

import java.util.*;
	
	class School implements Iterable<Student> {
		private List<Student> students;
		public School() {
	        this.students = new ArrayList<Student>();
	    }
	    public void addStudent(Student student) {
	        students.add(student);
	    }

	    @Override
	    public Iterator<Student> iterator() {
	        return new StudentIterator();
	    }
	    class StudentIterator implements Iterator<Student> {
	    	int index = 0;
	        @Override
	        public boolean hasNext() {

	            if (index >= students.size())
	                return false;
	            else
	                return true;
	        }
	        @Override
	        public Student next() {
	            return students.get(index++);
	        }
	        
	        @Override
	        public void remove() {
	            students.remove(--index);
	        }

	    }
	}

	public class DemoIterator {
		public static void main(String[] args) {
			School school=new School();
	        school.addStudent(new Student(121, "raja", 89));
	        school.addStudent(new Student(1, "ekta", 92));
	        school.addStudent(new Student(10, "rajeev", 99));
	        
	        
	        Iterator<Student> it=school.iterator();
	        it.next();
	        it.remove();
	        while(it.hasNext()){
	            System.out.println(it.next());
	        }
	    }

	 

	}
	