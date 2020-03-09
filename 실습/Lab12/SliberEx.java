/*3�� ����) 3.	100���� 200���� ������ �� �ִ� ���� �����̴��� ���̺��� �ϳ� 
 * �����̴��� �����̸� ���̺� ������Ʈ�� ��ġ�� �����ִ� ���� �������α׷�
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class SliberEx extends JFrame{

	public SliberEx() {
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider s = new JSlider(100,200,150);
		JLabel label = new JLabel();
		
		c.add(s);
		c.add(label);
		
		//�����̴� �Ӽ�
		s.setPaintLabels(true);
		s.setPaintTicks(true);
		s.setPaintTrack(true);
		s.setMajorTickSpacing(20);
		//�ؽ�Ʈ �Ӽ�
		label.setBackground(Color.green);
		label.setOpaque(true);
		label.setText(Integer.toString(s.getValue())); //�ʱ�ȭ�鿡�� ���� ���
		
		s.addChangeListener(new ChangeListener() { //�����̴��� ���� �̺�Ʈ ������
			public void stateChanged(ChangeEvent e) {
				JSlider j = (JSlider)e.getSource();
				label.setText(Integer.toString(j.getValue())); //������ ��(������)�� �ؽ�Ʈ(����)�� ����
			}
		});
		
		setSize(300,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new SliberEx();

	}

}
