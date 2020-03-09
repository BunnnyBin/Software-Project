//Lab05_3 파일
import java.util.Scanner;

class Add{
	private int a, b; //두개의 피연산자
	                  //해당 연산만 할 수 있도록 해당 클래스 내에서만 피연산자 값 변경 가능하도록 프라이빗! (클래스끼리 변수 이름이 같으므로)
	
	void setValue(int a, int b) { //프라이빗 피연산자 값 바꾸는 함수
		this.a = a;
		this.b = b;
	}
	
	int calculate() { //덧셈 수행
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
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		Scanner s = new Scanner(System.in);
		
		int num1 = s.nextInt(); //피연산자1
		String cal = s.next();  //연산자
		int num2 = s.nextInt();  //피연산자2 입력
		
		if(cal.equals("+")) { //연산자가 덧셈일 때
			Add temp = new Add();
			
			temp.setValue(num1, num2);
			System.out.println(temp.calculate()); //덧셈 수행
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
