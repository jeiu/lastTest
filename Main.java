/* �ش����α׷��� �������� ������ �����ϴ� �����̴�.
 * �ۼ��ð� : 21.06.10 - 10:33 
 * �����ð� : 21.06.10 - 10:48
 * �������� : Main Ŭ������ �⺻ Ʋ ����
 * �ۼ��� : ���¼�
 */



package parking;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//������� �޴� ������ ���� ��ĳ�� ��ü�� �޴� ���� ���� - 10:40
		Scanner scan = new Scanner(System.in);
		int menu;

		//�޴� �۾� ������ �ٽ� �ٸ� �۾��� �� �� �ְ� �ݺ��ϴ� �ݺ���
		while(true) {
			
			//�޴��� �����Ͽ� ����ڰ� ���ϴ� �޴� ����
			System.out.println("�޴��� �����ϼ���\n1 : �������� ���� ���\n2 : �������� ���� ��ȸ\n3:���� ��� ���");
			menu = scan.nextInt();
			
			switch (menu) {
			case 1:{
				System.out.println("���� ���� ���� ���");
				break;
			}
			case 2:{
				System.out.println("���� ���� ���� ��ȸ");
				break;
			}
			case 3:{
				System.out.println("���� ��� ���");
				break;
			}
			default:
			}
		}

	}

}
