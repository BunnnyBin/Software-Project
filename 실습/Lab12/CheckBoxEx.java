/*1��) ����ư Ȱ��ȭ�� üũ�ڽ��� �����ϸ� ��ư�� �۵����� ���ϰ� �ϰ�, �����ϸ� �ٽ� �۵��ϰ� ��
 * ����ư ���߱⡱ üũ�ڽ��� �����ϸ� ��ư�� ������ �ʵ��� �ϰ�, �����ϸ� ��ư�� ���̵��� �ϴ� ���α׷�
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxEx extends JFrame{
	public CheckBoxEx(){
		setTitle("CheckBoxEx Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton button = new JButton("test button");
		JCheckBox check1 = new JCheckBox("��ư ��Ȱ��ȭ");
		JCheckBox check2 = new JCheckBox("��ư ���߱�");
		
		c.add(check1);
		c.add(check2);
		c.add(button);
		
		check1.addItemListener(new ItemListener() { //��ư ��Ȱ��ȭ�� ���� ������
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) //üũ�� �Ǹ�
					button.setEnabled(false); //��ư ��Ȱ��ȭ
				else
					button.setEnabled(true);
			}
		});
		check2.addItemListener(new ItemListener() { //��ư ���߱⿡ ���� ������
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) //üũ�� �Ǹ� 
					button.setVisible(false); //��ư �����
				else
					button.setVisible(true);
			}
		});
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxEx();
	}

}
