package Car;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.event.ListSelectionEvent;

import Panel.Insert_Panel;

public class Car_Panel_1_2_2 extends Insert_Panel {

	public String subject = "자동차 정보 수정";
	public String[] label_name = {"차   종 ", "브랜드 ", "모델명 ", "연   식 ", "연   료", "배기량", "연   비", "출고가", "기준가"}; 
	public String[] btn_name = {"등록", "취소"};
	
	public Car_Panel_1_2_2() {
		
		super();
		
		btn_num = btn_name.length;
		
		base_top_visible(true, subject);
		insert_form_add(label_name);
		base_bottom_visible(true, btn_name);
	
	}

	@Override
	public void insert_form_add(String[] label_name) {
		// TODO Auto-generated method stub
		super.insert_form_add(label_name);
	}

	@Override
	public String subject(String subject) {
		// TODO Auto-generated method stub
		return super.subject(subject);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		super.valueChanged(e);
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
