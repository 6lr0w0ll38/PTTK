package com.example.demo.models;

public class Bill {
	private String idBill;
	private String timeCreate;
	private float sumMoney;
	private String idDiscount;

	public Bill(String idBill, String timeCreate, float sumMoney, String idDiscount) {
		this.idBill = idBill;
		this.timeCreate = timeCreate;
		this.sumMoney = sumMoney;
		this.idDiscount = idDiscount;
	}

	public String getIdBill() {
		return idBill;
	}

	public void setIdBill(String idBill) {
		this.idBill = idBill;
	}

	public String getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(String timeCreate) {
		this.timeCreate = timeCreate;
	}

	public float getSumMoney() {
		return sumMoney;
	}

	public void setSumMoney(float sumMoney) {
		this.sumMoney = sumMoney;
	}

	public String getIdDiscount() {
		return idDiscount;
	}

	public void setIdDiscount(String idDiscount) {
		this.idDiscount = idDiscount;
	}

}
