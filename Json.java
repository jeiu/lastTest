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
 * How			박준영	1.0.0 로컬 json파일 불러오는 method, json파일 저장하는 method
 * 						1.1.0 json파일을 저장하는 method 삭제
 * 						2.0.0 초기 json파일을 생성하는 method 생성
 * Author		박준영
 * Version		2.0.0
 */

public class Json {
	CarEntranceExit cee = new CarEntranceExit();
	
	
	static JSONObject jsonLoad() {
		JSONParser parser = new JSONParser();
		JSONObject parkingLot = new JSONObject();
		// 저장된 Json 파일 불러오기
		try {
			Object savedJson = parser.parse(new FileReader("C:\\Users\\admin\\parkingLot.json"));
			parkingLot = (JSONObject)savedJson;
		} catch (FileNotFoundException e) {
			System.out.println("초기 Json 파일을 생성합니다.");
			jsonDefualt();
			// e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return parkingLot;
	}
	
	// 초기 json 파일을 생성하는 method
	static void jsonDefualt() {
		JSONObject parkingLot = new JSONObject();
		JSONArray parkingLotNum = new JSONArray();
		for (int i = 0 ; i < 60 ; i++) {
			parkingLotNum = new JSONArray();
			parkingLotNum.add("");
			parkingLotNum.add("");
			parkingLot.put((i + 1), parkingLotNum);
		}
		// Json 데이터 C드라이브에 저장
		try {
			FileWriter file = new FileWriter("C:\\Users\\admin\\parkingLot.json");
			file.write(parkingLot.toJSONString());
			file.flush();
			file.close();
		} catch (IOException e) {
			// 저장 실패시 에러문 출력 후 method 종료
			System.out.println("초기 Json 파일 생성을 실패했습니다.");
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("초기 Json 파일 생성을 성공했습니다.");
	}
}

