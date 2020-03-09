//Report02�� ����° ����
class PairMap {
	protected String keyArray [];// key���� �����ϴ� �迭
	protected String valueArray []; // value ���� �����ϴ¹迭
	
	String get(String key) {// key ������ 'value'�� �˻�
		String result = null;
		for(int i=0;i < keyArray.length;i++) //key�迭��ŭ �ݺ��Ͽ�
			if(keyArray[i].equals(key)) { //�Ű������� ���� key���� ã��
				result = valueArray [i];
				break;
			}
		return result;//���� ������ value ��ȯ
	}
	void put(String key, String value) {// key�� value�� ������ '����'
		for(int i=0;i < keyArray.length;i++) {
			if(keyArray[i] == key) { 
				valueArray [i] = value;
				break;
			}
			else if(keyArray[i] == null) {
				keyArray[i] = key;
				valueArray [i] = value;
				break;
			}
		}
	}
	String delete(String key) { // key ���� ���� ������(value�� �Բ�)�� '����'. ������ value �� ����
		String result = null;
		for(int i=0;i < keyArray.length;i++) 
			if(keyArray[i].equals(key)) {
				valueArray[i] = null;
				result = valueArray[i];
				break;
			}
		return result;
	}
	int length() {// ���� ����� �������� ���� ����
		int count = 0;
		for(int i=0;i < keyArray.length;i++)
			if(keyArray[i] != null)
				count++;
		return count;
	}
}

class Dictionary extends PairMap{ //PairMap�� ��ӹ޴� Dictionary Ŭ������ ����
	
	Dictionary(int num){//�Ű� ���� == �迭 ũ��
		keyArray = new String[num];
		valueArray = new String[num];
	}
}

public class DictionaryApp{

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++"); // ���繮�� ���� C++�� ����		
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		dic.delete("Ȳ����");		
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));	
	}

}
