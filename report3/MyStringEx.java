/*2번 문제: String 클래스와 유사한 나만의 문자열 클래스로써 MyString 클래스와 이를 실행하는 MyStringEx 클래스이다.
 * <MyString 클래스의 구성>
 * (1)문자 배열을 매개변수로 받는 MyString 클래스의 생성자 함수
 * (2)출력함수 println(MyString str)
 * (3)문자열 길이를 나타내는  length() 
 * (4)문자 값이 같은지를 비교하는 equals(Object obj)
 * (5)문자열 인덱스 값을 받아서 해당 문자를 출력하는 charAt(int index)
 * (6)대문자로 변경하는 toUppercase()
 * (7)해당 인덱스부터 시작하여 특정 개수만큼의 문자를 갖는 서브 스트링 리턴하는 substring(int beginIndex, int count)
 * (8)int형 값을  MyString 객체로 반환하는 valueOf(int i)
 * (9) boolean형 값을 MyString 객체로 리턴하는 valueOf(boolean b)
 */
class MyString{
	char [] c;//문자의 배열 레퍼런스 변수
	
	public MyString(char [] c) {this.c = c;}//(1)생성자 함수 -> 문자열 String은 문자의 배열
	
	public static void println(MyString str) {//(2)출력함수 println -> 문자들의 배열을 일렬로 출력
		for(char ch : str.c)
			System.out.print(ch);
		System.out.println();
	}
	
	public int length() {//(3)문자열 길이 함수 length() -> for-each문을 사용하여 배열의 길이 구하기
		int count = 0;
		for(char ch : c)
			count++;
		return count;
	}
	
	public boolean equals(Object obj) { //(4)문자열 비교 equals() -> 배열끼리 문자 하나하나 비교하기
		MyString p = (MyString)obj;
		int i = 0;
		for(char ch : p.c)
			if(this.c[i++] != ch) //서로 문자가 다르면 false 반환
				return false;
		return true;//false가 아니고 모든 문자가 같으면 true 반환
	}
	
	public char charAt(int index) {return c[index];}//(5)해당 문자를 출력 charAt함수 -> 문자 배열의 인덱스 활용
	
	public MyString toUppercase() { //(6)대문자 변형 toUppercase() -> 대문자로 변형된 문자들의 배열에 대한 새로운 객체 주소를 반환한다.
		char [] upchr = new char [this.length()];//현 객체와 똑같은 길이의 문자 배열을 새롭게 생성
		int i = 0;
		for(char ch : this.c)
			if(ch >= 'a')//소문자라면
				upchr[i++] = (char)(ch - 32); //대문자로 변형하여 문자 배열에 삽입
			else //대문자라면
				upchr[i++] = ch; //그래로 삽입
		
		MyString s = new MyString(upchr); //대문자로 변형된 문자들의 배열인 ups로 새로운 객체 생성
		return s; //객체 주소값 리턴
	}
	
	public MyString substring(int beginIndex, int count) {//(7)해당 인덱스부터 갯수만큼의 서브 스트링 리턴 substring함수
		char [] subchr = new char [count]; //해당 갯수만큼의 새로운 문자열 생성
		for(int i = 0; i<count ;i++) 
			subchr[i] = this.c[i+beginIndex]; //해당 객체 문자열의 beginIndex부분 부터 복사
		MyString s = new MyString(subchr); //해당 인덱스부터 갯수만큼의 문자들 배열에 대한 새로운 객체 생성
		return s;
	}
	
	public static MyString valueOf(int value) {//(8)MyString 객체 리턴 valueOf(int형) -> 숫자 자릿수를 세어 그에 해당하는 새로운 문자 배열 생성하기
		int count = 0; //value의 자릿수
		for(int i = 1;;i*=10) {//value가 몇자리 정수인지 세는 for문
			count++;
			if(value/i >= 1 && value/i <=9)
				break;
		}
		
		char [] val = new char[count];//value 자릿수만큼 문자 배열 생성
		for(int i = 0;i<count ;i++) {//숫자를 문자의 배열로 변환하는 과정
			int ten = 1;
			for(int j = 1 ; j < count - i ; j++) 
				ten *= 10; //value의 특정 자릿수는 value/ten이다.(value의 맨 처음 부분부터 문자열에 넣을 수 있다)
			
			val[i] = (char)(value/ten + '0'); //해당 숫자 하나를 문자열에 넣고
			value -= (value/ten)*ten; //넣은 숫자를 value에서 뺀다!
		}
		
		MyString s = new MyString(val);
		return s;
	}
	
	public static MyString valueOf(boolean value) {//(9)MyString객체 리턴 valueOf(boolean형) -> true, false 두가지 경우만 있다
		MyString s;
		if(value)
			s = new MyString(new char[] {'t', 'r', 'u', 'e'});
		else
			s = new MyString(new char[] {'f','a','l','s','e'});
		return s;
	}
}

public class MyStringEx {

	public static void main(String[] args) {
		MyString s = new MyString(new char[] {'a', 'B', 'c', 'D'}); //(1)번
		MyString s1 = new MyString(new char[] {'a', 'B', 'c', 'D'});
		MyString s2 = new MyString(new char[] {'a', 'b', 'c', 'd'});

		System.out.print("s = ");
		MyString.println(s);  // "aBcD"로 출력 -> (2)번
		System.out.print("s1 = ");
		MyString.println(s1);  // "aBcD"
		System.out.print("s2 = ");
		MyString.println(s2);  // "abcd"
			    
		System.out.println("s.length = " + s.length()); //(3)번
		System.out.println("s.equals(s1) = " + s.equals(s1)); // "true" 출력 -> (4)번
		System.out.println("s.equals(s2) = " + s.equals(s2)); // "false"
		System.out.println("s.charAt(1) = " + s.charAt(1));  // "B" 출력 -> (5)번
			    		   
		MyString s3 = s.toUppercase(); //(6)번
		System.out.print("s.toUppercase() = ");
		MyString.println(s3);                // "ABCD"
				
		MyString s4 = s.substring(1, 2); //(7)번
		System.out.print("s.substring(1, 2) = ");
		MyString.println(s4);   // "Bc"
				
		System.out.print("MyString.valueOf(345) = ");
		MyString.println(MyString.valueOf(345));  // "345" 출력 -> (8)번
					
		System.out.print("MyString.valueOf(true) = ");
		MyString.println(MyString.valueOf(true));   // "true" -> (9)번

	}

}
