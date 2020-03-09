/*2번문제> GUI 모양을 가진 스윙 프레임(버튼, 텍스트, 라벨)
 *       단, 10개의 *문자가 랜덤하게 위치하는 프로그램
 */
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Report04_2 extends JFrame{
	public Report04_2() {
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기 창
		Container c = getContentPane();  //최종 컨테이너
		c.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();  //패널1 생성 - 맨 윗줄
		panel1.setBackground(Color.gray);
		panel1.add(new JButton("열기")); //버큰 생성
		panel1.add(new JButton("닫기"));
		panel1.add(new JButton("나가기"));
		
		JPanel panel2 = new JPanel();  //패널2 생성 - 가운데 (문자*있는 곳)
		panel2.setLayout(null);  //문자* 를 임의 위치에 두기 위해 배치 관리자 없는 패널
		Random random = new Random();  //랜덤 숫자 만들기
		for(int i = 0;i<10;i++) {
		JLabel label = new JLabel("*");
		label.setSize(10,10);   //**이거 안하면 문자가 안보임!!!
		label.setLocation(random.nextInt(250),random.nextInt(250)); //문자*를 임의 위치에 두기
		panel2.add(label);   //패널에 저장
		}	
		
		JPanel panel3 = new JPanel();   //패널3 생성 - 맨 아래쪽
		panel3.setBackground(Color.yellow);
		panel3.add(new JButton("Word Input"));
		panel3.add(new JTextField(20)); //텍스트필드 생성
		
		//최종 컨테이너에 보조 컨테이너 담기
		c.add(panel1,BorderLayout.NORTH);
		c.add(panel2,BorderLayout.CENTER);
		c.add(panel3,BorderLayout.SOUTH);
		
		setSize(400,400);
		setLocationRelativeTo(null); //가운데 창 띄우기
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Report04_2();
	}

}
