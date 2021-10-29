package package1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;

//import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ConvertJSONtoJavaObject {
	static // FileReader reader;
	FileReader reader = null;

	public static void main(String[] args) {

		try {
			reader = new FileReader(
					"D:\\AddressJSONDeserialize\\AddressJSONDeserialize\\src\\test\\java\\package1\\AdressJSON.json");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		JSONParser parser = new JSONParser();
		Object ob1 = null;
		try {
			ob1 = parser.parse(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JSONObject jobject = (JSONObject) ob1;
		String ctry = (String) jobject.get("Country");
		String apt = (String) jobject.get("AppartmentName");
		String ste = (String) jobject.get("State");
		String BNo = (String) jobject.get("BuildingNo");
		String zip = (String) jobject.get("Zipcode");
		String str = (String) jobject.get("Street");
		Address address = new Address(BNo, apt, str, zip, ste,ctry);
		System.out.println(address);
	}

}
