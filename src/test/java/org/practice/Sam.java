package org.practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sam {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
File f = new File("C:\\Users\\DELL\\eclipse-workspace\\APIProject\\src\\test\\resources\\Employee.json");

ObjectMapper mapper = new ObjectMapper();
SamPojo readValue = mapper.readValue(f, SamPojo.class);
System.out.println(readValue.getEmail());

ArrayList<EmpDetail> empDetails = readValue.getEmpDetails();

// wihtout foreach loop we cant able to get any value(getAddress, getFirstName, getLastName)
 for (EmpDetail em : empDetails) {
	 
//can't print directly empDetails, need to get it individually	, 
	 //since it is a object and it has many method in 
	 //System.out.println( em);
	System.out.println( em.getAddress());
	System.out.println( em.getFirstName());
	System.out.println( em.getLastName());
}
 
// for (int i = 0; i < empDetails.size(); i++) {
//	 EmpDetail empDetail = empDetails.get(i);
//	// System.out.println(empDetail);  
//	 System.out.println(empDetail.getAddress());
//	 System.out.println(empDetail.getFirstName());
//	 System.out.println(empDetail.getLastName());
//}

	}
}
