/*
 * Date			'21.06.10
 * How			���¼�	1.0.0 �������� ���� ���� �� ����
 * 				���ؿ�	2.0.0 ������ method �ۼ�
 * 						2.1.0 DateŸ���� ���� ���� �ð�, ���� ���� �ð��� LongŸ������ ����
 * Author		���ؿ�, ���¼�
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
	
	// entranceCarTime, exitCarTime, parkingLotNum, lookupNum ���� - 14:02 ���ؿ�
	// ��ĳ�� ��ü ���� - 11:55 ���¼�
	Scanner scan = new Scanner(System.in);
	
	String carNum;			// �ش� ������ ��ȣ�� �����ϴ� ����
	long entranceCarTime;	// �ش� ������ ���� ���� �ð��� �����ϴ� ����
	long exitCarTime;		// �ش� ������ ���� ���� �ð��� �����ϴ� ����
	JSONObject parkingLotNum = new JSONObject();
	int lookupNum;			// �Է� ���� ���� ���� ���� ã�� ����
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); // �ð� ���̸� ���� ������ ����
	int retry;				// �ش� �޴��� �ٽ� �������� 
	
	/* 
	 * ���� �޼ҵ� - 11:55 ���¼�
	 * Json Ŭ���� ����Ͽ� �ҷ����� �� ������ �Է�, ���� �߰� - 14:05 ���ؿ�
	 */
	void carEntrance() {
		
		JSONObject parkingLot  = js.jsonLoad();
		parkingLotNum = new JSONObject();
		
		while(true) {
			
			System.out.println("�����Ͻ� �ڸ��� ��ȣ�� �Է��� �ּ���.");
			lookupNum = scan.nextInt();
			if (lookupNum > 60) {
				System.out.println("�ùٸ��� ���� �ڸ��Դϴ�.");
				break;
			}
			
			System.out.println("���� ��ȣ�� �Է��� �ּ���.");
			carNum = scan.next();
			entranceCarTime = System.currentTimeMillis();
			
			// Json�� ������ ����
			parkingLotNum.put("carNum", carNum);
			parkingLotNum.put("entranceCarTime", entranceCarTime);
			parkingLotNum.put("lookupNum", lookupNum + 1);
			
			JSONArray req_array = new JSONArray();
			req_array.add(parkingLotNum);
			
			parkingLot.put("parkingLotNum" + lookupNum, req_array);
			// Json ������ C����̺꿡 ����
			try {
				FileWriter file = new FileWriter("c:\\parkingLot.json");
				file.write(parkingLot.toJSONString());
				file.flush();
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("����� ������ ��ȣ�� �Է����ּ���");
			carNum = scan.next();
			
			System.out.println("��� �Է� 0, �Է� ���� 1");
			retry = scan.nextInt();
			if (retry == 1) {
				break;
			}
		}
	}
	
	/* 
	 * ���� �޼ҵ� - 14:05 ���ؿ�
	 */
	
	void carExit() {
		JSONObject parkingLot  = js.jsonLoad();
		parkingLotNum = new JSONObject();		
		
		System.out.println("�����Ͻ� �ڸ��� ��ȣ�� �Է��� �ּ���.");
		while(true) {
			lookupNum = scan.nextInt();
			if (lookupNum > 60) {
				System.out.println("�ùٸ��� ���� �ڸ��Դϴ�.");
				break;
			}
			
			/* ���� �ð� �� ��� ����
			long exitCarTime = System.currentTimeMillis();
			long TimeDiffrent = ((exitCarTime/1000L) - (entranceCarTime/1000L)) / 124416000L;
			System.out.println("���� �ð��� "+ TimeDiffrent + "�Դϴ�.");
			System.out.println("�⺻ 1�ð� ����");
			System.out.println("30�д� 2,000��");
			*/
			
			// Json�� ������ �ʱ�ȭ
			parkingLotNum.put("carNum", "");
			parkingLotNum.put("entranceCarTime", "");
			parkingLotNum.put("lookupNum", "");
			
			JSONArray req_array = new JSONArray();
			req_array.add(parkingLotNum);
			
			parkingLot.put("parkingLotNum" + lookupNum, req_array);
			// Json ������ C����̺꿡 ����
			try {
				FileWriter file = new FileWriter("c:\\parkingLot.json");
				file.write(parkingLot.toJSONString());
				file.flush();
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("��� �Է� 0, �Է� ���� 1");
			retry = scan.nextInt();
			if (retry == 1) {
				break;
			}
		}
	}
}
