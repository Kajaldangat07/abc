package com.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.clientDao;
import com.pojo.Address;
import com.pojo.Clients;
import com.pojo.Customer;
import com.service.clientService;

@Service
public class ClientServiceImp implements clientService
{
	@Autowired
	clientDao cd;

	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		cd.saveCustomer(customer);
		
	}

	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		cd.deleteCustomer(id);
		
	}

	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		cd.updateCustomer(customer);
		
	}


	public void saveAddress(Address address) {
		// TODO Auto-generated method stub
		cd.saveAddress(address);
		
	}

	public void deleteAddress(int id) {
		// TODO Auto-generated method stub
		cd.deleteAddress(id);
		
	}

	public void updateAddress(Address address) {
		// TODO Auto-generated method stub
		cd.updateAddress(address);
		
	}

	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return cd.getAllCustomer();
	}

	public List<Address> getAddress(int id) {
		// TODO Auto-generated method stub
		return cd.getAddress(id);
	}

	public List<Customer> getCustomer(int id) {
		// TODO Auto-generated method stub
		return cd.getCustomer(id);
	}

	public List<Clients> getClientById(int id) {
		// TODO Auto-generated method stub
		return cd.getClientById(id);
	}

}
