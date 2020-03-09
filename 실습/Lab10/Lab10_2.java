/* 2��. BorderLayout���� ������Ʈ ��ġ�ϱ�
 ->������Ʈ ������ ����, ���� ������ ���� 5�ȼ�, 10 �ȼ� */
import java.awt.*;
import javax.swing.*;

class MyFrame2 extends JFrame{
	MyFrame2(){
		setTitle("Show BorderLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ȭ�� �ݱ�
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,10)); //BorderLayout�� ��ġ -> 5�ȼ�, 10 �ȼ� 
		
		//�ҿ� ���۳�Ʈ�� ��,��,��,�� �������� ��ġ�ϱ�
		c.add(new JButton("North"),BorderLayout.NORTH);
		c.add(new JButton("West"),BorderLayout.WEST);
		c.add(new JButton("Center"),BorderLayout.CENTER);
		c.add(new JButton("East"),BorderLayout.EAST);
		c.add(new JButton("South"),BorderLayout.SOUTH);
		
		setSize(300,300);//������ ������
		setVisible(true);//ȭ�鿡 ���
	}
}

public class Lab10_2 {
	public static void main(String[] args) {
		MyFrame2 mf = new MyFrame2();
	}
}
