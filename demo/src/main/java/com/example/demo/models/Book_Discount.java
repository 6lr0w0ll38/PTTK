package com.example.demo.models;

public class Book_Discount {
	private String barCode;
	private String idDiscount;

	public Book_Discount(String barCode, String idDiscount) {
		this.barCode = barCode;
		this.idDiscount = idDiscount;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String BarCode) {
		this.barCode = BarCode;
	}

	public String getIdDiscount() {
		return idDiscount;
	}

	public void setIdDiscount(String idDiscount) {
		this.idDiscount = idDiscount;
	}

}
