package jdbcCustomer;
import java.util.*;
public class Customer {

		private int id;
		private String name;
		private String phone;
		private String email;
		private Date dob;
		private String address;
		private double purchase_capacity;
		public Customer(int id, String name, String phone, String email, Date dob, String address,
				double purchase_capacity) {
		
			this.id = id;
			this.name = name;
			this.phone = phone;
			this.email = email;
			this.dob = dob;
			this.address = address;
			this.purchase_capacity = purchase_capacity;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Date getDob() {
			return dob;
		}
		public void setDob(Date dob) {
			this.dob = dob;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public double getPurchase_capacity() {
			return purchase_capacity;
		}
		public void setPurchase_capacity(double purchase_capacity) {
			this.purchase_capacity = purchase_capacity;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Customer [id=");
			builder.append(id);
			builder.append(", name=");
			builder.append(name);
			builder.append(", phone=");
			builder.append(phone);
			builder.append(", email=");
			builder.append(email);
			builder.append(", dob=");
			builder.append(dob);
			builder.append(", address=");
			builder.append(address);
			builder.append(", purchase_capacity=");
			builder.append(purchase_capacity);
			builder.append("]");
			return builder.toString();
		}
		
		
		

		
	}


