import java.util.Scanner;

public class Lab2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���� 3�� �Է� >> ");
		Scanner middle = new Scanner(System.in);
		
		int a = middle.nextInt();
		int b = middle.nextInt();
		int c = middle.nextInt();
		
		middle.close();
		
		int answer = 0;
		
		if(a > b) {
			if(a < c) {
				answer = a;
			}
			else if(a > c){
				if(b > c)
					answer = b;
				
				else if(c > b)
					answer = c;
			}
		}
		
		else if(a < b) {
			if(a > c)
				answer = a;
			
			else if(a < c) {
				if(b > c)
					answer = c;
				else if(c > b)
					answer = b;
			}
				
		}
		
		System.out.println("�߰����� " + answer);
	}

}
