package Report01;
/* �ҵ漼 = �ҵ�ݾ� * ���� - ��������
       ����ҵ漼 = �ҵ漼 * 10%
 */

import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {
		int deduct = 0;//��������
		double rate = 0;//���뼼��
		int incomeTax, incomeTax2; //�ҵ漼�� ����ҵ漼
		
		System.out.print("�ҵ�ݾ��� õ�������� �Է��Ͻÿ�> ");
		
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();//�ҵ�ݾ�
		
		if(money <= 12000) { //�ҵ�ݾ׿� ���� ������ ��������
			rate = 0.06;
			deduct = 0;
		}
		else if(money <= 46000) {
			rate = 0.15;
			deduct = 1080;
		}
		else if(money <= 88000) {
			rate = 0.24;
			deduct = 5220;
		}
		else if(money <= 150000) {
			rate = 0.35;
			deduct = 14900;
		}
		else if(money <= 300000) {
			rate = 0.38;
			deduct = 19400;
		}
		else if(money <= 500000) {
			rate = 0.40;
			deduct = 25400;
		}
		else if(money > 500000) {
			rate = 0.42;
			deduct = 35400;
		}
		
		incomeTax = (int)(money * rate) - deduct;
		incomeTax2 = (int)(incomeTax * 0.10);
		
		System.out.println(money + "õ���� �ҵ漼�� " + incomeTax + "õ���̰�, ���漼�� " + incomeTax2 +"õ�� �Դϴ�.");
		
		scanner.close();
	}

}
