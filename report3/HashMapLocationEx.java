/*3번 문제: 도시 이름, 위도, 경도 정보를 가진 Location 클래스와 
 * 도시이름을 ‘키’로 하는 HashMap<String,Location> 켈랙션이다.
 * 사용자로부터 입력 받아 4개의 도시를 출력하는 프로그램이다.
 * 더 나아가 도시 이름을 입력하여 해당 도시이름,위도,경도를 출력하는 프로그램이다.("종료"를 입력하면 종료된다)
 */
import java.util.*;

class Location{//도서 이름, 위도와 경도 정보를 포함하는 클래스
	String city, lat, longi;//도시 이름, 위도와 경도
	public Location(String city, String lat, String longi) {
		this.city = city;
		this.lat = lat;
		this.longi = longi;
	}
}

public class HashMapLocationEx {
	public static void main(String[] args) {
		//도시 이름과 Location 객체를 쌍으로 저장하는 컬렉션 생성
		HashMap<String,Location> map = new HashMap<String,Location>(); 
		//컬렉션에 값을 4번 입력
		System.out.println("도시, 경도, 위도를 입력하세요.");
		for(int i=0;i<4;i++) {
			System.out.print(">> ");
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			String s[] = str.split(", "); //입력 받은 문자열을 ", "단위로 분리하기
			map.put(s[0], new Location(s[0],s[1],s[2])); //도시,경도,위도를 컬렉션에 입력
		}
		System.out.println();
		//컬렉션의 모든 값을 출력한다.
		System.out.println("해시맵에 있는 모든 도시를 출력합니다.");
		Set set = map.keySet();//해시맵의 모든 키를 담은 Set<K>컬렉션 생성하여 이를 받아주는 set 객체 생성
		Iterator <String> it = set.iterator(); //Iterator컬렉션으로  Set<K>컬렉션에 순차적으로 접근하기
		while(it.hasNext()) {
			String key = it.next();//set의 key값을 문자열 변수에 저장
			Location locate = map.get(key); //해당 key에 대한 값(Location 객체)를 가져오기
			System.out.println(locate.city + ", " + locate.lat + ", " + locate.longi);
		}
		System.out.println();
		//도시를 검색하여 해당 값을 출력한다.
		System.out.println("도시를 검색합니다.");
		System.out.print("도시이름  >> ");
		Scanner s = new Scanner(System.in);
		String key = s.nextLine();
		while(!key.equals("종료")) {
			Location locate  = map.get(key); //키에 해당하는 값(Location 객체) 생성하기
			if(locate == null) //입력 받은 키가 없다면
				System.out.println(key + " 없습니다.");
			else
				System.out.println(locate.city + ", " + locate.lat + ", " + locate.longi);
			
			System.out.print("도시이름  >> ");
			s = new Scanner(System.in);
			key = s.nextLine();
		}
		System.out.println("검색을 종료합니다.");
		
	}
}
