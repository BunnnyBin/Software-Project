/* 1��. �־��� ���۳�Ʈ�� ȭ�鿡 ����ϵ��� �ϴ� ���α׷�
 * -> �����ӿ� ��/�г��� �����Ͽ� add()�� �̿��Ͽ� ���۳�Ʈ�� ��/�гο� ���̱�
 */
import java.awt.*;
import javax.swing.*;

class MyFrame1 extends JFrame{
	MyFrame1(){
		setTitle("Lab10_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ȭ�� �ݱ�
		Container contentpane = getContentPane();
		//JPanel panel = new JPanel();
		contentpane.setLayout(new FlowLayout());
	
		// Create a button with text OK 
		JButton jbtOK = new JButton("OK"); 
		 // Create a label with text "Enter your name: "
		JLabel jlblName = new JLabel("Enter your name: "); 
		 // Create a text field with text "Type Name Here"
		JTextField jtfName = new JTextField("Type Name Here"); 
		 // Create a check box with text bold
		JCheckBox jchkBold = new JCheckBox("Bold"); 
		 // Create a radio button with text red
		JRadioButton jrbRed = new JRadioButton("Red"); 
		 // Create a combo box with choices red, green, and blue
		JComboBox jcboColor = new JComboBox(new String[]{"Red",  "Green", "Blue"});
		
		//�гο� ���� �ִ� ���۳�Ʈ�� ���̱�
		contentpane.add(jbtOK);
		contentpane.add(jlblName);
		contentpane.add(jtfName);
		contentpane.add(jchkBold);
		contentpane.add(jrbRed);
		contentpane.add(jcboColor);
		//add(panel) -> �г��� ȭ�鿡 ������ ���
		
		setSize(300,300);//������ ������
		setVisible(true);//ȭ�鿡 ���
	}
		
}

public class Lab10_1 {
	public static void main(String[] args) {
		MyFrame1 mf = new MyFrame1(); //MyFrame�� ���� ��ü ����
	}

}
