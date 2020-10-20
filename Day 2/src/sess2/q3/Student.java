package sess2.q3;

public class Student extends Person{
	
	private String program;
	 private int year;
	 private double fee;
	 
	 Student(String name, String address, String program,int year,double fee) {
			super(name, address);
			this.program=program;
			this.year=year;
			this.fee=fee;
			
		}
	 
	 public String getprogram() {
			return program;
		}
	 public int getyear() {
			return year;
		}
	 public double fee() {
			return fee;
		}
	 
	 public void setProgram(String program) {
			this.program=program;
		}
	 public void setYear(int year) {
			this.year=year;
		}
	 public void setFee(double fee) {
			this.fee=fee;
		}
	 public void print() {
		 super.print();
			System.out.print("program "+ program+" Year "+year+" Fee "+fee);
		}

	
	

}
