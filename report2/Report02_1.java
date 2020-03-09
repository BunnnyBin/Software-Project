//Report02의 1번 문제
import java.util.Scanner;

class Rectangle{
	double width, height; //직사각형의 가로, 세로
	String color; //직사각형의 색깔
	
	Rectangle(){ //디폴트 값의 사각형을 위한 무인자 생성자
		width = 1; //디폴트 값 = 1
		height = 1; // ""
		color = "white"; //디폴트 값 = "white"
	}
	Rectangle(double width, double height){ //주어진 가로와 세로의 사각형을 위한 생성자
		this(); //맴버 변수 초기화(디폴트 값)
		this.width = width; //맴버변수를 매개변수로 초기화(this이용)
		this.height = height;
	}
	Rectangle(double line){ //주어진 하나의 길이(가로와 세로로 사용)의 사각형을 위한 생성자
		this();
		width = line;
		height = line;
	}
	
	public double getArea() { //직사각형의 면적 계산
		return (width * height);
	}
	public double getPerimeter() { //직사각형의 둘레의 길이 계산
		return 2 * (width + height);
	}
	
}
public class Report02_1 {

	public static void main(String[] args) {
		Rectangle [] r = new Rectangle[3]; //객체 배열에 대한 레퍼런스 변수 선언
		Scanner scanner = new Scanner(System.in);
		//가로, 세로, 색깔 입력 받기
		System.out.print("가로>>");
		double width = scanner.nextDouble();
		System.out.print("세로>>");
		double height = scanner.nextDouble();
		System.out.print("색깔>>");
		String color = scanner.next();
		
		r[0] = new Rectangle(); //기본 생성자로 객체 생성
		r[1] = new Rectangle(width,height); //가로,세로 매개변수인 생성자로 객체 생성
		r[2] = new Rectangle(width); //가로나 세로인 하나의 길이만 받는 생성자로 객체 생성
		
		for(int i=0;i<r.length;i++)
			System.out.println((i + 1) + ". 면적 = " + r[i].getArea() + ", 둘레 = " + r[i].getPerimeter());
	}

}
