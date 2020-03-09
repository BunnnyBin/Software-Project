/* 3.	����ڷκ��� �ΰ���  �ؽ�Ʈ������ �Է� �ް�, ù��° ���� �ڿ� �ι��� ������ ������ ���ο� ������ �����ϴ� ���α׷�
 */
import java.io.*;
import java.util.*;

public class Lab09_3 {
	public static void writeToFile(FileReader fr, FileWriter fw) {
		int c;
		try {
		while((c = fr.read()) != -1) {
			fw.write((char)c); //���Ͽ� �ִ� ���ڸ� �ٸ� ���Ͽ� �ϳ��� ����
		  }
		}
		catch(FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}
		catch(IOException e) {
			System.out.println("����� �����Դϴ�.");
		}
	}
	
	public static void main(String[] args) {
		System.out.print("ù��° �����̸��� �Է��ϼ��� >> ");
		Scanner scanner = new Scanner(System.in);
		String first_str = scanner.nextLine();
		System.out.print("�ι�° �����̸��� �Է��ϼ��� >> ");
		String sec_str = scanner.nextLine();
		
		FileReader fReader = null;
		FileWriter fWriter = null;
		int c;
		try {
			fReader = new FileReader(first_str); //ù��° ���� ��Ʈ�� ����
			fWriter = new FileWriter("append.txt"); //��ġ�� ����
			writeToFile(fReader, fWriter); //ù��° ������ �о� ��ġ�� ���Ͽ� ���
			fReader.close();
			
			fReader = new FileReader(sec_str); //�ι�° ��Ʈ�� ����
			writeToFile(fReader, fWriter); //�ι�° ������ �о� ��ġ�� ���Ͽ� ���̾� ���
			
			fReader.close();
			fWriter.close();
			System.out.println("������Ʈ ���� �ؿ� append.txt ������ �����մϴ�.");
		}
		catch(FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}
		catch(IOException e) {
			System.out.println("����� �����Դϴ�.");
		}
		
	}

}
