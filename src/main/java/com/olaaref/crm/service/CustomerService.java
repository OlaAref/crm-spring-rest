package com.olaaref.crm.service;

import java.util.List;

import com.olaaref.crm.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();
	public Customer getCustomer(long id);
	public void saveCustomer(Customer customer);
	public void deleteCustomer(long id);
}
