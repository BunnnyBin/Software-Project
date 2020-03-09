class TV {
	private int size; //인치, 외부 클래스 접근 불가능
	public TV(int size) { this.size = size; } //생성자 - 외부에서 size 접근 가능하도록 함
	protected int getSize() { return size; } //size값 반환하는 함수
}

class ColorTV extends TV{
	int color; //컬러
	
	ColorTV(int size, int color){ //생성자 - size는 TV클래스에서, color는 ColorTV클래스에서 정의
		super(size); //TV클래스의 생성자로 이동
		this.color = color;
	};
	void printProperty() {
		System.out.println("나의 Color TV는 " + getSize() + "인치 " + color + "컬러");
	}
	
}

class IPTV extends ColorTV{
	String adress; //주소
	
	IPTV(String adress, int size, int color){ //생성자 - size, color는 ColorTV클래스에서, adress는 IPTV클래스에서 정의
		super(size, color); //ColorTV클래스의 생성자로 이동
		this.adress = adress;
	}
	void printProperty() { //메소드 오버라이딩 (슈퍼클래스 ColorTV의 메소드 재정의)
		System.out.println("나의 IP TV 는 " + adress + " 주소의 " + getSize() + "인치 " + color + "컬러");
	}
	
}
public class Lab06_1 {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024); //ColorTV 객체 생성
		myTV.printProperty();

		IPTV ipTV = new IPTV("192.1.1.2", 48, 2048);//IPTV객체 생성
		ipTV.printProperty();

	}

}
