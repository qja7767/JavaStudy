package com.varxyz.jv251.dao;

import java.util.Date;
import java.util.List;

import com.varxyz.jv251.domain.Account;
import com.varxyz.jv251.domain.Customer;
import com.varxyz.jv251.domain.SavingsAccount;


public class DaoTest {
	public static void main(String[] args) {
		
		//Account Dao TEST---------------------------------------
		AccountDao dao = new AccountDao();
		SavingsAccount sa = new SavingsAccount();
		sa.setAccountNum("567-89-0123");
		sa.setBalance(45000.0);
		sa.setCustomer(new Customer(1002));
		sa.setInterestRate(0.04);
		sa.setRegDate(new Date());
		sa.setAccountType('S');

		dao.addAccount(sa);
		for(Account account : dao.findAccountsBySsn("921213-1234567")) {
			System.out.println(account);
		}
		
		//Customer Dao TEST-------------------------------------
		CustomerDao dao2 = new CustomerDao();		
		//findAllCustomers() Test
		List<Customer> customerList = dao2.findAllCustomers();
		for(Customer customer : customerList) {
			System.out.println(customer);
		}
		
		System.out.println("-------------------------------------");
		//findCustomerBySsn
		Customer customer = dao2.findCustomerBySsn("911213-1234567");
		System.out.println(customer);
		System.out.println("-------------------------------------");
		
		Customer c = new Customer();
		c.setName("공명");
		c.setSsn("919191-1313131");
		c.setPhone("010-1616-2626");
		c.setUserId("spring");
		c.setPasswd("1111");
		
		dao2.addCustomer(c);
		
		
	}
}
