/* 3.	Vector �̷����� �̿��Ͽ� �������� ����� ���� �����ϴ� ���α׷�
 *         ������ �Է�-> Vector�� �߰�
 *                    ���� �Էµ� ��� ������, ����� ���!
 */
import java.util.Scanner;
import java.util.*;

public class Lab08_3 {

	public static void main(String[] args) {
		System.out.print("������ �Է� (0 �Է½� ����) >> ");
		Scanner s = new Scanner(System.in); //������ �Է¹ޱ�
		String str = s.next();
		int rain = Integer.parseInt(str); //�Է¹��� ���ڿ��� ���������� ����(������)
		int sum = 0;  //������ ����
		
		Vector <Integer> vec = new Vector <Integer>(); //Vector ����
		vec.add(rain); //Vector�� ���(������) ����
		Iterator <Integer> it = vec.iterator(); //Vector�� ���� Ž���ϱ� ���� Iterator<Integer> ���
		
		while(rain != 0) { //0�Է����� ���� ���� ���� �ݺ�
			while(it.hasNext()) {
				int it_rain = it.next();
				sum += it_rain;
				System.out.print(it_rain + " ");
			}
			System.out.println();
			System.out.println("������� " + sum / vec.size()); //������� = ���� / Vector�� ���� ��� ����
			
			System.out.print("������ �Է� (0 �Է½� ����) >> ");
			s = new Scanner(System.in); 
			str = s.next();
			rain = Integer.parseInt(str); 
			sum = 0;  //������ ������ 0���� �ʱ�ȭ
			
			vec.add(rain);
			it = vec.iterator(); //iterator ��ü ���
		}
	}

}
