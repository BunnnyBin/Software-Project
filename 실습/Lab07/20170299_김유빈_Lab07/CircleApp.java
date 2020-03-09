/*�߽��� ��Ÿ���� ���� x, y�� ������ radius �ʵ带 ������ Circle Ŭ���� �����
 ������) �� a : Circle(2,3) ������5
		�� b : Circle(2,3) ������30
		���� ��
��ó�� �������� �������� CircleŬ�������� ��ü�� ����ϱ� ���� toString()�� �񱳸� ���� equals() �޼ҵ� �ۼ���
 */
class Circle{
	int x, y; //���� �߽�
	int radius; //���� ������
	
	public Circle(int x, int y, int radius) { //CircleŬ������ �������Լ�
		this.x =x;
		this.y = y;
		this.radius = radius;
	}
	
	public String toString() { //"Circle(2,3) ������5"�� ���� ��ü ����ϴ� �Լ� ���ۼ�
		return "Circle(" + x + "," + y + ") ������" + radius;
	}
	
	public boolean equals(Object obj) {
		Circle p = (Circle)obj;
		if(x == p.x && y == p.y) return true;//�� ��ü�� �߽��� ������ true ���
		else return false; //�� ��ü�� �߽��� �ٸ��� false ���
	}
}

public class CircleApp {

	public static void main(String[] args) {
		Circle a = new Circle(2,3,5); // �߽� (2,3)�� ������ 5�� ��
		Circle b = new Circle(2,3,30); // �߽� (2,3)�� ������ 30�� ��
		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);
		if(a.equals(b)) 
			System.out.println("���� ��");
		else 
			System.out.println("���� �ٸ� ��");
	}

}
