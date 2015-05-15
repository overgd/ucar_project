package Window;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Base_Window_Bottom extends JPanel {

	JButton[] btns;
	JPanel[] null_panel, btns_panel;
	Base_Window_Bottom_Dao bottom_dao;
	
	public Base_Window_Bottom(String[] btn_name) {
	
		setLayout(new FlowLayout(FlowLayout.RIGHT)); // 그리드 레이아웃
		
		bottom_dao = new Base_Window_Bottom_Dao();
		
		button_create(btn_name.length);
		
		button_insert_name(btn_name);
		
		button_add(btn_name.length);
		
		setVisible(true);
		
	}
	
	public void button_create(int btn_num) {
		
		btns = new JButton[btn_num]; // 버튼 갯수
		btns_panel = new JPanel[btns.length]; // 버튼 패널
		null_panel = new JPanel[btns.length]; // 여백 패널
		
		/*버튼 생성*/
		for(int i = 0; i < null_panel.length; i++) {
			null_panel[i] = new JPanel();
			null_panel[i].setPreferredSize(new Dimension(50, 150));
		
			btns[i] = new JButton();
			btns[i].setPreferredSize(new Dimension(100, 40));
			
			btns_panel[i] = new JPanel();
		}
		
		bottom_dao.setBottom_btn(btns);
		
	}
	
	public void button_add(int btn_num){
				
		/*버튼 추가*/
		for(int i = 0; i < btns.length; i++) {

			add(btns_panel[i]);
			add(null_panel[i]);
			
		}
	
	}
	
	public void button_insert_name(String[] btn_name) {
		
		for(int i = 0; i < btns.length; i++) {
			btns[i].setText(btn_name[i]);
			btns_panel[i].add(btns[i]);
		}
		
	}

}
