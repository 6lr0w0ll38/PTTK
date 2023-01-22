package com.example.demo.models;

public class Discount {
	private String id;
	private String name;
	private String dayBegin;
	private String dayEnd;
	private String method; // maybe by book or by bill
	private float discount;

	public Discount(String id, String name, String dayBegin, String dayEnd, String method, float discount) {
		this.id = id;
		this.name = name;
		this.dayBegin = dayBegin;
		this.dayEnd = dayEnd;
		this.method = method;
		this.discount = discount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDayBegin() {
		return dayBegin;
	}

	public void setDayBegin(String dayB) {
		this.dayBegin = dayB;
	}

	public String getDayEnd() {
		return dayEnd;
	}

	public void setDayEnd(String dayE) {
		this.dayEnd = dayE;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

}
