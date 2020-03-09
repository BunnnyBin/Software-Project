class Average {
	public static int average(int[] array) { //static 메소드
		int Array[] = array; //매개배열을 가리키는 래퍼런스 변수
		int sum = 0; //총합계
		
		for(int i=0;i<Array.length;i++) 
			sum += Array[i];
		
		return sum / Array.length;  //평균 반환
	}
	
	public double average(double [] array) { //non-static 메소드
		double Array[] = array; //매개배열을 가리키는 래퍼런스 변수
		double sum = 0;
		
		for(int i=0;i<Array.length;i++) 
			sum += Array[i];
		
		return sum / Array.length;
	}
}

public class Lab05_1 {
	
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6}; 
		double arr2[] = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
		Average a = new Average(); //Average클래스의 객체 생성
		
		System.out.println("{1,2,3,4,5,6}의 평균값 = " + Average.average(arr1)); //static 메소드이므로 글래스이름.맴버변수
		System.out.println("{6.0, 4.4, 1.9, 2.9, 3.4, 3.5} 의 평균값 = " + a.average(arr2));

	}

}
