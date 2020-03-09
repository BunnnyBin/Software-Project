//1�� ����. �󺧿� ���콺�� �ø��� Love Java, ������ Java �� ���� ��ȭ�Ǵ� ���α׷�
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseEx extends JFrame{
	public MouseEx() {
		setTitle("���콺 �ø��� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		//�� ������Ʈ ���� - �̺�Ʈ �ҽ�
		JLabel label = new JLabel("Java");
		c.add(label); //�����̳ʿ� �� ���̱�
		
		//������ ���
		label.addMouseListener(new MouseAdapter() {
			//������Ʈ�� ������� �ø��� ���� ���� ��ȭ
			public void mouseEntered(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java");
			}
			//������Ʈ���� ���콺�� ������ ���� ���ڸ� ��ȭ��Ű��
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
