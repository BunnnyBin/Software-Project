/*2������> GUI ����� ���� ���� ������(��ư, �ؽ�Ʈ, ��)
 *       ��, 10���� *���ڰ� �����ϰ� ��ġ�ϴ� ���α׷�
 */
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Report04_2 extends JFrame{
	public Report04_2() {
		setTitle("���� ���� �г��� ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�ݱ� â
		Container c = getContentPane();  //���� �����̳�
		c.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();  //�г�1 ���� - �� ����
		panel1.setBackground(Color.gray);
		panel1.add(new JButton("����")); //��ū ����
		panel1.add(new JButton("�ݱ�"));
		panel1.add(new JButton("������"));
		
		JPanel panel2 = new JPanel();  //�г�2 ���� - ��� (����*�ִ� ��)
		panel2.setLayout(null);  //����* �� ���� ��ġ�� �α� ���� ��ġ ������ ���� �г�
		Random random = new Random();  //���� ���� �����
		for(int i = 0;i<10;i++) {
		JLabel label = new JLabel("*");
		label.setSize(10,10);   //**�̰� ���ϸ� ���ڰ� �Ⱥ���!!!
		label.setLocation(random.nextInt(250),random.nextInt(250)); //����*�� ���� ��ġ�� �α�
		panel2.add(label);   //�гο� ����
		}	
		
		JPanel panel3 = new JPanel();   //�г�3 ���� - �� �Ʒ���
		panel3.setBackground(Color.yellow);
		panel3.add(new JButton("Word Input"));
		panel3.add(new JTextField(20)); //�ؽ�Ʈ�ʵ� ����
		
		//���� �����̳ʿ� ���� �����̳� ���
		c.add(panel1,BorderLayout.NORTH);
		c.add(panel2,BorderLayout.CENTER);
		c.add(panel3,BorderLayout.SOUTH);
		
		setSize(400,400);
		setLocationRelativeTo(null); //��� â ����
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Report04_2();
	}

}
