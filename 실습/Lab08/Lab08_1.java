/*1.	Random 클래스를 이용하여 1 ~ 100 사이의 randon 정수를 10개 생성
 *      -> Vector에 삽입
 *      -> Vector에서 추출(2가지 방법 사용)  */
import java.lang.Math; // Math.random()사용을 위해 패키지 도입
import java.util.*;

public class Lab08_1 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer> (10); //정수 값만을 다루는 제너릭 백터 생성
		int i;
		
		for(i=0;i<10;i++) {
			int randon = (int)(Math.random()*100 + 1); //  1 ~ 100 사이의 랜덤한 숫자 생성
			v.add(randon); //제너리 백터에 요소 삽입
		}
		
		for(i=0;i<v.size();i++) { // Vector로부터 정수를 읽어 출력할 때의 첫번째 방법 -> for loop 와 get()
			int n = v.get(i);
			System.out.println(n);
		}
		System.out.println();
		
		Iterator <Integer> it = v.iterator(); //컬렉션 순차 검색을 위한 Iterator 생성
		while(it.hasNext()) { // Vector로부터 정수를 읽어 출력할 때의 두번째 방법 -> while loop와 Iterator
			int m = it.next();
			System.out.println(m);
		}
	}

}
