package com.inventory.bean;

import java.util.Date;

import com.inventory.Enum.WheatType;

public class Wheat extends Item{
	
	WheatType wheattype;

	public Wheat(int id, String description, float weight, float price, Date mfg_date, int usebeforeinmonths,
			WheatType wheattype) {
		super(id, description, weight, price, mfg_date, usebeforeinmonths);
		this.wheattype = wheattype;
	}

	public WheatType getWheattype() {
		return wheattype;
	}

	public void setWheattype(WheatType wheattype) {
		this.wheattype = wheattype;
	}

	@Override
	public String toString() {
		return "Wheat [wheattype=" + wheattype + "]";
	}

	
}
