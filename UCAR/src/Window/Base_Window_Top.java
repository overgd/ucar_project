package Window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Base_Window_Top extends JPanel { //기본 윈도우 탑

	JButton backbtn, homebtn; // 백 버튼, 홈 버튼
	
	public Base_Window_Top() {
		
		setLayout(new BorderLayout()); //보더 레이아웃
		
		
		/*버튼 생성*/
		backbtn = new JButton("뒤로가기"); // 백 버튼
		
		homebtn = new JButton("홈"); // 홈 버튼
		
		
		/*버튼추가*/
		add("West", backbtn); 
		add("East", homebtn);
		
		setVisible(true);
	}
	
}
