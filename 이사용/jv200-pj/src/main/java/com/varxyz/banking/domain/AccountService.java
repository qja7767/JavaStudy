package com.varxyz.banking.domain;
/* 1. 주요 메소드
 * .addCustomer() : 신규 고객추가
 * .getCustomerBySsn : 주민번호로 고객 조회
 * .getAllCustomers(): 전체 고객 목록
 * .getNumOfCustomers(): 전체 고객 수
 * 
 * 2. 기타
 * CustomerService는 고객의 정보를 보관할 수 있는 속성 유지
 * 고객의 정보를 유지할 수 있는 속성을 정의하라.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface AccountService {
	void addCustomer(Customer customer);
	Customer getCustomerBySsn(String ssn);
	Collection<Customer> getAllCustomers();
	int getNumOfCustomers();
}

