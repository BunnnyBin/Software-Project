interface Shape {
	final double PI = 3.14;
	void draw(); // 도형을 그리는 추상 메소드
	double getArea(); // 도형의 면적을 리턴하는 추상 메소드
	default public void redraw() { // 디폴트 메소드
		System.out.print("--- 다시 그립니다. ");
		draw();	//서브클래스에서 구현된다
	}
}

class Circle implements Shape{
	int radius;
	
	Circle(int radius){ this.radius = radius;} //반지름을 인자로 받는 생성자
	
	public void draw() { //도형을 그리는 추상 메소드 구현(인터페이스는 public으로 구현해야함)
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}
	public double getArea() { return radius * radius * PI;} //도형의 면적을 리턴하는 추상 메소드 구현
	
}

public class Shapes {

	public static void main(String[] args) {
		Shape donut = new Circle(10); // 반지름이 10인 원 객체
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());

	}

}
