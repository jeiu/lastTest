package parking;

import java.util.Scanner;

/* Date : 21.06.10
 * How : ��ü���� ��ȸ�� ���ִ� Ŭ����
 * Author : ���¿�
 * Version : 1.0
 */
public class FindCar {
	Scanner scan = new Scanner(System.in);
	
	// ����ĭ�� ���� ��ȸ / ������ ��ġ ��ȸ �޼ҵ�
	public void searchCar() {
		int parkingNum;
		String carNum;
		boolean loop = true;
		
		while(loop) {
			System.out.println("1. ����ĭ�� ���� ��ȸ");
			System.out.println("2. ���� ��ȣ�� �� ����ĭ ã��");
			
			int select = scan.nextInt();
			
			if(select == 1) {
				System.out.println("���� ĭ ��ȣ�� �Է����ּ���");
				
				int searchParking = scan.nextInt();
				
				if(parkingNum == searchParking) {
					System.out.println(carNum);
				} else {
					System.out.println("���� �����ϴ�");
					loop = false;
				}
				
			} else if(select == 2) {
				System.out.println("���� ��ȣ�� �Է����ּ���");
				
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
	
	// �� ����ĭ�� ã�� �޼ҵ�
	public void emptyLot() {
		
	}
}
