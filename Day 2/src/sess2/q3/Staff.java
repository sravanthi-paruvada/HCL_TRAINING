package sess2.q3;

public class Staff extends Person {
	
		
		private String school;
		 private double pay;
		 
		 Staff(String name, String address, String program,String school,double pay) {
				super(name, address);
				this.school=school;
				this.pay=pay;
				
			}
		 public String getSchool() {
			return school;
		}
		public void setSchool(String school) {
			this.school = school;
		}
		public double getPay() {
			return pay;
		}
		public void setPay(double pay) {
			this.pay = pay;
		}
		public void print() {
			 super.print();
				System.out.print("school "+ school+" pay "+pay);
			}
		//@Override
	//	public String toString() {
		//	return "Staff [school=" + school + ", pay=" + pay + ", getSchool()=" + getSchool() + ", getPay()="
			//		+ getPay() + ", getprogram()=" + getprogram() + ", getyear()=" + getyear() + ", fee()=" + fee()
				//	+ ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
			//		+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//		}
}


