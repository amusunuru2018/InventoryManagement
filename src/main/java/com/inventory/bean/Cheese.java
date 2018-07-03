package com.inventory.bean;

import java.util.Date;

import com.inventory.Enum.CheeseType;

public class Cheese extends Item{
	
	
	CheeseType cheesetype;
	double protein;
	double vitaminB1;
	double fat;
	public Cheese(int id, String description, float weight, float price, Date mfg_date, int usebeforeinmonths,
			CheeseType type, double protein, double vitaminB1, double fat) {
		super(id, description, weight, price, mfg_date, usebeforeinmonths);
		this.cheesetype = type;
		this.protein = protein;
		this.vitaminB1 = vitaminB1;
		this.fat = fat;
	}
	public CheeseType getType() {
		return cheesetype;
	}
	public void setType(CheeseType type) {
		this.cheesetype = type;
	}
	public double getProtein() {
		return protein;
	}
	public void setProtein(double protein) {
		this.protein = protein;
	}
	public double getVitaminB1() {
		return vitaminB1;
	}
	public void setVitaminB1(double vitaminB1) {
		this.vitaminB1 = vitaminB1;
	}
	public double getFat() {
		return fat;
	}
	public void setFat(double fat) {
		this.fat = fat;
	}
	@Override
	public String toString() {
		return "cheese [type=" + cheesetype + ", protein=" + protein + ", vitaminB1=" + vitaminB1 + ", fat=" + fat + "]";
	}
	
	
	

}
