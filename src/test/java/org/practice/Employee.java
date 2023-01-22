package org.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Employee {
	
	public static void main(String[] args) throws IOException, ParseException {
FileReader fileReader = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\APIProject\\src\\test\\resources\\Employee.json");
JSONParser jsonParser = new JSONParser();
Object parse = jsonParser.parse(fileReader);
JSONObject jsonObject = (JSONObject)parse;
Object object = jsonObject.get("name");
Object object2 = jsonObject.get("empDetails");
System.out.println(object2);

JSONArray array = (JSONArray)object2;
System.out.println(array.get(0)); // prints the 0th index empDetails

for (int i = 0; i < array.size(); i++) {
	Object object3 = array.get(i);
	JSONObject jsonObject2 = (JSONObject)object3;
	
	// prints all the 3 values of 3 empDetails
	System.out.println(jsonObject2.get("firstName"));
	System.out.println(jsonObject2.get("lastName"));
	System.out.println(jsonObject2.get("address"));
}
	}

}
