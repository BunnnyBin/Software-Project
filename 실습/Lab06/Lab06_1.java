class TV {
	private int size; //��ġ, �ܺ� Ŭ���� ���� �Ұ���
	public TV(int size) { this.size = size; } //������ - �ܺο��� size ���� �����ϵ��� ��
	protected int getSize() { return size; } //size�� ��ȯ�ϴ� �Լ�
}

class ColorTV extends TV{
	int color; //�÷�
	
	ColorTV(int size, int color){ //������ - size�� TVŬ��������, color�� ColorTVŬ�������� ����
		super(size); //TVŬ������ �����ڷ� �̵�
		this.color = color;
	};
	void printProperty() {
		System.out.println("���� Color TV�� " + getSize() + "��ġ " + color + "�÷�");
	}
	
}

class IPTV extends ColorTV{
	String adress; //�ּ�
	
	IPTV(String adress, int size, int color){ //������ - size, color�� ColorTVŬ��������, adress�� IPTVŬ�������� ����
		super(size, color); //ColorTVŬ������ �����ڷ� �̵�
		this.adress = adress;
	}
	void printProperty() { //�޼ҵ� �������̵� (����Ŭ���� ColorTV�� �޼ҵ� ������)
		System.out.println("���� IP TV �� " + adress + " �ּ��� " + getSize() + "��ġ " + color + "�÷�");
	}
	
}
public class Lab06_1 {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024); //ColorTV ��ü ����
		myTV.printProperty();

		IPTV ipTV = new IPTV("192.1.1.2", 48, 2048);//IPTV��ü ����
		ipTV.printProperty();

	}

}
