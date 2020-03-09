/*1������> ����ڷκ��� �Է°� ��� ���ϸ��� �Է� �ް�
 *       �Է� ���Ͽ� ��� �ִ� �ؽ�Ʈ�� ���ڼ�, �ܾ��, ������� count�Ͽ� ����ϴ� ���α׷�
 *       ����� count�� ��� ���Ͽ� ����
 */
import java.util.*;
import java.io.*;

public class Report04_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Է� ���ϸ�: ");
		String f1 = scanner.nextLine();
		System.out.print("��� ���ϸ�: ");
		String f2 = scanner.nextLine();
		
		File src = new File("C:\\Users\\mk\\eclipse-workspace\\Report4\\" + f1); //���� ����
		File dest = new File("C:\\Users\\mk\\eclipse-workspace\\Report4\\" + f2); //��� ����
		int c;
		int charcount = 0, wordcount = 0, stringcount = 0; //�Է� ���Ͽ��� ���ڼ�, �ܾ��, �����
		char buf[] = new char[1024*10]; //�ؽ�Ʈ ������ ũ�Ⱑ ���ۺ��� �۴ٴ� ����
		try {
			//���ڼ� ���(��, ���� ����x)
			FileReader fr = new FileReader(src);
			c = fr.read(buf);  //���� ũ�⸸ŭ �о����. c�� ���� ���� ���ڼ�(������� ����)
			charcount = c;    //���ڼ� ���
			
			//���ڼ�, �ܾ��, ����� ���
			for(int i=0;i<buf.length;i++) {
				if(buf[i] == ' ' || buf[i] == '.' || buf[i] == '!' || buf[i] == '?') {
					wordcount++;
					//. ! ? ������ ��ĭ�� ���Ƿ� �̸� �ܾ������ ����
					if(buf[i] == ' ' && (buf[i-1] == '.' || buf[i-1] == '!' || buf[i-1] == '?'))
						wordcount--;
				}
				if(buf[i] == '.' || buf[i] == '!' || buf[i] == '?') //������ ����(.  ?  ! )�� ������ �ϳ��� ����
					stringcount++;
				if(buf[i] == ' ')  //������ �ƴ� ��� ����
					charcount--;
			}
			//��°���� ���Ͽ� ����
			FileWriter fw = new FileWriter(dest);
			String str1 = Integer.toString(charcount);
			String str2 = Integer.toString(wordcount);
			String str3 = Integer.toString(stringcount);
			fw.write(str1,0,str1.length()); //���ڼ� ����
			fw.write("\r\n",0,2);
			fw.write(str2,0,str2.length()); //�ܾ�� ����
			fw.write("\r\n",0,2);
			fw.write(str3,0,str3.length()); //����� ����
			
			fr.close();
			fw.close();
		}
		catch(IOException e) {
			System.out.println("����� ����");
			return;
		}
		scanner.close();
	}

}
