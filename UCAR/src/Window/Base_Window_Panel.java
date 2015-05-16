package Window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Base_Window_Panel extends JPanel implements ActionListener {

	Base_Window_Top base_top;
	Base_Window_Center base_center;
	Base_Window_Bottom base_bottom;
	
	JButton[] bottom_btn;
	protected JButton backbtn;
	JButton homebtn;
	
	String subject;
	
	public Base_Window_Panel() {
		
		super();
		
		setLayout(new BorderLayout());
		
		setBackground(Color.WHITE);
		setVisible(true);
	
	}
	
	public String subject(String subject) {
		
		return subject;
	}
	
	public void base_top_visible(boolean visible, String subject) {
		if(visible) {
			base_top = new Base_Window_Top(subject); //탑 윈도우 패널
			add("North", base_top);
			backbtn = base_top.top_dao.getBackbtn();
			backbtn.addActionListener(this);
			homebtn = base_top.top_dao.getHomebtn();
			homebtn.addActionListener(this);
		}
	}
	
	public void base_center_visible(boolean visible) {
		if(visible) {
			
			base_center = new Base_Window_Center();
			add("Center", base_center);
		}
	}
	
	public void base_bottom_visible(boolean visible, String[] btn_name) {
		
		if(visible) {
			
			base_bottom = new Base_Window_Bottom(btn_name); //바텀 윈도우 패널
			add("South", base_bottom);
			bottom_btn = base_bottom.bottom_dao.getBottom_btn();
			for(int i = 0; i < bottom_btn.length; i++) {
				bottom_btn[i].addActionListener(this);
			}
			
		}
		
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
