//Report02�� �ι�° ����
//2. pkg1 ��Ű���� Calc Ŭ����, pkg2 ��Ű���� Add, Sub, Mul, Div Ŭ������ �������� �ۼ��϶�
package pkg1;

import java.util.Scanner;
//�ܺ� ��Ű���� �����ϱ�
import pkg2.Add;
import pkg2.Sub;
import pkg2.Mul;
import pkg2.Div;

public class Calc {
	public static void main(String[] args) {
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>> ");
		Scanner s = new Scanner(System.in);
		
		int num1 = s.nextInt(); //�ǿ�����1(������)
		String cal = s.next();  //������
		int num2 = s.nextInt();  //�ǿ�����2 �Է�(������)
		
		if(cal.equals("+")) { //�����ڰ� ������ ��
			Add temp = new Add(); //AddŬ������ ����Ʈ�̹Ƿ� ���� ��Ű�� �������� ���� ����
			                      //��ü ����
			temp.setValue(num1, num2);
			System.out.println(temp.calculate()); //���� ����
		}
		else if(cal.equals("-")) {
			Sub temp = new Sub();
			
			temp.setValue(num1, num2);
			System.out.println(temp.calculate());
		}
		else if(cal.equals("*")) {
			Mul temp = new Mul();
			
			temp.setValue(num1, num2);
			System.out.println(temp.calculate());
		}
		else if(cal.equals("/")) {
			Div temp = new Div();
			
			temp.setValue(num1, num2);
			System.out.println(temp.calculate());
		}
	}
}
