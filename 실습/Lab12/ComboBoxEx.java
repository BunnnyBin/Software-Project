/*2�� ����) JTextField �Է�â�� ���ڿ��� �Է��ϰ� <Enter> Ű�� �Է��ϸ� ���ڿ��� �޺��ڽ��� ���������� �����ϴ� ���α׷�
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxEx extends JFrame{

	public ComboBoxEx() {
		setTitle("JTextField ans JComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField text = new JTextField(10); //�ؽ�Ʈ�ʵ�
		JComboBox <String> strCombo = new JComboBox <String> (); //�޺��ڽ�
		
		text.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				strCombo.addItem(t.getText());  //�޺��ڽ��� �ؽ�Ʈ�ʵ��� ���� �ø���
			}
		});
		
		c.add(text);
		c.add(strCombo);
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComboBoxEx();

	}

}
