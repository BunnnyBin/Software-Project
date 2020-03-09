//2�� ����. �󺧿� Ű ��'+'�� �Է��ϸ� �� ��Ʈ ũ�Ⱑ 5�� Ŀ���� �ݴ�� '-'�� Ű�� �Է��ϸ� �۾����� ���α׷�
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MyKetListener extends KeyAdapter{
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar() == '+') {
			JLabel la = (JLabel)e.getSource();
			Font f = la.getFont();   //���� ��Ʈ ��ü
			int size = f.getSize();  //���� ��Ʈ ������ ��ȯ
			la.setFont(new Font("TimesRoman",Font.PLAIN,size + 5)); //���� ��Ʈ ������� 5�� ����
		}
		else if(e.getKeyChar() == '-') {
			JLabel la = (JLabel)e.getSource();
			Font f = la.getFont();   
			int size = f.getSize(); 
			if(size <= 5)
				return; //���ڰ� �ʹ� ������ �ƹ��͵� ����
			la.setFont(new Font("TimesRoman",Font.PLAIN,size - 5));
		}
	}
}
public class KeyEx extends JFrame{
	//������ �Լ�
	public KeyEx() {
		setTitle("+,- Ű�� ��Ʈ ũ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		//�� ������Ʈ ���� - �̺�Ʈ �ҽ�
		JLabel label = new JLabel("Love Java");
		c.add(label); //�����̳ʿ� �� ���̱�
		
		label.addKeyListener(new MyKetListener()); //������ ����ϱ�
		
		setLocationRelativeTo(null);
		setSize(300,200);
		setVisible(true);
		//��Ŀ�� ����
		label.setFocusable(true);
		label.requestFocus();
	}
	
	public static void main(String[] args) {
		new KeyEx();
	}

}
