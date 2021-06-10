/* 해당클래스는 주차장의 차량을 등록하고 조회하는 목적이다.
 * 작성시간 : 21.06.10 - 11:45
 * 수정시간 : 21.06.10 - 11:55
 * 수정내용 : 차량 등록과 조회하는 목적이다.
 * 작성자 : 김태성
 */


package parking;

import java.util.Date;
import java.util.Scanner;

public class CarEntrance {
	
	//스캐너 객체 생성 - 11:55 김태성
	Scanner scan = new Scanner(System.in);
	
	String carNum;			//해당 차량의 번호를 저장하는 변수
	int parkingNum;			//해당 차량의 주차번호를 저장하는 변수
	Date entranceCarTime;	//해당 차량의 주차시작 시간을 저장하는 볂수
	
	int retry;				//해당 메뉴를 다시 실행할지 
	
	
	//차량의 정보를 등록할 메소드 - 11:55 김태성
	void carEntrance() {
		while(true) {
			carNum = null;
			parkingNum = 0;
			entranceCarTime = null;
			// 오류를 예방하기위한 초기화
			
			System.out.println("등록할 차량의 번호를 입력해주세요");
			carNum = scan.next();
			entranceCarTime = new Date();
			
			
			
		}
	}

}
