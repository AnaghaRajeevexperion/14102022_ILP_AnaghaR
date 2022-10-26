package com.experion.entity;

public class Card extends Product {
	
	private String cardType;

	public Card(String productCode, String producName, String productType, String cardType)
	{
		super(productCode, producName, productType);
		this.cardType = cardType;
	}

	public String getCardType()
	{
		return cardType;
	}

	public void setCardType(String cardType)
	{
		this.cardType = cardType;
	}

	
	
	

}
