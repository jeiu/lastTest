package parking;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CarEntranceExit cee = new CarEntranceExit();
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
			case "1":  // 내 차 위치 찾기
				findcar.searchCar();
				loop = false;
				break;
				
			case "2":  // 요금 정산하기
				cee.carExit();
				loop = false;
				break;
				
			case "3":  // 관리 메뉴
				System.out.println("1. 주차 등록");
				System.out.println("2. 주차칸의 차 검색");
				System.out.println("3. 빈 주차칸 검색");
				
				int select3 = scan.nextInt();
				
				switch(select3) {
				case 1:  // 입차 등록
					cee.carEntrance();
					loop = false;
					break;
				case 2:  // 해당 주차칸 차 번호 찾기
					findcar.searchLot();
					loop = false;
					break;
				case 3:  // 빈 주차칸 확인
					findcar.emptyLot();
					loop = false;
					break;
				default:
					break;
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
