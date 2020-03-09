//3번 문제. 창의 배경색이 초록색이지만 마우스가 드래그하면 화면이 노란색으로 유지되는 프로그램
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseEx2 extends JFrame{
	public MouseEx2() {
		setTitle("드래깅동안 YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.GREEN); //기본 배경색은 초록색
		
		//두가지 마우스 리스너 등록
		MyMouseListener ml = new MyMouseListener();
		c.addMouseListener(ml);
		c.addMouseMotionListener(ml);
		
		setLocationRelativeTo(null); //가운데 창이 뜬다
		setSize(300,200);
		setVisible(true);
	}
	//마우스 리스너에 대한 내부 클래스
	class MyMouseListener extends MouseAdapter{
		//드래깅하는 동안만 배경색 노란색
		public void mouseDragged(MouseEvent e) {
			JComponent c = (JComponent)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		public void mouseReleased(MouseEvent e) {
			JComponent c = (JComponent)e.getSource();
			c.setBackground(Color.GREEN);
		}
	}
	public static void main(String[] args) {
		new MouseEx2();
	}

}
