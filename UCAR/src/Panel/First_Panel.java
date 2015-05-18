package Panel;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import Window.ButtonImage;

public class First_Panel extends Search_Panel {

	String[] search_list_name = {"아우디", "놀래미", "학"};
	String[] search_name = {"차  종", "브랜드", "모델명"};
	String[] btn_name = {"확인"};
	
	public String subject = "첫번째";
	
	public First_Panel() {
		
		super();

		btn_num = btn_name.length;
		
		DB_Connect();
		DB_Select();
		
		base_top_visible(true, "조회");
		base_center_visible(true, search_name, search_list_name);
		base_bottom_visible(true, btn_name);
		
	}
	
	
	@Override
	public void DB_Connect() {
		// TODO Auto-generated method stub
		super.DB_Connect();
	}
	
	@Override
	public void base_top_visible(boolean visible) {
		// TODO Auto-generated method stub
		super.base_top_visible(visible);
	}

	@Override
	public void base_bottom_visible(boolean visible) {
		// TODO Auto-generated method stub
		super.base_bottom_visible(visible);
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		super.actionPerformed(e);
	}
	
	
}
