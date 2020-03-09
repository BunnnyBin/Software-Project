//3�� ����. â�� ������ �ʷϻ������� ���콺�� �巡���ϸ� ȭ���� ��������� �����Ǵ� ���α׷�
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseEx2 extends JFrame{
	public MouseEx2() {
		setTitle("�巡�뵿�� YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.GREEN); //�⺻ ������ �ʷϻ�
		
		//�ΰ��� ���콺 ������ ���
		MyMouseListener ml = new MyMouseListener();
		c.addMouseListener(ml);
		c.addMouseMotionListener(ml);
		
		setLocationRelativeTo(null); //��� â�� ���
		setSize(300,200);
		setVisible(true);
	}
	//���콺 �����ʿ� ���� ���� Ŭ����
	class MyMouseListener extends MouseAdapter{
		//�巡���ϴ� ���ȸ� ���� �����
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
