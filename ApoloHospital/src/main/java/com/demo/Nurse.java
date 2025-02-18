package com.demo;

public class Nurse {
	int nurseid;
	String nursename;
	String mobile;
	int salary;
	public Nurse(int nurseid, String nursename, String mobile, int salary) {
		super();
		this.nurseid = nurseid;
		this.nursename = nursename;
		this.mobile = mobile;
		this.salary = salary;
	}
	public Nurse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNurseid() {
		return nurseid;
	}
	public void setNurseid(int nurseid) {
		this.nurseid = nurseid;
	}
	public String getNursename() {
		return nursename;
	}
	public void setNursename(String nursename) {
		this.nursename = nursename;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Nurse [nurseid=" + nurseid + ", nursename=" + nursename + ", mobile="
				+ mobile + ", salary=" + salary + "]";
	}
	
}
