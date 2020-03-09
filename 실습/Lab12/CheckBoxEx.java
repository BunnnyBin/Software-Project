/*1번) “버튼 활성화” 체크박스를 선택하면 버튼이 작동하지 못하게 하고, 해제하면 다시 작동하게 함
 * ‘버튼 감추기” 체크박스를 선택하면 버튼이 보이지 않도록 하고, 해제하면 버튼이 보이도록 하는 프로그램
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
		JCheckBox check1 = new JCheckBox("버튼 비활성화");
		JCheckBox check2 = new JCheckBox("버튼 감추기");
		
		c.add(check1);
		c.add(check2);
		c.add(button);
		
		check1.addItemListener(new ItemListener() { //버튼 비활성화에 대한 리스너
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) //체크가 되면
					button.setEnabled(false); //버튼 비활성화
				else
					button.setEnabled(true);
			}
		});
		check2.addItemListener(new ItemListener() { //버튼 감추기에 대한 리스너
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) //체크가 되면 
					button.setVisible(false); //버튼 숨기기
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
