package Panel;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.event.ListSelectionEvent;

import Window.ButtonImage;

public class First_Panel extends Search_Panel {

	String[] search_name = {"차  종", "브랜드", "모델명"};
	String[] btn_name = {"확인"};
	String where = "and car = 대형";
	
	public String subject = "첫번째";
	
	public First_Panel() {
		
		super();

		btn_num = btn_name.length;
		
		base_top_visible(true, "조회");
		base_center_visible(true, search_name);
		base_bottom_visible(true, btn_name);
		
		base_center.search_list[0].addListSelectionListener(this);
//		base_center.search_list[1].addListSelectionListener(this);
//		base_center.search_list[2].addListSelectionListener(this);
		
	}
	
	
	@Override
	public void DB_Select(String where) {
		// TODO Auto-generated method stub
		super.DB_Select(where);
	}


	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		super.valueChanged(e);	

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
	public void base_center_visible(boolean visible, String[] search_name) {
		// TODO Auto-generated method stub
		super.base_center_visible(visible, search_name);
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
