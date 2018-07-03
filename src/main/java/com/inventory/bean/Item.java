package com.inventory.bean;

import java.util.Date;

public class Item {
	
	int id;
	String description;
	float weight;
	float price;
	Date mfg_Date;
	int useBeforeInMonths;
	Date expiryDate;
	public Item(int id, String description, float weight, float price, Date mfg_date, int usebeforeinmonths) {
		super();
		this.id = id;
		this.description = description;
		this.weight = weight;
		this.price = price;
		this.mfg_Date = mfg_date;
		this.useBeforeInMonths = usebeforeinmonths;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getMfg_Date() {
		return mfg_Date;
	}
	public void setMfg_Date(Date mfg_date) {
		this.mfg_Date = mfg_date;
	}
	public int getUsebeforeinmonths() {
		return useBeforeInMonths;
	}
	public void setUsebeforeinmonths(int usebeforeinmonths) {
		this.useBeforeInMonths = usebeforeinmonths;
	}
	@Override
	public String toString() {
		return "item [id=" + id + ", description=" + description + ", weight=" + weight + ", price=" + price
				+ ", mfg_date=" + mfg_Date + ", usebeforeinmonths=" + useBeforeInMonths + "]";
	}
	
	

}
