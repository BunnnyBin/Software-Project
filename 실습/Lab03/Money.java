import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 
		int money = 0, modMoney = 0;//money: ������Է±ݾ�, modMoney: unit ������ ���� ������ ��
		
		System.out.print("�ݾ��� �Է��Ͻÿ� >> ");
		money = scanner.nextInt();
		modMoney = money;
		
		for(int i=0;i<unit.length;i++) {
			if(modMoney / unit[i] >= 1) {
				System.out.println(unit[i] + "��¥�� : " + modMoney / unit[i] + "��");
				modMoney = modMoney - (modMoney / unit[i]) * unit[i] ;
			}
		}
		
		scanner.close();
	}

}
