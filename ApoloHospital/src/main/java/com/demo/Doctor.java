package com.demo;

public class Doctor {
	int doctorid;
	String doctorname;
	String specialization;
	String mobile;
	int fees;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Doctor(int doctorid, String doctorname, String specialization,String mobile,int fees) {
		super();
		this.doctorid = doctorid;
		this.doctorname = doctorname;
		this.specialization = specialization;
		this.mobile=mobile;
		this.fees=fees;
	}

	public int getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile; 
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Doctor [doctorid=" + doctorid + ", doctorname=" + doctorname + ", specialization=" + specialization
				+ ", mobile=" + mobile + ", fees=" + fees + "]";
	}
}
