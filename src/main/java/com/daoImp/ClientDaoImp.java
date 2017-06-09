package com.daoImp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.clientDao;
import com.pojo.Address;
import com.pojo.Clients;
import com.pojo.Customer;


@Repository
@Transactional
public class ClientDaoImp implements clientDao
{
	@Autowired
	SessionFactory session;
	Clients cl;

	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
	session.getCurrentSession().save(customer);
		
	}

	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		String hql="delete from Customer where cid=:id";
		System.out.println(id);
		Query q1=session.getCurrentSession().createQuery(hql);
		q1.setParameter("id", id);
		q1.executeUpdate();
		
	}

	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		session.getCurrentSession().saveOrUpdate(customer);
		
	}


	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		Criteria cr=session.getCurrentSession().createCriteria(Customer.class);
		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.property("cid"));
		projList.add(Projections.property("cust_email1"));
		projList.add(Projections.property("cust_email2"));
		 projList.add(Projections.property("firstName")); 
		 projList.add(Projections.property("lastName")); 
		 projList.add(Projections.property("mobile1")); 
		 projList.add(Projections.property("mobile2")); 
		 
			cr.setProjection(projList);
			List<Object[]> results = cr.list();
			System.out.println(results);
			int i = results.size();
			System.out.println("customer size: "+i);
			Iterator itr = results.iterator();

			List<Customer> cList = new ArrayList<Customer>();

			for (Object[] obj : results) {
				Customer c = new Customer();
				

				String cid = obj[0].toString();
				System.out.println(cid);

				String cust_email1 = obj[3].toString();
				System.out.println(cust_email1);

				String cust_email2 = obj[4].toString();
				System.out.println(cust_email2);
				
				String firstName = obj[1].toString();
				System.out.println(firstName);
				
				String lastName = obj[2].toString();
				System.out.println(lastName);
				
				String mobile1 = obj[5].toString();
				System.out.println(mobile1);
				
				String mobile2 = obj[6].toString();
				System.out.println(mobile2);
				

				int id1 = Integer.parseInt(cid);
				c.setCid(id1);
				c.setCust_email1(cust_email1);
				c.setCust_email2(cust_email2);
				c.setFirstName(firstName);
				c.setLastName(lastName);
				int m1=Integer.parseInt(mobile1);
				c.setMobile1(m1);
				int m2=Integer.parseInt(mobile1);
				c.setMobile2(m2);
				System.out.println(c);
				cList.add(c);

			}
		return cList;
	}

	public void saveAddress(Address address) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(address);
		
	}

	public void deleteAddress(int id) {
		// TODO Auto-generated method stub
		String hql="Delete from Address where aId:id";
		Query q1=session.getCurrentSession().createQuery(hql);
		q1.setParameter("id", id);
		q1.executeUpdate();
		
	}

	public void updateAddress(Address address) {
		// TODO Auto-generated method stub
		session.getCurrentSession().saveOrUpdate(address);
		
	}

	public List<Address> getAddress(int id) {

		Criteria cr=session.getCurrentSession().createCriteria("Address.class");
		cr.add(Restrictions.eq("client.clientId", id));
		ProjectionList prgList = Projections.projectionList();
		prgList.add(Projections.property("aId"));
		prgList.add(Projections.property("area"));
		prgList.add(Projections.property("buildingName"));
		prgList.add(Projections.property("emailId1"));
		prgList.add(Projections.property("emailId2"));
		prgList.add(Projections.property("flatNo"));
		prgList.add(Projections.property("latitude"));
		prgList.add(Projections.property("longitude"));
		prgList.add(Projections.property("name"));
		prgList.add(Projections.property("phoneNo1"));
		prgList.add(Projections.property("phoneNo2"));
		prgList.add(Projections.property("pincode"));
		prgList.add(Projections.property("region"));
		prgList.add(Projections.property("road"));
		prgList.add(Projections.property("shop"));
		prgList.add(Projections.property("state"));
		prgList.add(Projections.property("street"));
		prgList.add(Projections.property("zone"));

		cr.setProjection(prgList);
		List<Object[]> results = cr.list();
		System.out.println(results);
		int i = results.size();
		System.out.println(i);
		Iterator itr = results.iterator();
		
		List<Address> aList = new ArrayList<Address>();
		for (Object[] obj : results) {
			Address add = new Address();

//			String mail = obj[0].toString();
//
//			String eId = obj[1].toString();
//
//			int id1 = Integer.parseInt(eId);
//			email.setEmailId(id1);
//			email.setEmail(mail);
//			eList.add(email);
			
			
			
			String area= obj[0].toString();
			add.setArea(area);
			String buildingName=obj[1].toString();
			add.setBuildingName(buildingName);
			
			String emailId1=obj[2].toString();
			add.setEmailId1(emailId1);
			String emailId2=obj[3].toString();
			add.setEmailId2(emailId2);
			String flatNo=obj[4].toString();
			int f1=Integer.parseInt(flatNo);
			add.setFlatNo(f1);
			
			String latitude=obj[5].toString();
			int l1=Integer.parseInt(latitude);
			add.setLatitude(l1);
			
			String longitude=obj[6].toString();
			int l2=Integer.parseInt(longitude);
			add.setLongitude(l2);
			
			String name=obj[7].toString();
			add.setName(name);
			String phoneNo1=obj[8].toString();
			int p1=Integer.parseInt(phoneNo1);
			add.setPhoneNo1(p1);
			
			String phoneNo2=obj[9].toString();
			int p2=Integer.parseInt(phoneNo2);
			add.setPhoneNo2(p2);
			
			String pincode=obj[10].toString();
			int p3=Integer.parseInt(pincode);
			add.setPincode(p3);
			
			String region=obj[11].toString();
			add.setRegion(region);
			String road=obj[12].toString();
			add.setRoad(road);
			String shop=obj[13].toString();
			add.setShop(shop);
			String state=obj[14].toString();
			add.setState(state);
			String street=obj[15].toString();
			add.setStreet(street);
			String zone=obj[16].toString();
			add.setZone(zone);
			
			String aId=obj[17].toString();
			int a1=Integer.parseInt(aId);
			add.setaId(a1);
			
			aList.add(add);

		}
		
		return aList;
	}
	


	public List<Customer> getCustomer(int id) {

		Criteria cr=session.getCurrentSession().createCriteria("Customer.class");
		cr.add(Restrictions.eq("client.clientId", id));
		ProjectionList prgList = Projections.projectionList();
		
		prgList.add(Projections.property("cid"));
		prgList.add(Projections.property("firstName"));
		prgList.add(Projections.property("lastName"));
		prgList.add(Projections.property("mobile1"));
		prgList.add(Projections.property("mobile2"));
		prgList.add(Projections.property("cust_email1"));
		prgList.add(Projections.property("cust_email2"));
		

		cr.setProjection(prgList);
		List<Object[]> results = cr.list();
		System.out.println(results);
		int i = results.size();
		System.out.println(i);
		Iterator itr = results.iterator();
		
		List<Customer> cList = new ArrayList<Customer>();
		for (Object[] obj : results) {
			Customer cust = new Customer();
			
			String cid=obj[0].toString();
			int c1=Integer.parseInt(cid);
			cust.setCid(c1);
			
			String firstName=obj[1].toString();
			cust.setFirstName(firstName);
			String lastName=obj[2].toString();
			cust.setLastName(lastName);
			String mobile1=obj[3].toString();
			int m1=Integer.parseInt(mobile1);
			cust.setMobile1(m1);
			String mobile2=obj[4].toString();
			int m2=Integer.parseInt(mobile2);
			cust.setMobile2(m2);
			String cust_email1=obj[5].toString();
			cust.setCust_email1(cust_email1);
			String cust_email2=obj[6].toString();
			cust.setCust_email2(cust_email2);
			
			cList.add(cust);

			
		}
		
		
		return cList;
	}

	public List<Clients> getClientById(int id) {
		String hql="select * from Clients where clientId:id";
		Query q1=session.getCurrentSession().createQuery(hql);
		q1.setParameter("id", id);
		q1.executeUpdate();

		return null;
	}



}
