package parking;

import java.util.Scanner;

/* Date : 21.06.10
 * How : 전체적인 조회를 해주는 클래스
 * Author : 유승원
 * Version : 1.0
 */
public class FindCar {
	Scanner scan = new Scanner(System.in);
	
	// 주차칸의 차량 조회 / 차량의 위치 조회 메소드
	public void searchCar() {
		int parkingNum;
		String carNum;
		boolean loop = true;
		
		while(loop) {
			System.out.println("1. 주차칸의 차량 조회");
			System.out.println("2. 차량 번호로 내 주차칸 찾기");
			
			int select = scan.nextInt();
			
			if(select == 1) {
				System.out.println("주차 칸 번호를 입력해주세요");
				
				int searchParking = scan.nextInt();
				
				if(parkingNum == searchParking) {
					System.out.println(carNum);
				} else {
					System.out.println("차가 없습니다");
					loop = false;
				}
				
			} else if(select == 2) {
				System.out.println("차량 번호를 입력해주세요");
				
				int searchCar = scan.nextInt();
				
				if(carNum == searchCar) {
					System.out.println(parkingNum);
				} else {
					System.out.println("");
				}
				
			} else {
				
			}
		}	
	}
	
	// 빈 주차칸을 찾는 메소드
	public void emptyLot() {
		
	}
}
