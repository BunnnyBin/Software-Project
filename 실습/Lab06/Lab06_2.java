import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src); // �߻� �޼ҵ�
	abstract protected String srcString(); // �߻� �޼ҵ�
	abstract protected String destString(); // �߻� �޼ҵ�
	protected double ratio; // ���� -> 1������ �� KM���� 
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString() + "�� " + destString() + "�� �ٲߴϴ�.");
		System.out.print(srcString() + "�� �Է��ϼ���>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: " + res + destString() + "�Դϴ�");
		scanner.close();
	}
}

class Km2Mile extends Converter{ 
	
	Km2Mile(double ratio){ this.ratio = ratio;} //���� ���ڸ� �޴� ������
	
	protected double convert(double src) { //km�� ���ڷ� ������ mile�� ����ϴ� �߻�޼ҵ� ����
		return (src / ratio);
	}
	protected String srcString() { return "Km";} //"Km"�� ��ȯ�ϴ� �߻�޼ҵ� ����
	protected String destString() { return "mile";} // "mile"�� ��ȯ�ϴ� �߻�޼ҵ� ����
	
}

public class Lab06_2 {
	
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6); // 1������ 1.6Km
		toMile.run(); //ConverterŬ������ �Լ� ����

	}

}
