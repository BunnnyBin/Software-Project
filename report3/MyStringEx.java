/*2�� ����: String Ŭ������ ������ ������ ���ڿ� Ŭ�����ν� MyString Ŭ������ �̸� �����ϴ� MyStringEx Ŭ�����̴�.
 * <MyString Ŭ������ ����>
 * (1)���� �迭�� �Ű������� �޴� MyString Ŭ������ ������ �Լ�
 * (2)����Լ� println(MyString str)
 * (3)���ڿ� ���̸� ��Ÿ����  length() 
 * (4)���� ���� �������� ���ϴ� equals(Object obj)
 * (5)���ڿ� �ε��� ���� �޾Ƽ� �ش� ���ڸ� ����ϴ� charAt(int index)
 * (6)�빮�ڷ� �����ϴ� toUppercase()
 * (7)�ش� �ε������� �����Ͽ� Ư�� ������ŭ�� ���ڸ� ���� ���� ��Ʈ�� �����ϴ� substring(int beginIndex, int count)
 * (8)int�� ����  MyString ��ü�� ��ȯ�ϴ� valueOf(int i)
 * (9) boolean�� ���� MyString ��ü�� �����ϴ� valueOf(boolean b)
 */
class MyString{
	char [] c;//������ �迭 ���۷��� ����
	
	public MyString(char [] c) {this.c = c;}//(1)������ �Լ� -> ���ڿ� String�� ������ �迭
	
	public static void println(MyString str) {//(2)����Լ� println -> ���ڵ��� �迭�� �Ϸķ� ���
		for(char ch : str.c)
			System.out.print(ch);
		System.out.println();
	}
	
	public int length() {//(3)���ڿ� ���� �Լ� length() -> for-each���� ����Ͽ� �迭�� ���� ���ϱ�
		int count = 0;
		for(char ch : c)
			count++;
		return count;
	}
	
	public boolean equals(Object obj) { //(4)���ڿ� �� equals() -> �迭���� ���� �ϳ��ϳ� ���ϱ�
		MyString p = (MyString)obj;
		int i = 0;
		for(char ch : p.c)
			if(this.c[i++] != ch) //���� ���ڰ� �ٸ��� false ��ȯ
				return false;
		return true;//false�� �ƴϰ� ��� ���ڰ� ������ true ��ȯ
	}
	
	public char charAt(int index) {return c[index];}//(5)�ش� ���ڸ� ��� charAt�Լ� -> ���� �迭�� �ε��� Ȱ��
	
	public MyString toUppercase() { //(6)�빮�� ���� toUppercase() -> �빮�ڷ� ������ ���ڵ��� �迭�� ���� ���ο� ��ü �ּҸ� ��ȯ�Ѵ�.
		char [] upchr = new char [this.length()];//�� ��ü�� �Ȱ��� ������ ���� �迭�� ���Ӱ� ����
		int i = 0;
		for(char ch : this.c)
			if(ch >= 'a')//�ҹ��ڶ��
				upchr[i++] = (char)(ch - 32); //�빮�ڷ� �����Ͽ� ���� �迭�� ����
			else //�빮�ڶ��
				upchr[i++] = ch; //�׷��� ����
		
		MyString s = new MyString(upchr); //�빮�ڷ� ������ ���ڵ��� �迭�� ups�� ���ο� ��ü ����
		return s; //��ü �ּҰ� ����
	}
	
	public MyString substring(int beginIndex, int count) {//(7)�ش� �ε������� ������ŭ�� ���� ��Ʈ�� ���� substring�Լ�
		char [] subchr = new char [count]; //�ش� ������ŭ�� ���ο� ���ڿ� ����
		for(int i = 0; i<count ;i++) 
			subchr[i] = this.c[i+beginIndex]; //�ش� ��ü ���ڿ��� beginIndex�κ� ���� ����
		MyString s = new MyString(subchr); //�ش� �ε������� ������ŭ�� ���ڵ� �迭�� ���� ���ο� ��ü ����
		return s;
	}
	
	public static MyString valueOf(int value) {//(8)MyString ��ü ���� valueOf(int��) -> ���� �ڸ����� ���� �׿� �ش��ϴ� ���ο� ���� �迭 �����ϱ�
		int count = 0; //value�� �ڸ���
		for(int i = 1;;i*=10) {//value�� ���ڸ� �������� ���� for��
			count++;
			if(value/i >= 1 && value/i <=9)
				break;
		}
		
		char [] val = new char[count];//value �ڸ�����ŭ ���� �迭 ����
		for(int i = 0;i<count ;i++) {//���ڸ� ������ �迭�� ��ȯ�ϴ� ����
			int ten = 1;
			for(int j = 1 ; j < count - i ; j++) 
				ten *= 10; //value�� Ư�� �ڸ����� value/ten�̴�.(value�� �� ó�� �κк��� ���ڿ��� ���� �� �ִ�)
			
			val[i] = (char)(value/ten + '0'); //�ش� ���� �ϳ��� ���ڿ��� �ְ�
			value -= (value/ten)*ten; //���� ���ڸ� value���� ����!
		}
		
		MyString s = new MyString(val);
		return s;
	}
	
	public static MyString valueOf(boolean value) {//(9)MyString��ü ���� valueOf(boolean��) -> true, false �ΰ��� ��츸 �ִ�
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
		MyString s = new MyString(new char[] {'a', 'B', 'c', 'D'}); //(1)��
		MyString s1 = new MyString(new char[] {'a', 'B', 'c', 'D'});
		MyString s2 = new MyString(new char[] {'a', 'b', 'c', 'd'});

		System.out.print("s = ");
		MyString.println(s);  // "aBcD"�� ��� -> (2)��
		System.out.print("s1 = ");
		MyString.println(s1);  // "aBcD"
		System.out.print("s2 = ");
		MyString.println(s2);  // "abcd"
			    
		System.out.println("s.length = " + s.length()); //(3)��
		System.out.println("s.equals(s1) = " + s.equals(s1)); // "true" ��� -> (4)��
		System.out.println("s.equals(s2) = " + s.equals(s2)); // "false"
		System.out.println("s.charAt(1) = " + s.charAt(1));  // "B" ��� -> (5)��
			    		   
		MyString s3 = s.toUppercase(); //(6)��
		System.out.print("s.toUppercase() = ");
		MyString.println(s3);                // "ABCD"
				
		MyString s4 = s.substring(1, 2); //(7)��
		System.out.print("s.substring(1, 2) = ");
		MyString.println(s4);   // "Bc"
				
		System.out.print("MyString.valueOf(345) = ");
		MyString.println(MyString.valueOf(345));  // "345" ��� -> (8)��
					
		System.out.print("MyString.valueOf(true) = ");
		MyString.println(MyString.valueOf(true));   // "true" -> (9)��

	}

}
