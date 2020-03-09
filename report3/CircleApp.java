/*1�� ����:�߽��� ��Ÿ���� ���� x, y��  ������ radius �ʵ带 ������ Circle Ŭ������
 *       �̸� �����ϴ� main�Լ��� ���Ե� CircleApp Ŭ�����̴�.
 *Circle Ŭ���� -> 1)��ü�� "Circle(2,3) ������ 5"�� ���� ���·� ��½�Ű�� toString() �޼ҵ�
 *              2)�� ���� Circle ��ü�� �߽��� ������ ���� ������ �Ǻ��ϴ� equals() �޼ҵ�
 */
class Circle{
	int x, y, radius; //���� �߽� (x,y)�� ���� ������ radius
	
	public Circle(int x,int y,int radius) {//�Ű����� x,y,radius�� �޴� ������ �Լ�
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public boolean equals(Object obj) {
		Circle p = (Circle)obj; //�Ű������� ��ü p
		if(x == p.x && y == p.y) return true; //�� ��ü�� �߽��� ������ true
		else return false; //�ٸ��� false
	}
	
	public String toString() {
		return "Circle(" + x + "," + y + ") ������ " + radius;
	}
}

public class CircleApp {

	public static void main(String[] args) {
		Circle a = new Circle(2,3,5); // �߽� (2,3)�� ������ 5�� ��
		Circle b = new Circle(2,3,30); // �߽� (2,3)�� ������ 30�� ��
		System.out.println("�� a : " + a); //Circle Ŭ������ �޼ҵ��� toString()�� ���� �۵�
		System.out.println("�� b : " + b);
		if(a.equals(b)) //Circle Ŭ������ �޼ҵ��� equals()�� ���� �۵�
			System.out.println("���� ��");
		else 
			System.out.println("���� �ٸ� ��");

	}

}
