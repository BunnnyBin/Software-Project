/* 1.	Scanner로 입력 받은 이름과 전화번호를 한 줄에 한 사람씩 C:\temp\phone.txt 파일에 저장
 *      -> “exit”을 입력하면 입력을 마친다.
 *      다시 저장한 C:\temp\phone.txt 파일을 읽어 화면에 출력하는 프로그램
 */
import java.util.*;
import java.io.*;

public class Lab09_1 {

	public static void main(String[] args) {
		try {
		System.out.println("전화번호를 입력 하시오.");
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = new FileWriter("C:\\temp\\phone.txt");

		while(true) {
			System.out.print("이름 전화번호>> ");
			String str = scanner.nextLine();
			if(str.equals("exit"))
				break; //exit 입력하면 입력 끝
			
			fout.write("이름 전화번호>> " + str,0,str.length() + 10); //파일 입력
			fout.write("\r\n",0,2);//파일에 엔터키 입력
			}
		fout.close(); //필수!!!
		}
		catch(IOException e){
			System.out.println("입출력 오류");
		}
		System.out.println();
		System.out.println("c:\\temp\\phone.txt 전화번호를 출력합니다.");
		try {
			FileReader fin = new FileReader("c:\\temp\\phone.txt");
			int c;
			while((c = fin.read()) != -1) {
				System.out.print((char)c); //파일에 있는 문자를 하나씩 출력
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
