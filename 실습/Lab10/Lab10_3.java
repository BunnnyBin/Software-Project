import java.awt.*;
import javax.swing.*;

class MyFrame3 extends JFrame{
	MyFrame3(){
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ȭ�� �ݱ�
		Container c = getContentPane();
		
		c.setLayout(new GridLayout(4,4));

		JLabel [] label = new JLabel [16]; //JLabel 16�� �迭

		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
						Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
						Color.PINK, Color.LIGHT_GRAY, Color.WHITE, 
		Color.DARK_GRAY, Color.BLACK, Color.ORANGE, 
		Color.BLUE,Color.MAGENTA}; //Color �迭 ����
		
		for(int i=0;i<label.length;i++) {
			label[i] = new JLabel(Integer.toString(i)); //�󺧿� ���� �Է�
			label[i].setOpaque(true);  // �� ���� ������ ����
			label[i].setBackground(color[i]); //�� ���� ����
			c.add(label[i]);	
		}
		setSize(500,200);//������ ������
		setVisible(true);//ȭ�鿡 ���

	}
}
public class Lab10_3 {

	public static void main(String[] args) {
		MyFrame3 mf = new MyFrame3();
	}

}
