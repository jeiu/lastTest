package parking;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
 * Date			'21.06.10 11:59
 * How			���ؿ�	1.0.0 ���� json���� �ҷ����� method, json���� �����ϴ� method
 * 						1.1.0 json������ �����ϴ� method ����
 * 						2.0.0 �ʱ� json������ �����ϴ� method ����
 * Author		���ؿ�
 * Version		2.0.0
 */

public class Json {
	CarEntranceExit cee = new CarEntranceExit();
	
	
	static JSONObject jsonLoad() {
		JSONParser parser = new JSONParser();
		JSONObject parkingLot = new JSONObject();
		// ����� Json ���� �ҷ�����
		try {
			Object savedJson = parser.parse(new FileReader("C:\\Users\\admin\\parkingLot.json"));
			parkingLot = (JSONObject)savedJson;
		} catch (FileNotFoundException e) {
			System.out.println("�ʱ� Json ������ �����մϴ�.");
			jsonDefualt();
			// e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return parkingLot;
	}
	
	// �ʱ� json ������ �����ϴ� method
	static void jsonDefualt() {
		JSONObject parkingLot = new JSONObject();
		JSONArray parkingLotNum = new JSONArray();
		for (int i = 0 ; i < 60 ; i++) {
			parkingLotNum = new JSONArray();
			parkingLotNum.add("");
			parkingLotNum.add("");
			parkingLot.put((i + 1), parkingLotNum);
		}
		// Json ������ C����̺꿡 ����
		try {
			FileWriter file = new FileWriter("C:\\Users\\admin\\parkingLot.json");
			file.write(parkingLot.toJSONString());
			file.flush();
			file.close();
		} catch (IOException e) {
			// ���� ���н� ������ ��� �� method ����
			System.out.println("�ʱ� Json ���� ������ �����߽��ϴ�.");
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("�ʱ� Json ���� ������ �����߽��ϴ�.");
	}
}

