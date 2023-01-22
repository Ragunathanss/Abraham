package test.task;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ListArray {

	public static void main(String[] args) throws IOException, ParseException {
FileReader fileReader = new FileReader
("C:\\Users\\DELL\\eclipse-workspace\\APIProject\\src\\test\\resources\\ListArray.json");
JSONParser jsonParser = new JSONParser();

Object parse = jsonParser.parse(fileReader);
JSONObject jsonObject = (JSONObject)parse;
System.out.println(jsonObject.get("page"));
System.out.println(jsonObject.get("total"));

Object object = jsonObject.get("data");
JSONArray array = (JSONArray)object;
System.out.println(array.get(1));

for (int i = 0; i < array.size(); i++) {
	Object object2 = array.get(i);
	JSONObject jsonObject2 = (JSONObject)object2;
	System.out.println(jsonObject2.get("email"));
	System.out.println(jsonObject2.get("id"));
	System.out.println(jsonObject2.get("first_name"));
	System.out.println(jsonObject2.get("last_name"));
	System.out.println(jsonObject2.get("avatar"));
	}

Object object2 = jsonObject.get("support");
JSONObject jsonObject2 = (JSONObject)object2;
System.out.println(jsonObject2.get("text"));
System.out.println(jsonObject2.get("url"));

	}
}
