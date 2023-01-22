package org.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Array {

	public static void main(String[] args) throws IOException, ParseException {
		
FileReader fileReader = new FileReader
("C:\\Users\\DELL\\eclipse-workspace\\APIProject\\src\\test\\resources\\Array.json");

JSONParser jsonParser = new JSONParser();
Object parse = jsonParser.parse(fileReader);

JSONObject jsonObject = (JSONObject)parse;

// 1st get the name then only we can get value
Object object = jsonObject.get("name");
System.out.println(object);

Object object2 = jsonObject.get("courses");
JSONArray array = (JSONArray)object2; // we are calling array so using JSONArray
System.out.println(array.get(0)); // index based o/p :sql

for (int i = 0; i < array.size(); i++) {
	Object object3 = array.get(i);
	System.out.println(object3);
}
	}
}
