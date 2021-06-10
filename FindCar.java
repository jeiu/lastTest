package parking;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/* Date : 21.06.10
 * How : ��ü���� ��ȸ�� ���ִ� Ŭ����
 * Author : ���¿�
 * Version : 1.0
 */
public class FindCar {
	Scanner scan = new Scanner(System.in);
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	Json js = new Json();
	
	JSONObject parkobj = js.jsonLoad();
	
	// ����ĭ�� ���� ��ȸ �޼ҵ�
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

		System.out.println("����ĭ ��ȣ�� �Է����ּ���");
		int searchCar = scan.nextInt();
		
		System.out.println(map.get(searchCar));
	}		
	
	// ������ ��ġ ��ȸ �޼ҵ�
	public void searchLot() {
		
	}
	
	// �� ����ĭ�� ã�� �޼ҵ�
	public void emptyLot() {
		
	}
	
}
