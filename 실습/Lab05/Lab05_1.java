class Average {
	public static int average(int[] array) { //static �޼ҵ�
		int Array[] = array; //�Ű��迭�� ����Ű�� ���۷��� ����
		int sum = 0; //���հ�
		
		for(int i=0;i<Array.length;i++) 
			sum += Array[i];
		
		return sum / Array.length;  //��� ��ȯ
	}
	
	public double average(double [] array) { //non-static �޼ҵ�
		double Array[] = array; //�Ű��迭�� ����Ű�� ���۷��� ����
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
		Average a = new Average(); //AverageŬ������ ��ü ����
		
		System.out.println("{1,2,3,4,5,6}�� ��հ� = " + Average.average(arr1)); //static �޼ҵ��̹Ƿ� �۷����̸�.�ɹ�����
		System.out.println("{6.0, 4.4, 1.9, 2.9, 3.4, 3.5} �� ��հ� = " + a.average(arr2));

	}

}
