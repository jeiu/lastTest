/* 해당프로그램은 주차장의 차량을 관리하는 목적이다.
 * 작성시간 : 21.06.10 - 10:33 
 * 수정시간 : 21.06.10 - 10:48
 * 수정내용 : Main 클래스의 기본 틀 제작
 * 작성자 : 김태성
 */



package parking;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//사용자의 메뉴 선택을 위한 스캐너 객체와 메뉴 변수 선언 - 10:40
		Scanner scan = new Scanner(System.in);
		int menu;

		//메뉴 작업 종료후 다시 다른 작업을 할 수 있게 반복하는 반복문
		while(true) {
			
			//메뉴를 선택하여 사용자가 원하는 메뉴 진입
			System.out.println("메뉴를 선택하세요\n1 : 주차차량 정보 등록\n2 : 주차차량 정보 조회\n3:출차 요금 계산");
			menu = scan.nextInt();
			
			switch (menu) {
			case 1:{
				System.out.println("주차 차량 정보 등록");
				break;
			}
			case 2:{
				System.out.println("주차 차량 정보 조회");
				break;
			}
			case 3:{
				System.out.println("출차 요금 계산");
				break;
			}
			default:
			}
		}

	}

}
