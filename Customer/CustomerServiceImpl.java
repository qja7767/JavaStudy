package com.varxyz.banking.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
	private Map<String, Customer> map = new HashMap<String, Customer>();	
	
	public void addCustomer(Customer customer) {
		if(!map.containsKey(customer.getSsn())) {
			map.put(customer.getSsn(), customer);			
		}	
	}
	
	public Customer getCustomerBySsn(String ssn) {
		if(map.containsKey(ssn)) {
			return map.get(ssn);
		}
		return null;
	}

	public Collection<Customer> getAllCustomers() {		
		return map.values();
	}

	public int getNumOfCustomers() { 
		return map.size();
	}
	
}
