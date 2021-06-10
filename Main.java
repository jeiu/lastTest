/* 해당클래스은 주차장의 차량의 정보를 저장하기 위한 오브젝트 클래스이다.
 * 작성시간 : 21.06.10 - 10:48
 * 수정시간 : 21.06.10 - 12:36
 * 수정내용 : while 문 내부에 loop변수를 지정하여 q나 Q를 입력하면 반복문이 종료되게끔 수정
 * 작성자 : 김태성
 * 수정자 : 류승원
 * 버전 : 1.0.1
 */

package parking;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FindCar findcar = new FindCar();

		System.out.println("-----주차 관리 프로그램-----");
		System.out.println("   1. 내 차 위치 찾기");
		System.out.println("   2. 요금 정산하기");
		System.out.println("   3. 관리 메뉴");
		System.out.println("   Q. 종료");
		System.out.println("-----------------------");
		
		String select = scan.next();
		boolean loop = true;
		
		while(loop) {
			switch(select) {
			case "1":
				findcar.searchCar();
				break;
				
			case "2":
				break;
				
			case "3":
				System.out.println("1. 주차칸의 차 검색");
				System.out.println("2. 빈 주차칸 검색");
				
				int select3 = scan.nextInt();
				
				if(select3 == 1) {
					
				} else if(select3 == 2) {
					
				} else {
					System.out.println("잘못 입력하셨습니다.");
				}
				
				break;
			
			case "Q", "q":
				loop = false;
				break;
				
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}

}
