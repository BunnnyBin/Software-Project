import java.util.Scanner;

class Dictionary {
	private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String [] eng = {"love","baby","money","future","hope"};
	
	public static String kor2Eng(String word) { 
		String answer = "";

		for(int i = 0;i < 5; i++) {
			if(kor[i].equals(word)) {
				answer = eng[i];
				break;
			}			
		}
		return answer;
	}
}

public class Lab04_4 {

	public static void main(String[] args) {
		 Dictionary a = new  Dictionary();
		
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		System.out.print("�ѱ� �ܾ�> ");
		Scanner scanner = new Scanner(System.in);
		String k = scanner.next();
		
		while(!k.contentEquals("�׸�")) {
		System.out.println(k + "�� " + a.kor2Eng(k));
		
		System.out.print("�ѱ� �ܾ�> ");
		scanner = new Scanner(System.in);
		k = scanner.next();
		}
		
		scanner.close();
	}

}
