package org.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {
	// using API.json file
	public static void main(String[] args) throws IOException, ParseException {
		
// mention the path of full json file	
FileReader fileReader = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\APIProject\\src\\test\\resources\\Sample.json");

// create object for json parse class
JSONParser jsonParser = new JSONParser();

// pass the json file to fetch data
Object parse = jsonParser.parse(fileReader);

// convert object to Json object ---->class casting
JSONObject jsonObject = (JSONObject) parse;

Object name = jsonObject.get("name");  // prints the value of name in accordance to the json file we gave
System.out.println(name);

//prints the value of payment in accordance to the json file we gave, in this case prints all things in payment bracket{}
Object object = jsonObject.get("payment");  
System.out.println(object); //object is directly printing without changing it to String

Object paytm = jsonObject.get("paytm"); // if we call any value without creating type cast obj ref name, it shows null
System.out.println("paytm before creating object " +paytm);

JSONObject jsonObject2 = (JSONObject)object;
Object object2 = jsonObject2.get("gpay");
System.out.println(object2);

Object object3 = jsonObject2.get("phonepay");
System.out.println(object3);

Object paytmReal = jsonObject2.get("paytm"); // if we call any value without creating type cast obj ref name, it shows null
System.out.println("paytm after creating object "+paytmReal);

//System.out.println(parse); // prints all the values in random manner from the json file

	}

}
