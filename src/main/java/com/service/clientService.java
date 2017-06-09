package com.service;

import java.util.List;

import com.pojo.Address;
import com.pojo.Clients;
import com.pojo.Customer;


public interface clientService 
{

	void saveCustomer(Customer customer);
	void deleteCustomer(int id);
	void updateCustomer(Customer customer);
	List<Customer> getAllCustomer();

	void saveAddress(Address address);
	void deleteAddress(int id);
	void updateAddress(Address address);
	
	List<Address> getAddress(int id);
	List<Customer> getCustomer(int id);

	List<Clients> getClientById(int id);

}
