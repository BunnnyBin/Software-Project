package Report01;
/* 소득세 = 소득금액 * 세율 - 누진공제
       지방소득세 = 소득세 * 10%
 */

import java.util.Scanner;

public class IncomeTax {
	public static void main(String[] args) {
		int deduct = 0;//누진공제
		double rate = 0;//적용세율
		int incomeTax, incomeTax2; //소득세와 지방소득세
		
		System.out.print("소득금액을 천원단위로 입력하시오> ");
		
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();//소득금액
		
		if(money <= 12000) { //소득금액에 따른 세율과 누진공제
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
		
		System.out.println(money + "천원의 소득세는 " + incomeTax + "천원이고, 지방세는 " + incomeTax2 +"천원 입니다.");
		
		scanner.close();
	}

}
