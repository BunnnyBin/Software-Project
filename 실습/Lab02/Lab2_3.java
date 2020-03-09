import java.util.Scanner;

public class Lab2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("점 (x, y) 의 좌표를 입력하시오>> ");
		Scanner square = new Scanner(System.in);
		
		int x = square.nextInt();
		int y = square.nextInt();
		
		square.close();
		
		if(x >= 100 && x <= 200)
			if(y >= 100 && y <= 200)
				System.out.println("(" + x + ", " + y + ") 은 사각형 안에 있습니다.");
			else
				System.out.println("(" + x + ", " + y + ") 은 사각형 안에 없습니다.");
		else
			System.out.println("(" + x + ", " + y + ") 은 사각형 안에 없습니다.");
	}

}
