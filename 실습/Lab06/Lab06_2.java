import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src); // 추상 메소드
	abstract protected String srcString(); // 추상 메소드
	abstract protected String destString(); // 추상 메소드
	protected double ratio; // 비율 -> 1마일이 몇 KM인지 
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString() + "을 " + destString() + "로 바꿉니다.");
		System.out.print(srcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + destString() + "입니다");
		scanner.close();
	}
}

class Km2Mile extends Converter{ 
	
	Km2Mile(double ratio){ this.ratio = ratio;} //비율 인자를 받는 생성자
	
	protected double convert(double src) { //km를 인자로 받으면 mile를 출력하는 추상메소드 구현
		return (src / ratio);
	}
	protected String srcString() { return "Km";} //"Km"를 반환하는 추상메소드 구현
	protected String destString() { return "mile";} // "mile"를 반환하는 추상메소드 구현
	
}

public class Lab06_2 {
	
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6Km
		toMile.run(); //Converter클래스의 함수 실행

	}

}
