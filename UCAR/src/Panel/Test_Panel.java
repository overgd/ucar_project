package Panel;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import Window.ButtonImage;

public class Test_Panel extends TwoButton_Panel {
	
	public String[] btn_name = {"등록", "취소"};
	String subject = "차";
	
	ButtonImage img;
	
	public Test_Panel() {
		
		super();
		
		img  = new ButtonImage();
		
		base_top_visible(true, subject);
		
		base_center_visible(true, img.back_img, img.home_img);
		
		base_bottom_visible(true, btn_name);
		
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
	public void base_top_visible(boolean visible) {
		// TODO Auto-generated method stub
		super.base_top_visible(visible);
	}

	@Override
	public void base_center_visible(boolean visible, ImageIcon img_icon1,
			ImageIcon img_icon2) {
		// TODO Auto-generated method stub
		super.base_center_visible(visible, img_icon1, img_icon2);
	}

	@Override
	public void base_center_visible(boolean visible, String[] search_name,
			String[] search_list_name) {
		// TODO Auto-generated method stub
		super.base_center_visible(visible, search_name, search_list_name);
	}

	@Override
	public void base_center_visible(boolean visible) {
		// TODO Auto-generated method stub
		super.base_center_visible(visible);
	}

	@Override
	public void base_bottom_visible(boolean visible, String[] btn_name) {
		// TODO Auto-generated method stub
		super.base_bottom_visible(visible, btn_name);
	}

	@Override
	public void base_bottom_visible(boolean visible) {
		// TODO Auto-generated method stub
		super.base_bottom_visible(visible);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		super.actionPerformed(e);
	}

	
	
}
