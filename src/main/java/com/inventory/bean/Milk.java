package com.inventory.bean;

import java.util.Date;

import com.inventory.Enum.MilkType;

public class Milk extends Item{
	
	int fatrate;
	MilkType milktype;
	
	public Milk(int id, String description, float weight, float price, Date mfg_date, int usebeforeinmonths,
			int fatrate, MilkType milktype) {
		super(id, description, weight, price, mfg_date, usebeforeinmonths);
		this.fatrate = fatrate;
		this.milktype = milktype;
	}
	
	public int getFatrate() {
		return fatrate;
	}
	public void setFatrate(int fatrate) {
		this.fatrate = fatrate;
	}
	public MilkType getMilktype() {
		return milktype;
	}
	public void setMilktype(MilkType milktype) {
		this.milktype = milktype;
	}
	@Override
	public String toString() {
		return "Milk [fatrate=" + fatrate + ", milktype=" + milktype + "]";
	}
	
	

}
