/*3번 문제) 3.	100에서 200까지 조절할 수 있는 수평 슬라이더와 레이블을 하나 
 * 슬라이더를 움직이면 레이블 컴포넌트에 수치로 보여주는 스윙 응용프로그램
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
		
		//슬라이더 속성
		s.setPaintLabels(true);
		s.setPaintTicks(true);
		s.setPaintTrack(true);
		s.setMajorTickSpacing(20);
		//텍스트 속성
		label.setBackground(Color.green);
		label.setOpaque(true);
		label.setText(Integer.toString(s.getValue())); //초기화면에도 숫자 출력
		
		s.addChangeListener(new ChangeListener() { //슬라이더에 대한 이벤트 리스너
			public void stateChanged(ChangeEvent e) {
				JSlider j = (JSlider)e.getSource();
				label.setText(Integer.toString(j.getValue())); //리스너 값(숫자형)을 텍스트(문자)에 삽입
			}
		});
		
		setSize(300,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new SliberEx();

	}

}
