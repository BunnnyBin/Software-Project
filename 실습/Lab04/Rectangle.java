package Lab04_3;

public class Rectangle {
	int x, y, width, height; //사각형을 구성하는 점과 크기 정보
	
	public Rectangle(int a, int b, int w, int h) {
		x = a;
		y = b;
		width = w;
		height = h; 
	}//Rectangle의 생성자
	
	int square() {
		return (width * height);
	}//사각형의 넓이 리턴
	
	void show() {
		System.out.println("(" + x + "," + y + ")" + "에서의 크기가 " + width + "x" + height + "인 사각형");
	}//사각형의 좌표와 넓이를 화면에 출력
	
	boolean contains(Rectangle r) {
		return ((r.x > x && r.x < x + width) && (r.y > y && r.y < y + height) && (r.x + r.width < x + width  && r.y + r.height < y + height));
	}//매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) 
			System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) 
			System.out.println("t는 s를 포함합니다.");


	}

}
