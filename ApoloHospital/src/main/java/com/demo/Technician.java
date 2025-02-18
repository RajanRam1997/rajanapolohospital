package com.demo;

public class Technician {
	int technicianid;
	String technicianname;
	String machineoperator;
	String mobile;
	int salary;
	public Technician(int technicianid, String technicianname, String machineoperator, String mobile, int salary) {
		super();
		this.technicianid = technicianid;
		this.technicianname = technicianname;
		this.machineoperator = machineoperator;
		this.mobile = mobile;
		this.salary = salary;
	}
	public Technician() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTechnicianid() {
		return technicianid;
	}
	public void setTechnicianid(int technicianid) {
		this.technicianid = technicianid;
	}
	public String getTechnicianname() {
		return technicianname;
	}
	public void setTechnicianname(String technicianname) {
		this.technicianname = technicianname;
	}
	public String getMachineoperator() {
		return machineoperator;
	}
	public void setMachineoperator(String machineoperator) {
		this.machineoperator = machineoperator;
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
		return "Technician [technicianid=" + technicianid + ", technicianname=" + technicianname + ", machineoperator="
				+ machineoperator + ", mobile=" + mobile + ", salary=" + salary + "]";
	}
	
}
