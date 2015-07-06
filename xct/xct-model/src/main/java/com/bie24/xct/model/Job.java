package com.bie24.xct.model;

import java.util.Date;

public class Job {
	private int id;
	private String name;
	private int numPers;
	private int salary;
	private int education;
	private int workingYears;
	private int workingAddr;
	private String tel;
	private String website;
	private String email;
	private Date createTime;
	private int createUser;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumPers() {
		return numPers;
	}

	public void setNumPers(int numPers) {
		this.numPers = numPers;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getEducation() {
		return education;
	}

	public void setEducation(int education) {
		this.education = education;
	}

	public int getWorkingYears() {
		return workingYears;
	}

	public void setWorkingYears(int workingYears) {
		this.workingYears = workingYears;
	}

	public int getWorkingAddr() {
		return workingAddr;
	}

	public void setWorkingAddr(int workingAddr) {
		this.workingAddr = workingAddr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getCreateUser() {
		return createUser;
	}

	public void setCreateUser(int createUser) {
		this.createUser = createUser;
	}

}
