import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 
		int money = 0, modMoney = 0;//money: 사용자입력금액, modMoney: unit 값들을 나눈 나머지 돈
		
		System.out.print("금액을 입력하시오 >> ");
		money = scanner.nextInt();
		modMoney = money;
		
		for(int i=0;i<unit.length;i++) {
			if(modMoney / unit[i] >= 1) {
				System.out.println(unit[i] + "원짜리 : " + modMoney / unit[i] + "개");
				modMoney = modMoney - (modMoney / unit[i]) * unit[i] ;
			}
		}
		
		scanner.close();
	}

}
