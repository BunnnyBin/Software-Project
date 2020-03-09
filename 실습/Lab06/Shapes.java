interface Shape {
	final double PI = 3.14;
	void draw(); // ������ �׸��� �߻� �޼ҵ�
	double getArea(); // ������ ������ �����ϴ� �߻� �޼ҵ�
	default public void redraw() { // ����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();	//����Ŭ�������� �����ȴ�
	}
}

class Circle implements Shape{
	int radius;
	
	Circle(int radius){ this.radius = radius;} //�������� ���ڷ� �޴� ������
	
	public void draw() { //������ �׸��� �߻� �޼ҵ� ����(�������̽��� public���� �����ؾ���)
		System.out.println("�������� " + radius + "�� ���Դϴ�.");
	}
	public double getArea() { return radius * radius * PI;} //������ ������ �����ϴ� �߻� �޼ҵ� ����
	
}

public class Shapes {

	public static void main(String[] args) {
		Shape donut = new Circle(10); // �������� 10�� �� ��ü
		donut.redraw();
		System.out.println("������ " + donut.getArea());

	}

}
