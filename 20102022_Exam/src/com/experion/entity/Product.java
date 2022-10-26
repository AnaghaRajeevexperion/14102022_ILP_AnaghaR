package com.experion.entity;

public class Product {
	private String productCode;
	private String producName;
	private String productType;
	
	
		public Product(String productCode, String producName, String productType) {
			
		this.productCode = productCode;
		this.producName = producName;
		this.productType = productType;
	}
		
		public String getProductCode() {
			return productCode;
		}
		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}
		
		
		public String getProducName() {
			return producName;
		}
		public void setProducName(String producName) {
			this.producName = producName;
		}
		
		
		
		public String getProductType() {
			return productType;
		}
		public void setProductType(String productType) {
			this.productType = productType;
		}
		
		
		}
