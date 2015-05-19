package Window;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import DB.DB_Conn;

public class Base_Window_Panel extends JPanel implements ActionListener, ListSelectionListener {

	public Base_Window_Top base_top;
	public Base_Window_Center base_center;
	public Base_Window_Bottom base_bottom;
	
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
	
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void base_top_visible(boolean visible, String subject) {
		if(visible) {
			base_top = new Base_Window_Top(subject); //탑 윈도우 패널
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
		else if(!visible) {
			base_center.setVisible(false);
		}
	}
	
	public void base_center_visible(boolean visible, String[] search_name, String[] list_val1, String[] list_val2, String[] list_val3) {
		if(visible) {
			base_center = new Base_Window_Center(search_name, list_val1, list_val2, list_val3);
			add("Center", base_center);
		}
	}
	
	public void base_center_visible(boolean visible, String[] search_name) {
		if(visible) {
			
			String[] list_val = {""};
			
			base_center = new Base_Window_Center(search_name, list_val, list_val, list_val);
			add("Center", base_center);			
		}
	}
	
	public void base_center_visible(boolean visible) {
		if(visible) {
			base_center = new Base_Window_Center();
			add("Center", base_center);
		}
		else if(!visible) {
			base_center.setVisible(false);
		}
	}
	public void base_bottom_visible(boolean visible, String[] btn_name) {
		
		if(visible) {
			
			base_bottom = new Base_Window_Bottom(btn_name); //바텀 윈도우 패널
			add("South", base_bottom);
			bottom_btn = base_bottom.bottom_dao.getBottom_btn();
		}
	}	
	
	public void base_bottom_visible(boolean visible) {
		
		if(visible) {
			base_bottom = new Base_Window_Bottom(null); //바텀 윈도우 패널
			add("South", base_bottom);
			bottom_btn = base_bottom.bottom_dao.getBottom_btn();
		}
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		
		
	}

}
