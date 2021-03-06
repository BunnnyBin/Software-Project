//Repor02의 2번째 문제
//1. default 패키지에 하나 파일에는 Calc, 다른 하나의 파일에는 Add, Sub, Mul, Div 클래스를 포함
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		Scanner s = new Scanner(System.in);
		
		int num1 = s.nextInt(); //피연산자1(정수형)
		String cal = s.next();  //연산자
		int num2 = s.nextInt();  //피연산자2 입력(정수형)
		
		if(cal.equals("+")) { //연산자가 덧셈일 때
			Add temp = new Add(); //Add클래스가 디폴트이므로 같은 패키지 내에서면 접근 가능
			                      //객체 생성
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
