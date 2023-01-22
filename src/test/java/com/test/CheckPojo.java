package com.test;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Address;
import com.pojo.TrialPojo;

public class CheckPojo {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
// path of json file	
File file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\TrialPojo.json");

//create object for object Mapper class
ObjectMapper mapper = new ObjectMapper();

// pass json file fetch values
TrialPojo emp = mapper.readValue(file, TrialPojo.class);

System.out.println(emp.getName());
System.out.println(emp.getEmail());
System.out.println(emp.getPhonNo());

System.out.println(emp.getAddress()); // prints the location
Address address = emp.getAddress();  // want ref name to get street,pincode and state
System.out.println(address.getStreetName());
System.out.println(address.getPincode());
System.out.println(address.getState());


	}

}
