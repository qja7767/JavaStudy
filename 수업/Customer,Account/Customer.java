package mod001;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Customer implements CustomerService {
	public static void main(String[] args) {	
		Customer a = new Customer();
		Customer b = new Customer();
		ArrayList<CustomerService> cu = new ArrayList<CustomerService>();				
		a.setName("KGB");
		System.out.println(a.getName());
		a.setCustomerID("qja7767");
		System.out.println(a.getCustomerID());
		a.setSsn("969696-171717");
		System.out.println(a.getSsn());
		a.setPhone("010-3444-7777");
		System.out.println(a.getPhone());
		a.setPassword("7767");
		System.out.println(a.getPassword());
		cu.add(a);
				
		for(CustomerService c : cu) {
			System.out.println(c);			
		}
		
	}
	
	private String name;
	private String ssn;
	private String phone;
	private String customerID;
	private String password;
	private List<Account> accountList;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Account> getAccountList() {
		return accountList;
	}
	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Customer getCustomerBySsn(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Collection<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getNumOfCustomers() {
		// TODO Auto-generated method stub
		return 0;
	}
}

