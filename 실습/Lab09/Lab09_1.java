/* 1.	Scanner�� �Է� ���� �̸��� ��ȭ��ȣ�� �� �ٿ� �� ����� C:\temp\phone.txt ���Ͽ� ����
 *      -> ��exit���� �Է��ϸ� �Է��� ��ģ��.
 *      �ٽ� ������ C:\temp\phone.txt ������ �о� ȭ�鿡 ����ϴ� ���α׷�
 */
import java.util.*;
import java.io.*;

public class Lab09_1 {

	public static void main(String[] args) {
		try {
		System.out.println("��ȭ��ȣ�� �Է� �Ͻÿ�.");
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = new FileWriter("C:\\temp\\phone.txt");

		while(true) {
			System.out.print("�̸� ��ȭ��ȣ>> ");
			String str = scanner.nextLine();
			if(str.equals("exit"))
				break; //exit �Է��ϸ� �Է� ��
			
			fout.write("�̸� ��ȭ��ȣ>> " + str,0,str.length() + 10); //���� �Է�
			fout.write("\r\n",0,2);//���Ͽ� ����Ű �Է�
			}
		fout.close(); //�ʼ�!!!
		}
		catch(IOException e){
			System.out.println("����� ����");
		}
		System.out.println();
		System.out.println("c:\\temp\\phone.txt ��ȭ��ȣ�� ����մϴ�.");
		try {
			FileReader fin = new FileReader("c:\\temp\\phone.txt");
			int c;
			while((c = fin.read()) != -1) {
				System.out.print((char)c); //���Ͽ� �ִ� ���ڸ� �ϳ��� ���
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("����� ����");
		}

	}

}
