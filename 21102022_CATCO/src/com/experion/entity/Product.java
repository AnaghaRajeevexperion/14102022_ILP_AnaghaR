package com.experion.entity;

import java.util.ArrayList;

public class Product
{

	private String productCode;
	private String productName;
	private ArrayList<BankServices> serviceList;
	public Product(String productCode, String productName, ArrayList<BankServices> serviceList) {
	
		this.productCode = productCode;
		this.productName = productName;
		this.serviceList = serviceList;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public ArrayList<BankServices> getServiceList() {
		return serviceList;
	}
	public void setServiceList(ArrayList<BankServices> serviceList) {
		this.serviceList = serviceList;
	}
	
	
	
}
