package com.example.demo.models;

public class Book_Bill {
	private String barCode;
	private String idBill;
	private int quantity;
	private float money;

	public Book_Bill(String barCode, String idBill, int quantity, float money) {
		this.barCode = barCode;
		this.idBill = idBill;
		this.quantity = quantity;
		this.money = money;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getIdBill() {
		return idBill;
	}

	public void setIdBill(String idBill) {
		this.idBill = idBill;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

}
