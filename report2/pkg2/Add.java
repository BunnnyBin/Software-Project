//2. pkg1 ��Ű���� Calc Ŭ����, pkg2 ��Ű���� Add, Sub, Mul, Div Ŭ������ �������� �ۼ��϶�
package pkg2;

public class Add{
	int a, b; //����Ʈ �ɹ�: ���� ��Ű�� �������� ��� ����(CalcŬ���� ������ �ʿ����)
	
	public void setValue(int a, int b) { //public�Լ� : �ٸ� ��Ű���� CalcŬ������ ���� ����
		this.a = a;
		this.b = b;
	}
	public int calculate() { //public�Լ� : �ٸ� ��Ű���� CalcŬ������ ���� ����
		return a + b;
	}
}
