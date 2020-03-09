/*2. a.jpg �̹��� ������ b.jpg�� �����ϸ鼭 10% ����� �� ���� ��*�� �ϳ��� ����ϴ� ���α׷� */
import java.io.*;
import java.util.*;

public class Lab09_2 {

	public static void main(String[] args) {
		System.out.print("�Է� ���ϰ� ��� ������ �Է��Ͻÿ� >> ");
		Scanner scanner = new Scanner(System.in);
		String src_str = scanner.next(); //������ ������ �̸�
		String dest_str = scanner.next(); //���� ���ϴ� ������ �̸�
		File src = new File("C:\\Temp\\" + src_str); //������ ��� �̹���
		File dest = new File("C:\\Temp\\" + dest_str); //�����ϴ� ��

		try {
			FileInputStream fi = new FileInputStream(src); //���� �Է� ��Ʈ��
			FileOutputStream fo = new FileOutputStream(dest); //���� ��� ��Ʈ��
			long tenPercent = src.length() / 10; //������ 10%�� ũ��
			long progress = 0; //���� 10%�� �� ���� ���� ���� ����Ʈ ��
			
			System.out.println(src_str + " �� " + dest_str + "�� �����մϴ�. \n10% ���� *�� ����մϴ�.");
			byte[] buf = new byte[1024]; //�� �� ���� ����
			int numRead = 0;//���� ����Ʈ ��
			
			while(true) {
				numRead = fi.read(buf,0,buf.length); //������ ũ�⸸ŭ �б�
				fo.write(buf,0,buf.length); //���Ͽ� ����
				if(numRead == -1) {//���� ���� ������
					if(progress > 0) //���� ���� �о����� 10%�� �������� �ʾ� *�� ��µ��� ���� ���
						System.out.print("*");
					break;
				}				
					
				progress += numRead;
				if(progress >= tenPercent) { //���࿡ 10%�� �����ϸ�
					System.out.print("*");
					progress -= tenPercent;
				}
			}
			fi.close();
			fo.close();
			}
		catch(IOException e) {
			System.out.println("���� ���� ����");
		}
	
	}

}
