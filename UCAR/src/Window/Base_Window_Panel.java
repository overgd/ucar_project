package Window;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Base_Window_Panel extends JPanel implements ActionListener {

	Base_Window_Top base_top;
	Base_Window_Center base_center;
	Base_Window_Bottom base_bottom;
	
	public JButton[] bottom_btn;
	public JButton backbtn;
	public JButton homebtn;
	
	String subject;
	public String[] btn_name;
	
	CardLayout baselayout;
	
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
			base_top = new Base_Window_Top(subject); //ž ������ �г�
			add("North", base_top);
			backbtn = base_top.top_dao.getBackbtn();
			homebtn = base_top.top_dao.getHomebtn();
		}
	}
	
	public void base_top_visible(boolean visible) {
		if(visible) {
			base_top = new Base_Window_Top("");
			add("North", base_top);
			backbtn = base_top.top_dao.getBackbtn();
			homebtn = base_top.top_dao.getHomebtn();
		}
	}
	
	public void base_center_visible(boolean visible, ImageIcon img_icon1, ImageIcon img_icon2) {
		if(visible) {
			base_center = new Base_Window_Center(img_icon1, img_icon2);
			add("Center", base_center);
		}
	}
	
	public void base_center_visible(boolean visible, String[] search_name, String[] search_list_name) {
		if(visible) {
			base_center = new Base_Window_Center(search_name, search_list_name);
			add("Center", base_center);
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
			
			base_bottom = new Base_Window_Bottom(btn_name); //���� ������ �г�
			add("South", base_bottom);
			bottom_btn = base_bottom.bottom_dao.getBottom_btn();
		}
	}	
	
	public void base_bottom_visible(boolean visible) {
		
		if(visible) {
			base_bottom = new Base_Window_Bottom(null); //���� ������ �г�
			add("South", base_bottom);
			bottom_btn = base_bottom.bottom_dao.getBottom_btn();
		}
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		
		
	}

}