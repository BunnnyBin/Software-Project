class ArrayUtil{
	//�迭 2���� �Է¹޾Ƽ� ������� �ϳ��� �迭 ����ϴ� �Լ�
	public static int[] concat(int[] a, int[] b) {
		int[] Array = new int[a.length + b.length];
		
		for(int i = 0; i< a.length ; i++) 
			Array[i] = a[i]; //���� �迭 a ����
			
		for(int i= 0;i<b.length;i++ ) {
			Array[i + a.length] = b[i]; //���� �迭�� �迭a�� ���̸�ŭ �ǳʶپ -> �迭b ����
		}
		
		return Array;
	}
	//�迭�� �Է¹����� �迭�� ȭ�鿡 ����ϴ� �Լ�
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
