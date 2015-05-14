package Window;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Base_Window_Bottom extends JPanel {

	JButton[] btns;
	JPanel[] null_panel, btns_panel;
	
	public Base_Window_Bottom() {
		
		super();
		
		btns = new JButton[7]; // 버튼
		btns_panel = new JPanel[7]; // 버튼 개개인 패널
		null_panel = new JPanel[7]; // 여백 패널
		
		
		for(int i = 0; i < btns.length; i++) {
			
			btns[i] = new JButton("하나");
			
			btns[i].setPreferredSize(new Dimension(100, 50));
			
			btns_panel[i] = new JPanel();
			
			btns_panel[i].add(btns[i]);
		
			add(btns_panel[i]);
			
		}
		
		
		for(int i = 0; i < btns.length; i++) { // 아래 여백 생성
			null_panel[i] = new JPanel();
			add(null_panel[i]);
		}
		
		setLayout(new GridLayout(0, 7)); // 그리드 레이아웃
		
		setVisible(true);
		
	}

}
