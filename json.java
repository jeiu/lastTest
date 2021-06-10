package parking;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class json {
	public void jsonLoad() {
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
	}
	
	public void jsonSave() {
		CarEntranceExit cee = new CarEntranceExit();
		cee.entranceCar
		cee.exitCar
		
		JSONObject jsonObject = cee.parkingLot;
		
		try {
			FileWriter file = new FileWriter("c:\\parkingLot.json");
			file.write(jsonObject.toJSONString());
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
