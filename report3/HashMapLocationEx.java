/*3�� ����: ���� �̸�, ����, �浵 ������ ���� Location Ŭ������ 
 * �����̸��� ��Ű���� �ϴ� HashMap<String,Location> �̷����̴�.
 * ����ڷκ��� �Է� �޾� 4���� ���ø� ����ϴ� ���α׷��̴�.
 * �� ���ư� ���� �̸��� �Է��Ͽ� �ش� �����̸�,����,�浵�� ����ϴ� ���α׷��̴�.("����"�� �Է��ϸ� ����ȴ�)
 */
import java.util.*;

class Location{//���� �̸�, ������ �浵 ������ �����ϴ� Ŭ����
	String city, lat, longi;//���� �̸�, ������ �浵
	public Location(String city, String lat, String longi) {
		this.city = city;
		this.lat = lat;
		this.longi = longi;
	}
}

public class HashMapLocationEx {
	public static void main(String[] args) {
		//���� �̸��� Location ��ü�� ������ �����ϴ� �÷��� ����
		HashMap<String,Location> map = new HashMap<String,Location>(); 
		//�÷��ǿ� ���� 4�� �Է�
		System.out.println("����, �浵, ������ �Է��ϼ���.");
		for(int i=0;i<4;i++) {
			System.out.print(">> ");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			String s[] = str.split(", "); //�Է� ���� ���ڿ��� ", "������ �и��ϱ�
			map.put(s[0], new Location(s[0],s[1],s[2])); //����,�浵,������ �÷��ǿ� �Է�
		}
		System.out.println();
		//�÷����� ��� ���� ����Ѵ�.
		System.out.println("�ؽøʿ� �ִ� ��� ���ø� ����մϴ�.");
		Set set = map.keySet();//�ؽø��� ��� Ű�� ���� Set<K>�÷��� �����Ͽ� �̸� �޾��ִ� set ��ü ����
		Iterator <String> it = set.iterator(); //Iterator�÷�������  Set<K>�÷��ǿ� ���������� �����ϱ�
		while(it.hasNext()) {
			String key = it.next();//set�� key���� ���ڿ� ������ ����
			Location locate = map.get(key); //�ش� key�� ���� ��(Location ��ü)�� ��������
			System.out.println(locate.city + ", " + locate.lat + ", " + locate.longi);
		}
		System.out.println();
		//���ø� �˻��Ͽ� �ش� ���� ����Ѵ�.
		System.out.println("���ø� �˻��մϴ�.");
		System.out.print("�����̸�  >> ");
		Scanner s = new Scanner(System.in);
		String key = s.nextLine();
		while(!key.equals("����")) {
			Location locate  = map.get(key); //Ű�� �ش��ϴ� ��(Location ��ü) �����ϱ�
			if(locate == null) //�Է� ���� Ű�� ���ٸ�
				System.out.println(key + " �����ϴ�.");
			else
				System.out.println(locate.city + ", " + locate.lat + ", " + locate.longi);
			
			System.out.print("�����̸�  >> ");
			s = new Scanner(System.in);
			key = s.nextLine();
		}
		System.out.println("�˻��� �����մϴ�.");
		
	}
}
