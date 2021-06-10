package parking;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/* Date : 21.06.10
 * How : 전체적인 조회를 해주는 클래스
 * Author : 유승원
 * Version : 1.0
 */
public class FindCar {
	Scanner scan = new Scanner(System.in);
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	Json js = new Json();
	
	JSONObject parkobj = js.jsonLoad();
	
	// 주차칸의 차량 조회 메소드
	public void searchCar() {
		for(int i=0; i<60; i++) {
			JSONArray jarr = (JSONArray) parkobj.get("parkingLotNum"+i);
			
			for(int j=0; j<jarr.size(); j++) {
				JSONObject tmp = (JSONObject)jarr.get(j);
				
				String carNum = (String)tmp.get("carNum");
				int lookupNum = (int) tmp.get("lookupNum");
				
				map.put(lookupNum, carNum);
			}
		}

		System.out.println("주차칸 번호를 입력해주세요");
		int searchCar = scan.nextInt();
		
		System.out.println(map.get(searchCar));
	}		
	
	// 차량의 위치 조회 메소드
	public void searchLot() {
		
	}
	
	// 빈 주차칸을 찾는 메소드
	public void emptyLot() {
		
	}
	
}
