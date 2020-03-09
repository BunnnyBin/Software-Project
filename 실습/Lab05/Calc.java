//Lab05_3 ����
import java.util.Scanner;

class Add{
	private int a, b; //�ΰ��� �ǿ�����
	                  //�ش� ���길 �� �� �ֵ��� �ش� Ŭ���� �������� �ǿ����� �� ���� �����ϵ��� �����̺�! (Ŭ�������� ���� �̸��� �����Ƿ�)
	
	void setValue(int a, int b) { //�����̺� �ǿ����� �� �ٲٴ� �Լ�
		this.a = a;
		this.b = b;
	}
	
	int calculate() { //���� ����
		return a + b;
	}
}

class Sub{
	private int a, b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a - b;
	}
}

class Mul{
	private int a, b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a * b;
	}
}

class Div{
	private int a, b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int calculate() {
		return a / b;
	}
}

public class Calc {

	public static void main(String[] args) {
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>> ");
		Scanner s = new Scanner(System.in);
		
		int num1 = s.nextInt(); //�ǿ�����1
		String cal = s.next();  //������
		int num2 = s.nextInt();  //�ǿ�����2 �Է�
		
		if(cal.equals("+")) { //�����ڰ� ������ ��
			Add temp = new Add();
			
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
