package com.varxyz.banking.domain;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomerServiceImpl2 implements CustomerService{
	private List<Customer> customerList = new ArrayList<>();
	
	private Customer isExist(Customer customer) {
		for(Customer c : customerList) {
			if(customer.getSsn().equals(c.getSsn())) {
				return c;
			}
		}
		return null;		
	}
	
	public void addCustomer(Customer customer) {
		if(getCustomerBySsn(customer.getSsn()) == null ) {
			customerList.add(customer);
		}
	}

	public Customer getCustomerBySsn(String ssn) {
		for(Customer c : customerList) {
			if(ssn.equals(c.getSsn())) {
				return c;
			}
		}
		return null;	
	}

	public Collection<Customer> getAllCustomers() {
		return customerList;
	}

	public int getNumOfCustomers() {		
		return customerList.size();
	}
}
