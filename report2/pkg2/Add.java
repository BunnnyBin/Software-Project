//2. pkg1 패키지에 Calc 클래스, pkg2 패키지에 Add, Sub, Mul, Div 클래스를 가지도록 작성하라
package pkg2;

public class Add{
	int a, b; //디폴트 맴버: 같은 패키지 내에서는 사용 가능(Calc클래스 접근할 필요없음)
	
	public void setValue(int a, int b) { //public함수 : 다른 패키지의 Calc클래스가 접근 가능
		this.a = a;
		this.b = b;
	}
	public int calculate() { //public함수 : 다른 패키지의 Calc클래스가 접근 가능
		return a + b;
	}
}
