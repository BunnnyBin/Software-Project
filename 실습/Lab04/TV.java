package Lab04_2;

public class TV {
	String TVBrand = "";
	int year = 0, width = 0;
	
	public TV(String b,int y, int w) {
		TVBrand = b;
		year = y;
		width = w;
	} // 'LG���� ���� 2017�� 45��ġ TV' ������1
	public TV(int y,int w) {
		year = y;
		width = w;
	} // '2018�� 52��ġ TV' ������2
	public TV(int w) {
		width = w;
	} // '65��ġ TV' ������3
	
	void show() { //��� �Լ�
		if(TVBrand != "" && year != 0 && width != 0)
			System.out.println(TVBrand + "���� ���� " + year +"�� " + width + "��ġ TV");// 'LG���� ���� 2017�� 45��ġ TV'�� ���
		else if(year != 0 && width != 0)
			System.out.println(year +"�� " + width + "��ġ TV");// '2018�� 52��ġ TV'�� ���
		else if(width != 0)
			System.out.println(width + "��ġ TV"); //'65��ġ TV'�� ���
	}
	
	public static void main(String [] args) {
		TV myTV = new TV("LG", 2017, 45); // LG���� ���� 2017�� 45��ġ TV
		myTV.show();
		TV myTV1 = new TV(2018, 52); // 2018�� 52��ġ TV
		myTV1.show();
		TV myTV2 = new TV(65); // 65��ġ TV
		myTV2.show();
	}	

}
