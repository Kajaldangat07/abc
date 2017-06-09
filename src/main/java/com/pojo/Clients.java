package com.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Clients 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="clientId")
	private int clientId;
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="clientDetails")
	private List<Customer> customerDetails; 

	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="clientDetails")
	private Address addressDetails;

	
	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public List<Customer> getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(List<Customer> customerDetails) {
		this.customerDetails = customerDetails;
	}

	public Address getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(Address addressDetails) {
		this.addressDetails = addressDetails;
	}

	@Override
	public String toString() {
		return "Clients [clientId=" + clientId + ", customerDetails=" + customerDetails + ", addressDetails="
				+ addressDetails + "]";
	}



	
}
