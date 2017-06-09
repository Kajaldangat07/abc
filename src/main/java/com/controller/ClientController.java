package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pojo.Address;
import com.pojo.Clients;
import com.pojo.Customer;
import com.service.clientService;


@RestController
public class ClientController 
{ @Autowired
	clientService cs;

	@RequestMapping(value = "/Customer", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> getAllCustomer() {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("getAll record ");
        
		Customer cust = new Customer();
		List<Customer> l = cs.getAllCustomer();
		

		// System.out.println(l.toString());
		System.out.println(l);
		map.put("ulist", l);
		System.out.println(map);
		return map;
	}
	
	@RequestMapping(value = "/deleteCustomer", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> deleteUser(@RequestBody Map<String, String> data) {
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		//System.out.println("in delete=="+ id);
		System.out.println(data);
		//users.setId(1);
		int id=0;
		for (Map.Entry<String, String> entry : data.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			if (key.equalsIgnoreCase("id")) {
				id=Integer.parseInt(value);
			}

		}
		System.out.println(id);
		cs.deleteCustomer(id);
		return map;
	}
	
	
	@RequestMapping(value = "/insertcustomer", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> getUser(@RequestBody Map<String, String> data) {
		System.out.println("in controller ");
//		System.out.println(data);
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("in test service   " + data);
		
		Address a=new Address();
		Clients c=new Clients();
		Customer cust=new Customer();
		
		List<Address> al=new ArrayList();
		List<Customer> cl=new ArrayList();
		
		for(Map.Entry<String, String> entry : data.entrySet())
		{
			String key=entry.getKey();
			String value=entry.getValue();
			
			if(key.equalsIgnoreCase("cust_email1")){
				if(value.equals(null))
			{
				cust.setCust_email1("");
			}
				else
				{
					cust.setCust_email1(value);
				}
			}
			
			
			if(key.equalsIgnoreCase("cust_email2"))
			{
				if(value.equals(null))
				{
					cust.setCust_email2("");
				}
				else
				{
					cust.setCust_email2(value);
				}
			}
			if(key.equalsIgnoreCase("firstName"))
			{
				if(value.equals(null))
				{
					cust.setFirstName("");
				}
				else
				{
					cust.setFirstName(value);
				}
			}
			if(key.equalsIgnoreCase("lastName"))
			{
				if(value.equals(null))
				{
					cust.setLastName("");
				}
				else
				{
					cust.setLastName(value);
				}
			}
			if(key.equalsIgnoreCase("mobile1"))
			{
				if(value.equals(null))
				{
//					cust.setMobile1("");
				}
				else
				{
					cust.setMobile1(Integer.parseInt(value));
				}
			}
			
			if(key.equalsIgnoreCase("mobile2"))
			{
				if(value.equals(null))
				{
//					cust.setMobile2("");
				}
				else
				{
					cust.setMobile2(Integer.parseInt(value));
				}
			}
			
			if(key.equalsIgnoreCase("area"))
			{
				if(value.equals(null))
				{
					a.setArea("");
				}
				else
				{
					a.setArea(value);
				}
			}
			if(key.equalsIgnoreCase("buildingName"))
			{
				if(value.equals(null))
				{
					a.setBuildingName("");
				}
				else
				{
					a.setBuildingName(value);
				}
			}
			if(key.equalsIgnoreCase("emailId1"))
			{
				if(value.equals(null))
				{
					a.setEmailId1("");
				}
				else
				{
					a.setEmailId1(value);
				}
			}
			if(key.equalsIgnoreCase("emailId2"))
			{
				if(value.equals(null))
				{
					a.setEmailId2("");
				}
				else
				{
					a.setEmailId2(value);
				}
			}
			if(key.equalsIgnoreCase("flatNo"))
			{
				if(value.equals(null))
				{
					//a.setFlatNo(0);
				}
				else
				{
					a.setFlatNo(Integer.parseInt(value));
				}
			}
			if(key.equalsIgnoreCase("Latitude"))
			{
				if(value.equals(null))
				{
					//a.setLatitude(latitude);
				}
				else
				{
					a.setLatitude(Integer.parseInt(value));
				}
			}
			if(key.equalsIgnoreCase("Longitude"))
			{
				if(value.equals(null))
				{
					//a.setLatitude(latitude);
				}
				else
				{
					a.setLongitude(Integer.parseInt(value));
				}
			}
			if(key.equalsIgnoreCase("name"))
			{
				if(value.equals(null))
				{
					a.setName("");
				}
				else
				{
					a.setName(value);
				}
			}
			if(key.equalsIgnoreCase("phoneNo1"))
			{
				if(value.equals(null))
				{
					//a.setLatitude(latitude);
				}
				else
				{
					a.setPhoneNo1(Integer.parseInt(value));
				}
			}
			if(key.equalsIgnoreCase("phoneNo1"))
			{
				if(value.equals(null))
				{
					//a.setLatitude(latitude);
				}
				else
				{
					a.setPhoneNo2(Integer.parseInt(value));
				}
			}
			
			if(key.equalsIgnoreCase("pincode"))
			{
				if(value.equals(null))
				{
					//a.setLatitude(latitude);
				}
				else
				{
					a.setPincode(Integer.parseInt(value));
				}
			}
			if(key.equalsIgnoreCase("region"))
			{
				if(value.equals(null))
				{
					a.setRegion("");
				}
				else
				{
					a.setRegion(value);
				}
			}
			if(key.equalsIgnoreCase("road"))
			{
				if(value.equals(null))
				{
					a.setRoad("");
				}
				else
				{
					a.setRoad(value);
				}
			}
			
			if(key.equalsIgnoreCase("shop"))
			{
				if(value.equals(null))
				{
					a.setShop("");
				}
				else
				{
					a.setShop(value);
				}
			}
			if(key.equalsIgnoreCase("state"))
			{
				if(value.equals(null))
				{
					a.setState("");
				}
				else
				{
					a.setState(value);
				}
			}
			
			if(key.equalsIgnoreCase("street"))
			{
				if(value.equals(null))
				{
					a.setStreet("");
				}
				else
				{
					a.setStreet(value);
				}
			}
			
			if(key.equalsIgnoreCase("zone"))
			{
				if(value.equals(null))
				{
					a.setZone("");
				}
				else
				{
					a.setZone(value);
				}
			}
			
			
		}	
			
	//c.setClientId(2);
		
		System.out.println("insert op"+c);
		
	cust.setClientDetails(c);
	cs.saveCustomer(cust);
	
	a.setClientDetails(c);
	cs.saveAddress(a);
	return map;

	}
	
	@RequestMapping(value = "/address", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> getAddress(@RequestBody Map<String, String> data) {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("getAll record ");
		System.out.println(data);
		int id = 0;
		for (Map.Entry<String, String> entry : data.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key==" + key + " value==" + value);
			if (key.equalsIgnoreCase("id")) {
				id = Integer.parseInt(value);
			}
		}
		List<Address> l = cs.getAddress(id);
		// System.out.println(l.toString());
		System.out.println(l);
		map.put("alist", l);
		System.out.println(map);
		return map;
	}

	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> getPhone(@RequestBody Map<String, String> data) {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("phone ");

		int id = 0;
		for (Map.Entry<String, String> entry : data.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key==" + key + " value==" + value);
			if (key.equalsIgnoreCase("id")) {
				id = Integer.parseInt(value);
			}
		}
		List<Customer> l = cs.getCustomer(id);

		System.out.println(l);
		map.put("plist", l);
		System.out.println(map);
		return map;
	}
}
