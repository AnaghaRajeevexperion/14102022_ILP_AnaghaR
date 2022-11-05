package com.experion.entity;

public class Address {

	private String houseNo;
	private String city;
	public Address(String houseNo, String city) {
		super();
		this.houseNo = houseNo;
		this.city = city;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
