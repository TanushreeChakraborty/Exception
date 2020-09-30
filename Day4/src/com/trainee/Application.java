package com.trainee;

import com.trainee.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args) {
		
		
		
		try {
			Customer ram=new Customer();
			
			ram.setCustomerId(202);
			ram.setEmail("gmail.com");
			ram.setMobileNumber(1234);
			ram.setCustomerName("ramesh");
			
			CustomerService serv = new CustomerService();
			
			serv.printCustomer(ram);
			serv.encryptEmail(ram);
			
		}catch(RangeCheckException e) {
			
			System.err.println(e.getMessage());
		} 
		
		catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		
		
		
	}

}
