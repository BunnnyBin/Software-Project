//Repor02�� 2��° ����
//1. default ��Ű���� �ϳ� ���Ͽ��� Calc, �ٸ� �ϳ��� ���Ͽ��� Add, Sub, Mul, Div Ŭ������ ����
import java.util.Scanner;

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
