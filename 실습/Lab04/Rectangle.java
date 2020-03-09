package Lab04_3;

public class Rectangle {
	int x, y, width, height; //�簢���� �����ϴ� ���� ũ�� ����
	
	public Rectangle(int a, int b, int w, int h) {
		x = a;
		y = b;
		width = w;
		height = h; 
	}//Rectangle�� ������
	
	int square() {
		return (width * height);
	}//�簢���� ���� ����
	
	void show() {
		System.out.println("(" + x + "," + y + ")" + "������ ũ�Ⱑ " + width + "x" + height + "�� �簢��");
	}//�簢���� ��ǥ�� ���̸� ȭ�鿡 ���
	
	boolean contains(Rectangle r) {
		return ((r.x > x && r.x < x + width) && (r.y > y && r.y < y + height) && (r.x + r.width < x + width  && r.y + r.height < y + height));
	}//�Ű������� ���� r�� �� �簢�� �ȿ� ������ true ����
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) 
			System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) 
			System.out.println("t�� s�� �����մϴ�.");


	}

}
