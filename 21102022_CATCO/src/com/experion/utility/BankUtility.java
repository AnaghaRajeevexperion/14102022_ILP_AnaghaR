package com.experion.utility;

import java.util.ArrayList;

import com.experion.entity.BankServices;
import com.experion.entity.Product;

public class BankUtility {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<BankServices> allServicesList = new ArrayList<BankServices>();
		allServicesList=BankServices.createServices();
		productList = BankServices.createProducts(allServicesList);
		for(Product product : productList)
		{
			System.out.println(product.getProductName());
			for(BankServices service : product.getServiceList())
			{
				System.out.println(service.getServiceName());
			}

	}

	}}