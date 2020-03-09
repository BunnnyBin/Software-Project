/*1번 문제:중심을 나타내는 정수 x, y와  반지름 radius 필드를 가지는 Circle 클래스와
 *       이를 실행하는 main함수가 포함된 CircleApp 클래스이다.
 *Circle 클래스 -> 1)객체를 "Circle(2,3) 반지름 5"와 같은 형태로 출력시키는 toString() 메소드
 *              2)두 개의 Circle 객체의 중심이 같으면 같은 것으로 판별하는 equals() 메소드
 */
class Circle{
	int x, y, radius; //원의 중심 (x,y)와 원의 반지름 radius
	
	public Circle(int x,int y,int radius) {//매개변수 x,y,radius를 받는 생성자 함수
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public boolean equals(Object obj) {
		Circle p = (Circle)obj; //매개변수인 객체 p
		if(x == p.x && y == p.y) return true; //두 객체의 중심이 같으면 true
		else return false; //다르면 false
	}
	
	public String toString() {
		return "Circle(" + x + "," + y + ") 반지름 " + radius;
	}
}

public class CircleApp {

	public static void main(String[] args) {
		Circle a = new Circle(2,3,5); // 중심 (2,3)에 반지름 5인 원
		Circle b = new Circle(2,3,30); // 중심 (2,3)에 반지름 30인 원
		System.out.println("원 a : " + a); //Circle 클래스의 메소드인 toString()에 의해 작동
		System.out.println("원 b : " + b);
		if(a.equals(b)) //Circle 클래스의 메소드인 equals()에 의해 작동
			System.out.println("같은 원");
		else 
			System.out.println("서로 다른 원");

	}

}
