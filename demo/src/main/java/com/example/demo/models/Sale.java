package com.example.demo.models;

// lieu co can thiet doi tuong nay?
public class Sale {
	private String day;
	private float sumSale;

	public Sale(String day, float sumSale) {
		this.day = day;
		this.sumSale = sumSale;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public float getSumSale() {
		return sumSale;
	}

	public void setSumSale(float sumSale) {
		this.sumSale = sumSale;
	}

}
