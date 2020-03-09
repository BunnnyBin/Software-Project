import java.util.Scanner;

public class Lab2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("연산>> ");
		
		Scanner sum = new Scanner(System.in);
		
		double a = sum.nextDouble();
		String x = sum.next();
		double b = sum.nextDouble();
		
		sum.close();
		
		double answer = 0;
		
		if(x.equals("+"))
			answer = a + b;
	
		else if(x.equals("-"))
			answer = a - b;
		
		else if(x.equals("*"))
			answer = a * b;
		
		else if(x.equals("/")) {
			if(b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);
			}
			
			answer = a / b;
		}
		
		System.out.println(a + x + b + "의 계산 결과는 " + answer);
		
	}

}
