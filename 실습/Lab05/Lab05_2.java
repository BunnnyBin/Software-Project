class ArrayUtil{
	//배열 2개를 입력받아서 연결시켜 하나의 배열 출력하는 함수
	public static int[] concat(int[] a, int[] b) {
		int[] Array = new int[a.length + b.length];
		
		for(int i = 0; i< a.length ; i++) 
			Array[i] = a[i]; //먼저 배열 a 복사
			
		for(int i= 0;i<b.length;i++ ) {
			Array[i + a.length] = b[i]; //정답 배열을 배열a의 길이만큼 건너뛰어서 -> 배열b 복사
		}
		
		return Array;
	}
	//배열을 입력받으면 배열을 화면에 출력하는 함수
	public static void print(int[] array) {
		System.out.print("[");
		 
		for(int i=0;i<array.length;i++)
		           System.out.print(array[i] + " ");
		
		System.out.print("]");
	}
}

public class Lab05_2 {

	public static void main(String[] args) {
		int [] array1 = { 1, 5, 7, 9 };
		int [] array2 = { 3, 6, -1, 100, 77 };
		int [] array3 = ArrayUtil.concat(array1, array2);
		
		ArrayUtil.print(array3);
	}

}
