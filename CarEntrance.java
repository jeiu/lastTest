/* �ش�Ŭ������ �������� ������ ����ϰ� ��ȸ�ϴ� �����̴�.
 * �ۼ��ð� : 21.06.10 - 11:45
 * �����ð� : 21.06.10 - 11:55
 * �������� : ���� ��ϰ� ��ȸ�ϴ� �����̴�.
 * �ۼ��� : ���¼�
 */


package parking;

import java.util.Date;
import java.util.Scanner;

public class CarEntrance {
	
	//��ĳ�� ��ü ���� - 11:55 ���¼�
	Scanner scan = new Scanner(System.in);
	
	String carNum;			//�ش� ������ ��ȣ�� �����ϴ� ����
	int parkingNum;			//�ش� ������ ������ȣ�� �����ϴ� ����
	Date entranceCarTime;	//�ش� ������ �������� �ð��� �����ϴ� �м�
	
	int retry;				//�ش� �޴��� �ٽ� �������� 
	
	
	//������ ������ ����� �޼ҵ� - 11:55 ���¼�
	void carEntrance() {
		while(true) {
			carNum = null;
			parkingNum = 0;
			entranceCarTime = null;
			// ������ �����ϱ����� �ʱ�ȭ
			
			System.out.println("����� ������ ��ȣ�� �Է����ּ���");
			carNum = scan.next();
			entranceCarTime = new Date();
			
			
			
		}
	}

}
