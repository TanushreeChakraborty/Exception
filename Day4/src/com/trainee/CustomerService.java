package com.trainee;

public class CustomerService {
	
	
	public String generateUserId(Customer cust) {
		
		return Integer.toString(cust.getCustomerId());
		
	}
	

	public void printCustomer(Customer cust) {
		
		try {
			
			System.out.println(cust.getCustomerName().length());
			
		} catch (NullPointerException e) {
			// TODO: handle exception
			
			System.err.println("Name not given");
			e.printStackTrace();
			
		}
		
		//System.out.println(cust.getCustomerName().length());
		
	}
	
	public String encryptEmail(Customer cust) {
		
		String email = cust.getEmail();
		boolean status=email.contains("@");
		
		if(!status) {
			
			try {
				
				throw new Exception("Invalid email");
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				return "From Catch";
				// TODO: handle exception
			}
			finally {
				
				System.err.println("Inside finally");
			}
			
		}
		
		return"";
		
	}
	
}
