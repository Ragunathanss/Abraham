package test.task;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.ArrayPojo;

public class PojoArray {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
File file = new File("C:\\Users\\DELL\\eclipse-workspace\\APIProject\\src\\test\\resources\\ListArray.json");
ObjectMapper mapper = new ObjectMapper();

TestArray read = mapper.readValue(file,TestArray.class); // return the class name that is created

ArrayList<Data> data = read.getData();

for (Data d : data) {
	System.out.println(d.getAvatar());
	System.out.println(d.getEmail());
	System.out.println(d.getFirst_name());
	System.out.println(d.getId());
	System.out.println(d.getLast_name());
}

// support is not in array so we can get it directly
Support support = read.getSupport();
System.out.println(support.getUrl());
System.out.println(support.getText());
	}
}
