/*3�� ����> ���콺 Ŭ�� �̺�Ʈ ó�� ���α׷�
 *       ���콺��  ��C���� Ŭ���� ������ �������� ���� ������ ��ġ�� �����̵��� �ϴ� ���α׷�
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Report04_3 extends JFrame {
	public Report04_3() {
		setTitle("Ŭ�� ���� �� �������α׷�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); //��ġ������ ���� �����̳� -> ����c �����ϰ� ��ġ
		//���� c�� ����
		JLabel label = new JLabel("C");
		label.setSize(10,10);
		label.setLocation(100,100);
		c.add(label);
		//�̹��� �� ����
		ImageIcon image = new ImageIcon("D:\\�߾Ӵ��б� 3-1\\����Ʈ����������Ʈ\\����4\\image.png");
		JLabel label2 = new JLabel(image);
		label2.setSize(100,100);
		label2.setLocation(label.getX() - 30 ,label.getY() - 90);
		c.add(label2);
		
		//���콺 �����ʸ� �󺧿� ����ϱ�
		label.addMouseListener(new MouseAdapter(){ //���콺 ��� �͸� Ŭ���� ����
			Random random = new Random(); //������ ����
			
			public void mouseClicked(MouseEvent e) { //Ŭ�� �̺�Ʈ
				JLabel b = (JLabel)e.getSource();
				b.setSize(10,10);
				b.setLocation(random.nextInt(250),random.nextInt(250)); //�� ������ ��ġ ����
				label2.setLocation(label.getX() - 30 ,label.getY() - 90);  //**����c�� ���� ��ġ�� �ٲ�� ��ǳ���׸�
			}
		});
		
		setSize(300,300);
		setLocationRelativeTo(null); //��� â ����
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Report04_3();
	}

}
