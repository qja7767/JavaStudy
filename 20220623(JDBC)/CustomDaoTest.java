package com.varxyz.jv250.banking;

import java.util.List;

import com.varxyz.jv250.jdbc.banking.Customer;
import com.varxyz.jv250.jdbc.banking.CustomerDao;

public class CustomDaoTest {
	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();		
		//findAllCustomers() Test
		List<Customer> customerList = dao.findAllCustomers();
		for(Customer customer : customerList) {
			System.out.println(customer);
		}
		
		System.out.println("-------------------------------------");
		//findCustomerBySsn
		Customer customer = dao.findCustomerBySsn("911213-1234567");
		System.out.println(customer);
		System.out.println("-------------------------------------");
		
		Customer c = new Customer();
		c.setName("공명");
		c.setSsn("919191-1313131");
		c.setPhone("010-1616-2626");
		c.setCustomerID("spring");
		c.setPassword("1111");
		
		dao.addCustomer(c);
	}
}
