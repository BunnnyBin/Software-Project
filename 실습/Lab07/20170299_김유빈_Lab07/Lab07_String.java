/*����ڿ� �Է��� ������ �������� �и��� �ܾ���� ������ �� �ܾ���� ����ϴ� ���α׷�
	��	StringTockennizer Ŭ������ �̿��Ͽ� �ۼ�
	��	String Ŭ������ split() �޼ҵ带 �̿��Ͽ� �ۼ�
	�� �߿��� 2���� �ش��Ѵ�.
��, "exit"�� �Է��� ������ ���� �ݺ���
 */
import java.util.Scanner;

public class Lab07_String {

	public static void main(String[] args) {
		System.out.print(">> ");
		Scanner scanner2 = new Scanner(System.in);
		String str2 = scanner2.nextLine();
		
		while(!str2.equals("exit")) {
			String s[] = str2.split(" "); //���ڿ��� �ܾ�� �и��Ͽ� ���ڿ� �迭�� s�� ����
			System.out.println("�ܾ� ������ " + s.length); //�ܾ��� ���� = ���ڿ� �迭�� ����/���� ����
			
			for(int i = 0; i < s.length;i++) {//���ڿ� �迭 s�� �����Ͽ� �ܾ ���
				System.out.println(s[i]);
			}
			System.out.print(">> ");
			scanner2 = new Scanner(System.in);
			str2 = scanner2.nextLine();
		}
		
		System.out.println("�����մϴ�.");
	}

}
