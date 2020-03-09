//Report02�� 1�� ����
import java.util.Scanner;

class Rectangle{
	double width, height; //���簢���� ����, ����
	String color; //���簢���� ����
	
	Rectangle(){ //����Ʈ ���� �簢���� ���� ������ ������
		width = 1; //����Ʈ �� = 1
		height = 1; // ""
		color = "white"; //����Ʈ �� = "white"
	}
	Rectangle(double width, double height){ //�־��� ���ο� ������ �簢���� ���� ������
		this(); //�ɹ� ���� �ʱ�ȭ(����Ʈ ��)
		this.width = width; //�ɹ������� �Ű������� �ʱ�ȭ(this�̿�)
		this.height = height;
	}
	Rectangle(double line){ //�־��� �ϳ��� ����(���ο� ���η� ���)�� �簢���� ���� ������
		this();
		width = line;
		height = line;
	}
	
	public double getArea() { //���簢���� ���� ���
		return (width * height);
	}
	public double getPerimeter() { //���簢���� �ѷ��� ���� ���
		return 2 * (width + height);
	}
	
}
public class Report02_1 {

	public static void main(String[] args) {
		Rectangle [] r = new Rectangle[3]; //��ü �迭�� ���� ���۷��� ���� ����
		Scanner scanner = new Scanner(System.in);
		//����, ����, ���� �Է� �ޱ�
		System.out.print("����>>");
		double width = scanner.nextDouble();
		System.out.print("����>>");
		double height = scanner.nextDouble();
		System.out.print("����>>");
		String color = scanner.next();
		
		r[0] = new Rectangle(); //�⺻ �����ڷ� ��ü ����
		r[1] = new Rectangle(width,height); //����,���� �Ű������� �����ڷ� ��ü ����
		r[2] = new Rectangle(width); //���γ� ������ �ϳ��� ���̸� �޴� �����ڷ� ��ü ����
		
		for(int i=0;i<r.length;i++)
			System.out.println((i + 1) + ". ���� = " + r[i].getArea() + ", �ѷ� = " + r[i].getPerimeter());
	}

}
