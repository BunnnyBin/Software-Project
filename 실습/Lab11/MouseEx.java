//1번 문제. 라벨에 마우스를 올리면 Love Java, 내리면 Java 로 라벨이 변화되는 프로그램
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseEx extends JFrame{
	public MouseEx() {
		setTitle("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		//라벨 컴포넌트 생성 - 이벤트 소스
		JLabel label = new JLabel("Java");
		c.add(label); //컨테이너에 라벨 붙이기
		
		//리스너 등록
		label.addMouseListener(new MouseAdapter() {
			//컴포넌트에 마우수를 올리면 라벨의 글자 변화
			public void mouseEntered(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java");
			}
			//컴포넌트에서 마우스를 내리면 라벨의 글자를 변화시키기
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("Java");
			}
		});
		
		setLocationRelativeTo(null);
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseEx();
	}

}
