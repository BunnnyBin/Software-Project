/*사용자에 입력을 받으면 공백으로 분리된 단어들의 갯수와 각 단어들을 출력하는 프로그램
	①	StringTockennizer 클래스를 이용하여 작성
	②	String 클래스의 split() 메소드를 이용하여 작성
	이 중에서 2번에 해당한다.
단, "exit"를 입력할 때까지 무한 반복함
 */
import java.util.Scanner;

public class Lab07_String {

	public static void main(String[] args) {
		System.out.print(">> ");
		Scanner scanner2 = new Scanner(System.in);
		String str2 = scanner2.nextLine();
		
		while(!str2.equals("exit")) {
			String s[] = str2.split(" "); //문자열을 단어로 분리하여 문자열 배열인 s에 저장
			System.out.println("단어 개수는 " + s.length); //단어의 개수 = 문자열 배열의 길이/행의 갯수
			
			for(int i = 0; i < s.length;i++) {//문자열 배열 s에 접근하여 단어를 출력
				System.out.println(s[i]);
			}
			System.out.print(">> ");
			scanner2 = new Scanner(System.in);
			str2 = scanner2.nextLine();
		}
		
		System.out.println("종료합니다.");
	}

}
