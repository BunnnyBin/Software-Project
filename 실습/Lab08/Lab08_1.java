/*1.	Random Ŭ������ �̿��Ͽ� 1 ~ 100 ������ randon ������ 10�� ����
 *      -> Vector�� ����
 *      -> Vector���� ����(2���� ��� ���)  */
import java.lang.Math; // Math.random()����� ���� ��Ű�� ����
import java.util.*;

public class Lab08_1 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer> (10); //���� ������ �ٷ�� ���ʸ� ���� ����
		int i;
		
		for(i=0;i<10;i++) {
			int randon = (int)(Math.random()*100 + 1); //  1 ~ 100 ������ ������ ���� ����
			v.add(randon); //���ʸ� ���Ϳ� ��� ����
		}
		
		for(i=0;i<v.size();i++) { // Vector�κ��� ������ �о� ����� ���� ù��° ��� -> for loop �� get()
			int n = v.get(i);
			System.out.println(n);
		}
		System.out.println();
		
		Iterator <Integer> it = v.iterator(); //�÷��� ���� �˻��� ���� Iterator ����
		while(it.hasNext()) { // Vector�κ��� ������ �о� ����� ���� �ι�° ��� -> while loop�� Iterator
			int m = it.next();
			System.out.println(m);
		}
	}

}
