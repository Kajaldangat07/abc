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
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="address")
public class Address 
{    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "aId")
	private long aId;

    @Column(name = "name")
	private String name;
    @Column(name = "shop")
    private String shop;
    @Column(name = "buildingName")
    private String buildingName;
    @Column(name = "flatNo")
    private int flatNo;
    @Column(name = "road")
    private String road;
    @Column(name = "street")
    private String street;
    @Column(name = "area")
    private String area;
    
    @Column(name = "region")
    private String region;
    @Column(name = "zone")
    private String zone;
    @Column(name = "state")
    private String state;
    @Column(name = "pincode")
    private long pincode;
    @Column(name = "phoneNo1")
    private long phoneNo1;
    @Column(name = "phoneNo2")
    private long phoneNo2;
    @Column(name = "emailId1")
    private String emailId1;
    @Column(name = "emailId2")
    private String emailId2;
    @Column(name = "latitude")
    private long latitude;
    @Column(name = "longitude")
    private long longitude;
    
    
    @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Clients clientDetails;
     
//    @O(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//	@JoinColumn(name = "clientId")
//    private Clients clientDetails;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(long aId, String name, String shop, String buildingName, int flatNo, String road, String street,
			String area, String region, String zone, String state, long pincode, long phoneNo1, long phoneNo2,
			String emailId1, String emailId2, long latitude, long longitude, Clients clientDetails) {
		super();
		this.aId = aId;
		this.name = name;
		this.shop = shop;
		this.buildingName = buildingName;
		this.flatNo = flatNo;
		this.road = road;
		this.street = street;
		this.area = area;
		this.region = region;
		this.zone = zone;
		this.state = state;
		this.pincode = pincode;
		this.phoneNo1 = phoneNo1;
		this.phoneNo2 = phoneNo2;
		this.emailId1 = emailId1;
		this.emailId2 = emailId2;
		this.latitude = latitude;
		this.longitude = longitude;
		this.clientDetails = clientDetails;
	}

	public long getaId() {
		return aId;
	}

	public void setaId(long aId) {
		this.aId = aId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShop() {
		return shop;
	}

	public void setShop(String shop) {
		this.shop = shop;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public long getPhoneNo1() {
		return phoneNo1;
	}

	public void setPhoneNo1(long phoneNo1) {
		this.phoneNo1 = phoneNo1;
	}

	public long getPhoneNo2() {
		return phoneNo2;
	}

	public void setPhoneNo2(long phoneNo2) {
		this.phoneNo2 = phoneNo2;
	}

	public String getEmailId1() {
		return emailId1;
	}

	public void setEmailId1(String emailId1) {
		this.emailId1 = emailId1;
	}

	public String getEmailId2() {
		return emailId2;
	}

	public void setEmailId2(String emailId2) {
		this.emailId2 = emailId2;
	}

	public long getLatitude() {
		return latitude;
	}

	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}

	public long getLongitude() {
		return longitude;
	}

	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}

	public Clients getClientDetails() {
		return clientDetails;
	}

	public void setClientDetails(Clients clientDetails) {
		this.clientDetails = clientDetails;
	}

	@Override
	public String toString() {
		return "Address [aId=" + aId + ", name=" + name + ", shop=" + shop + ", buildingName=" + buildingName
				+ ", flatNo=" + flatNo + ", road=" + road + ", street=" + street + ", area=" + area + ", region="
				+ region + ", zone=" + zone + ", state=" + state + ", pincode=" + pincode + ", phoneNo1=" + phoneNo1
				+ ", phoneNo2=" + phoneNo2 + ", emailId1=" + emailId1 + ", emailId2=" + emailId2 + ", latitude="
				+ latitude + ", longitude=" + longitude + ", clientDetails=" + clientDetails + "]";
	}
	
}
