package parking;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CarEntranceExit cee = new CarEntranceExit();
		FindCar findcar = new FindCar();

		System.out.println("-----���� ���� ���α׷�-----");
		System.out.println("   1. �� �� ��ġ ã��");
		System.out.println("   2. ��� �����ϱ�");
		System.out.println("   3. ���� �޴�");
		System.out.println("   Q. ����");
		System.out.println("-----------------------");
		
		String select = scan.next();
		boolean loop = true;
		
		while(loop) {
			switch(select) {
			case "1":  // �� �� ��ġ ã��
				findcar.searchCar();
				loop = false;
				break;
				
			case "2":  // ��� �����ϱ�
				cee.carExit();
				loop = false;
				break;
				
			case "3":  // ���� �޴�
				System.out.println("1. ���� ���");
				System.out.println("2. ����ĭ�� �� �˻�");
				System.out.println("3. �� ����ĭ �˻�");
				
				int select3 = scan.nextInt();
				
				switch(select3) {
				case 1:  // ���� ���
					cee.carEntrance();
					loop = false;
					break;
				case 2:  // �ش� ����ĭ �� ��ȣ ã��
					findcar.searchLot();
					loop = false;
					break;
				case 3:  // �� ����ĭ Ȯ��
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
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
		}
	}

}
