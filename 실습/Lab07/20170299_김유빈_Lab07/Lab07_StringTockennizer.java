/*����ڿ� �Է��� ������ �������� �и��� �ܾ���� ������ �� �ܾ���� ����ϴ� ���α׷�
	��	StringTockennizer Ŭ������ �̿��Ͽ� �ۼ�
	��	String Ŭ������ split() �޼ҵ带 �̿��Ͽ� �ۼ�
	�� �߿��� 1���� �ش��Ѵ�.
��, "exit"�� �Է��� ������ ���� �ݺ���
 */
import java.util.StringTokenizer;
import java.util.Scanner;

public class Lab07_StringTockennizer {

	public static void main(String[] args) {
		System.out.print(">> ");
		Scanner scanner1 = new Scanner(System.in);
		String str1 = scanner1.nextLine();
		
		while(!str1.equals("exit")) { //"exit"�� �Է��� ������ ���� �ݺ�
			StringTokenizer st = new StringTokenizer(str1, " ");
			
			System.out.println("�ܾ� ������ " + st.countTokens()); //countTokens(): ��ū�� ���� ����
			while(st.hasMoreTokens())
				System.out.println(st.nextToken()); //nextToken(): ���� ��ū�� ���� ��ȯ ��, ���ڿ��� �ܾ�� �и�
			
			System.out.print(">> ");
			scanner1 = new Scanner(System.in); //�Է� �ޱ�
			str1 = scanner1.nextLine(); //�Է��� ���ڿ��� �ű��
		}
		System.out.println("�����մϴ�.");
		
	}

}
