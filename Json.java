package parking;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
 * Date			'21.06.10 11:59
 * How			박준영	로컬 json파일 불러오는 method, json파일 저장하는 method
 * Author		박준영
 * Version		1.1.0
 */

public class Json {
	CarEntranceExit cee = new CarEntranceExit();
	
	public JSONObject jsonLoad() {
		JSONParser parser = new JSONParser();
		JSONObject parkingLot = new JSONObject();
		
		// Load past json file
		try {
			Object savedJson = parser.parse(new FileReader("c:\\parkingLot.json"));
			parkingLot = (JSONObject)savedJson;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			try {
				// If file not founded save empty file
				FileWriter file = new FileWriter("c:\\parkingLot.json");
				file.write(parkingLot.toJSONString());
				file.flush();
				file.close();
			} catch (IOException f) {
				f.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return parkingLot;
	}
}
