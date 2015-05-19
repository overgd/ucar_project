package Car;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

import Panel.TwoButton_Panel;
import Window.Base_Window_Panel;
import Window.ButtonImage;

public class Test_Panel extends TwoButton_Panel {
	
	String subject = "È¸¿ø";
	
	JPanel Sale_Panel_0;
	
	JPanel user_searchlong_btn_panel, user_rgrlong_btn_panel;
	
	public JButton user_searchlong_btn, user_rgrlong_btn;

	ButtonImage img;
	
	public Test_Panel() {
		
		super();
		
		img  = new ButtonImage();
		
		base_top_visible(true, subject);
		
		base_center_visible(true, img.usersearchlong_img_1, img.userrgrlong_img_1);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		super.actionPerformed(e);
		
	}

	@Override
	public String subject(String subject) {
		// TODO Auto-generated method stub
		return super.subject(subject);
	}

	@Override
	public void base_top_visible(boolean visible, String subject) {
		// TODO Auto-generated method stub
		super.base_top_visible(visible, subject);
	}

	@Override
	public void base_bottom_visible(boolean visible, String[] btn_name) {
		// TODO Auto-generated method stub
		super.base_bottom_visible(visible, btn_name);
	}
	
}
