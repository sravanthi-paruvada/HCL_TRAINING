package Controller;
import jdbcCustomer.*;
import java.sql.Connection;
import java.util.Date;
import java.util.List;



public class CustomerController {

	public static void main(String[] args) {
		
		Connection connection = ConnectionFactory.getConnection();
		if (connection != null)
			System.out.println("Successfully connected to DB");

		CustomerDaoImpl CusModify = new CustomerDaoImpl();

// add customer
		
		
		  Customer customer=new Customer(12,"sravanthi","963905629", "kgffs@gmail.com",
		  new Date(),"sklm",60734); 
		  CusModify.addCustomer(customer);
		  System.out.println("Succesfully added customer to DB");
		 
		 
// Delete the customer

		CusModify.delCustomer(1);
		  System.out.println("Succesfully deleted customer to DB");
		
		
		  
// update the customer
		CusModify.updateCustomer(3,50000); 
		  System.out.println("Succesfully updated customer to DB");
		
		  
// print all the customers

		 List<Customer>customerList=CusModify.getAllCustomer();
		 customerList.forEach(c->  System.out.println(c));
		

// get customer by id

		System.out.println("Customer By ID : " +CusModify.getCustomerById(12));

//// get selected customer
//
//	List<Customer> customerList1 = CusModify.getSelectedCustomer(50000);
//		customerList1.forEach(d -> System.out.println(d));

	}

}