/* �ش�Ŭ������ �������� ������ ������ �����ϱ� ���� ������Ʈ Ŭ�����̴�.
 * �ۼ��ð� : 21.06.10 - 10:48
 * �����ð� : 21.06.10 - 12:36
 * �������� : while �� ���ο� loop������ �����Ͽ� q�� Q�� �Է��ϸ� �ݺ����� ����ǰԲ� ����
 * �ۼ��� : ���¼�
 * ������ : ���¿�
 * ���� : 1.0.1
 */

package parking;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
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
			case "1":
				findcar.searchCar();
				break;
				
			case "2":
				break;
				
			case "3":
				System.out.println("1. ����ĭ�� �� �˻�");
				System.out.println("2. �� ����ĭ �˻�");
				
				int select3 = scan.nextInt();
				
				if(select3 == 1) {
					
				} else if(select3 == 2) {
					
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
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
