package Lab04_2;

public class TV {
	String TVBrand = "";
	int year = 0, width = 0;
	
	public TV(String b,int y, int w) {
		TVBrand = b;
		year = y;
		width = w;
	} // 'LG에서 만든 2017년 45인치 TV' 생성자1
	public TV(int y,int w) {
		year = y;
		width = w;
	} // '2018년 52인치 TV' 생성자2
	public TV(int w) {
		width = w;
	} // '65인치 TV' 생성자3
	
	void show() { //출력 함수
		if(TVBrand != "" && year != 0 && width != 0)
			System.out.println(TVBrand + "에서 만든 " + year +"년 " + width + "인치 TV");// 'LG에서 만든 2017년 45인치 TV'를 출력
		else if(year != 0 && width != 0)
			System.out.println(year +"년 " + width + "인치 TV");// '2018년 52인치 TV'를 출력
		else if(width != 0)
			System.out.println(width + "인치 TV"); //'65인치 TV'를 출력
	}
	
	public static void main(String [] args) {
		TV myTV = new TV("LG", 2017, 45); // LG에서 만든 2017년 45인치 TV
		myTV.show();
		TV myTV1 = new TV(2018, 52); // 2018년 52인치 TV
		myTV1.show();
		TV myTV2 = new TV(65); // 65인치 TV
		myTV2.show();
	}	

}
