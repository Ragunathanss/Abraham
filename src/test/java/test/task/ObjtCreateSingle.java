package test.task;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ObjtCreateSingle {

	public static void main(String[] args) throws IOException, ParseException {
// mention path of the json file
FileReader fileReader = new FileReader
("C:\\Users\\DELL\\eclipse-workspace\\APIProject\\src\\test\\resources\\ObjtCreateSingle.json");

// create object for jsonParser class
JSONParser jsonParser = new JSONParser();

// pass json file to fetch data
Object parse = jsonParser.parse(fileReader);
//System.out.println(parse); // prints the entire data

// convert object to json object
JSONObject jsonObject = (JSONObject)parse;
// getting into "data" zone
Object object = jsonObject.get("data");
System.out.println(object); // without converting into string also we can print (prints all data

JSONObject jsonObject2 = (JSONObject)object;
Object id = jsonObject2.get("id");
System.out.println(id);

Object email = jsonObject2.get("email");
System.out.println(email);

//Myself not taking return type & combining it in a single step
System.out.println(jsonObject2.get("first_name")); 
System.out.println(jsonObject2.get("last_name"));
System.out.println(jsonObject2.get("avatar"));

//getting into "support" zone
Object object2 = jsonObject.get("support");
JSONObject jsonObject3 = (JSONObject)object2;

System.out.println(jsonObject3.get("url"));
System.out.println(jsonObject3.get("text"));
	}
}
