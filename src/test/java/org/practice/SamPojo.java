package org.practice;

import java.util.ArrayList;

public class SamPojo {

	private String name;
	private String email;
	private long phonNo;
	private ArrayList<EmpDetail> empDetails;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhonNo() {
		return phonNo;
	}
	public void setPhonNo(long phonNo) {
		this.phonNo = phonNo;
	}
	public ArrayList<EmpDetail> getEmpDetails() {
		return empDetails;
	}
	public void setEmpDetails(ArrayList<EmpDetail> empDetails) {
		this.empDetails = empDetails;
	}
	
	
}
