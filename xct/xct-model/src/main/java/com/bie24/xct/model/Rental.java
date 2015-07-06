package com.bie24.xct.model;

public class Rental {
	private int id;
	private int rentalType;
	private double price;
	private int payType;
	private String area;
	private String forward;
	private int renovation;
	private int totalFloor;
	private int floor;
	private String addr;
	private int intime;
	private String tel;
	private String desc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRentalType() {
		return rentalType;
	}

	public void setRentalType(int rentalType) {
		this.rentalType = rentalType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPayType() {
		return payType;
	}

	public void setPayType(int payType) {
		this.payType = payType;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getForward() {
		return forward;
	}

	public void setForward(String forward) {
		this.forward = forward;
	}

	public int getRenovation() {
		return renovation;
	}

	public void setRenovation(int renovation) {
		this.renovation = renovation;
	}

	public int getTotalFloor() {
		return totalFloor;
	}

	public void setTotalFloor(int totalFloor) {
		this.totalFloor = totalFloor;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getIntime() {
		return intime;
	}

	public void setIntime(int intime) {
		this.intime = intime;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
