/* 3.	Vector 켈랙션을 이용하여 강수량의 평균을 유지 관리하는 프로그램
 *         강수량 입력-> Vector에 추가
 *                    현재 입력된 모든 강수량, 평균을 출력!
 */
import java.util.Scanner;
import java.util.*;

public class Lab08_3 {

	public static void main(String[] args) {
		System.out.print("강수량 입력 (0 입력시 종료) >> ");
		Scanner s = new Scanner(System.in); //강수량 입력받기
		String str = s.next();
		int rain = Integer.parseInt(str); //입력받은 문자열을 숫자형으로 변형(강수량)
		int sum = 0;  //강수량 총합
		
		Vector <Integer> vec = new Vector <Integer>(); //Vector 생성
		vec.add(rain); //Vector에 요소(강수량) 삽입
		Iterator <Integer> it = vec.iterator(); //Vector를 순차 탐색하기 위해 Iterator<Integer> 사용
		
		while(rain != 0) { //0입력하지 않을 동안 무한 반복
			while(it.hasNext()) {
				int it_rain = it.next();
				sum += it_rain;
				System.out.print(it_rain + " ");
			}
			System.out.println();
			System.out.println("현재평균 " + sum / vec.size()); //현재평균 = 총합 / Vector의 현재 요소 갯수
			
			System.out.print("강수량 입력 (0 입력시 종료) >> ");
			s = new Scanner(System.in); 
			str = s.next();
			rain = Integer.parseInt(str); 
			sum = 0;  //강수량 총합을 0으로 초기화
			
			vec.add(rain);
			it = vec.iterator(); //iterator 객체 얻기
		}
	}

}
