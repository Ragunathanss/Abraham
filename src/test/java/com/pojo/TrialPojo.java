package com.pojo;

public class TrialPojo {

	private String name;
	private String email;
	private long phonNo;
	private Address address;
	
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
	public Address getAddress() { // this Address has the access of the Address Class (see open declaration)
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
    
}
