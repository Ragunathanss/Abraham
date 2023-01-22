package com.test;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.ArraySmall;

public class ArrayPojo {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		// path of json file
File file = new File("C:\\Users\\DELL\\eclipse-workspace\\APIProject\\src\\test\\resources\\Array.json");

// create object for page object mapper
ObjectMapper mapper = new ObjectMapper();
ArraySmall read = mapper.readValue(file, ArraySmall.class);

System.out.println(read.getCourses());
System.out.println(read.getEmail());
System.out.println(read.getName());
System.out.println(read.getPhonNo());


	}

}
