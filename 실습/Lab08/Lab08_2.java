/*  2.	Scanner Ŭ������ ����Ͽ� 6���� ����(A, B, C, D, F)�� ���ڷ� �Է¹���
 *     -> ArrayList�� ����
 *     -> ArrayList�� �˻��Ͽ� ������ ����(A=4.0, B-3.0, C=2.0, D=1.0, F=0)�� ��ȯ�Ͽ� ����� ����ϴ� ���α׷�
 */   
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Lab08_2 {

	public static void main(String[] args) {
		double sum = 0; //������ ��
		
		System.out.print("6���� ������ ��ĭ���� �и��Է�(A/B/C/D/F) >> ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine(); //�Է¹��� ���ڿ��� ���ڿ� ������ �ű��
		
		StringTokenizer st = new StringTokenizer(str, " "); //�ϳ��� ���ڿ��� " "�� �������� ��ū���� ����
		ArrayList <String> arr = new ArrayList <String>(6); //6���� ������ �����ϴ� ArrayList ����
		for(int i=0;i<6;i++) 
			arr.add(st.nextToken()); //��ū���� �ڸ� 6���� ������  ArrayList�� ����!
		
		for(int i=0;i<arr.size();i++) {
			String num = arr.get(i); //ArrayList���� ���(����)�� ���
			
			if(num.equals("A")) //���� �հ�(sum) ���
				sum += 4.0;
			else if(num.equals("B"))
				sum += 3.0;
			else if(num.equals("C"))
				sum += 2.0;
			else if(num.equals("D"))
				sum += 1.0;
			else if(num.equals("F"))
				sum += 0;
		}
		
		System.out.println("���� ��� = " + sum / 6); //������ ��� = ������ ���� / 6
	}

}
