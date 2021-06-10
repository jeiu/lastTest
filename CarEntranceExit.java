/*
 * Date			'21.06.10
 * How			김태성	1.0.0 주차장의 차량 입차 및 출차
 * 				박준영	2.0.0 입출차 method 작성
 * 						2.1.0 Date타입의 주차 시작 시간, 주차 종료 시간을 Long타입으로 변경
 * Author		박준영, 김태성
 * Version		2.0.0
 */

package parking;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CarEntranceExit {
	Json js = new Json();
	
	// entranceCarTime, exitCarTime, parkingLotNum, lookupNum 생성 - 14:02 박준영
	// 스캐너 객체 생성 - 11:55 김태성
	Scanner scan = new Scanner(System.in);
	
	String carNum;			// 해당 차량의 번호를 저장하는 변수
	long entranceCarTime;	// 해당 차량의 주차 시작 시간을 저장하는 변수
	long exitCarTime;		// 해당 차량의 주차 종료 시간을 저장하는 변수
	JSONObject parkingLotNum = new JSONObject();
	int lookupNum;			// 입력 받을 주차 공간 값을 찾을 변수
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); // 시간 차이를 구할 데이터 포맷
	int retry;				// 해당 메뉴를 다시 실행할지 
	
	/* 
	 * 입차 메소드 - 11:55 김태성
	 * Json 클래스 사용하여 불러오기 및 데이터 입력, 저장 추가 - 14:05 박준영
	 */
	void carEntrance() {
		
		JSONObject parkingLot  = js.jsonLoad();
		parkingLotNum = new JSONObject();
		
		while(true) {
			
			System.out.println("입차하실 자리의 번호를 입력해 주세요.");
			lookupNum = scan.nextInt();
			if (lookupNum > 60) {
				System.out.println("올바르지 않은 자리입니다.");
				break;
			}
			
			System.out.println("차량 번호를 입력해 주세요.");
			carNum = scan.next();
			entranceCarTime = System.currentTimeMillis();
			
			// Json에 데이터 삽입
			parkingLotNum.put("carNum", carNum);
			parkingLotNum.put("entranceCarTime", entranceCarTime);
			parkingLotNum.put("lookupNum", lookupNum + 1);
			
			JSONArray req_array = new JSONArray();
			req_array.add(parkingLotNum);
			
			parkingLot.put("parkingLotNum" + lookupNum, req_array);
			// Json 데이터 C드라이브에 저장
			try {
				FileWriter file = new FileWriter("c:\\parkingLot.json");
				file.write(parkingLot.toJSONString());
				file.flush();
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("등록할 차량의 번호를 입력해주세요");
			carNum = scan.next();
			
			System.out.println("계속 입력 0, 입력 중지 1");
			retry = scan.nextInt();
			if (retry == 1) {
				break;
			}
		}
	}
	
	/* 
	 * 출차 메소드 - 14:05 박준영
	 */
	
	void carExit() {
		JSONObject parkingLot  = js.jsonLoad();
		parkingLotNum = new JSONObject();		
		
		System.out.println("출차하실 자리의 번호를 입력해 주세요.");
		while(true) {
			lookupNum = scan.nextInt();
			if (lookupNum > 60) {
				System.out.println("올바르지 않은 자리입니다.");
				break;
			}
			
			/* 주차 시간 및 요금 정산
			long exitCarTime = System.currentTimeMillis();
			long TimeDiffrent = ((exitCarTime/1000L) - (entranceCarTime/1000L)) / 124416000L;
			System.out.println("주차 시간은 "+ TimeDiffrent + "입니다.");
			System.out.println("기본 1시간 무료");
			System.out.println("30분당 2,000원");
			*/
			
			// Json에 데이터 초기화
			parkingLotNum.put("carNum", "");
			parkingLotNum.put("entranceCarTime", "");
			parkingLotNum.put("lookupNum", "");
			
			JSONArray req_array = new JSONArray();
			req_array.add(parkingLotNum);
			
			parkingLot.put("parkingLotNum" + lookupNum, req_array);
			// Json 데이터 C드라이브에 저장
			try {
				FileWriter file = new FileWriter("c:\\parkingLot.json");
				file.write(parkingLot.toJSONString());
				file.flush();
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("계속 입력 0, 입력 중지 1");
			retry = scan.nextInt();
			if (retry == 1) {
				break;
			}
		}
	}
}
