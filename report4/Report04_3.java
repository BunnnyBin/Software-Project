/*3번 문제> 마우스 클릭 이벤트 처리 프로그램
 *       마우스로  “C”를 클릭할 때마다 컨텐츠팬 내에 랜덤한 위치로 움직이도록 하는 프로그램
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Report04_3 extends JFrame {
	public Report04_3() {
		setTitle("클릭 연습 용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); //배치관리자 없는 컨테이너 -> 문자c 랜덤하게 위치
		//문자 c라벨 생성
		JLabel label = new JLabel("C");
		label.setSize(10,10);
		label.setLocation(100,100);
		c.add(label);
		//이미지 라벨 생성
		ImageIcon image = new ImageIcon("D:\\중앙대학교 3-1\\소프트웨어프로젝트\\과제4\\image.png");
		JLabel label2 = new JLabel(image);
		label2.setSize(100,100);
		label2.setLocation(label.getX() - 30 ,label.getY() - 90);
		c.add(label2);
		
		//마우스 리스너를 라벨에 등록하기
		label.addMouseListener(new MouseAdapter(){ //마우스 어뎁터 익명 클래스 생성
			Random random = new Random(); //랜덤한 숫자
			
			public void mouseClicked(MouseEvent e) { //클릭 이벤트
				JLabel b = (JLabel)e.getSource();
				b.setSize(10,10);
				b.setLocation(random.nextInt(250),random.nextInt(250)); //라벨 랜덤한 위치 설정
				label2.setLocation(label.getX() - 30 ,label.getY() - 90);  //**문자c에 따라서 위치가 바뀌는 말풍선그림
			}
		});
		
		setSize(300,300);
		setLocationRelativeTo(null); //가운데 창 띄우기
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Report04_3();
	}

}
