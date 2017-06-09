package com.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.mapping.List;

@Entity
@Table(name="customers")
public class Customer 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cid")
	private int cid;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
    private String lastName;
	@Column(name="mobile1")
	private int mobile1;
	@Column(name="mobile2")
	private int mobile2;
	@Column(name="cust_email1")
	private String cust_email1;
	@Column(name="cust_email2")
	private String cust_email2;
	
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name = "clientId")
	private Clients clientDetails;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String firstName, String lastName, int mobile1, int mobile2, String cust_email1,
			String cust_email2, Clients clientDetails) {
		super();
		this.cid = cid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile1 = mobile1;
		this.mobile2 = mobile2;
		this.cust_email1 = cust_email1;
		this.cust_email2 = cust_email2;
		this.clientDetails = clientDetails;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMobile1() {
		return mobile1;
	}

	public void setMobile1(int mobile1) {
		this.mobile1 = mobile1;
	}

	public int getMobile2() {
		return mobile2;
	}

	public void setMobile2(int mobile2) {
		this.mobile2 = mobile2;
	}

	public String getCust_email1() {
		return cust_email1;
	}

	public void setCust_email1(String cust_email1) {
		this.cust_email1 = cust_email1;
	}

	public String getCust_email2() {
		return cust_email2;
	}

	public void setCust_email2(String cust_email2) {
		this.cust_email2 = cust_email2;
	}

	public Clients getClientDetails() {
		return clientDetails;
	}


	public void setClientDetails(Clients clientDetails) {
		this.clientDetails = clientDetails;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", firstName=" + firstName + ", lastName=" + lastName + ", mobile1=" + mobile1
				+ ", mobile2=" + mobile2 + ", cust_email1=" + cust_email1 + ", cust_email2=" + cust_email2
				+ ", clientDetails=" + clientDetails + "]";
	}




	
	
	
	
	
	

}
