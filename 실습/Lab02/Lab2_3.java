import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�� (x, y) �� ��ǥ�� �Է��Ͻÿ�>> ");
		Scanner square = new Scanner(System.in);
		
		int x = square.nextInt();
		int y = square.nextInt();
		
		square.close();
		
		if(x >= 100 && x <= 200)
			if(y >= 100 && y <= 200)
				System.out.println("(" + x + ", " + y + ") �� �簢�� �ȿ� �ֽ��ϴ�.");
			else
				System.out.println("(" + x + ", " + y + ") �� �簢�� �ȿ� �����ϴ�.");
		else
			System.out.println("(" + x + ", " + y + ") �� �簢�� �ȿ� �����ϴ�.");
	}

}
