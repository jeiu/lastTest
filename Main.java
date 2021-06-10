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
