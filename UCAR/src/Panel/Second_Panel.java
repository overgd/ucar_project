package Panel;

import java.awt.event.ActionEvent;

import Window.Base_Window_Panel;

public class Second_Panel extends TopAndBottom_Panel {
	
	String[] btn_name = {"안녕", "취소"};
	String subject = "두번째";
	
	
	public Second_Panel() {
		
		btn_num = btn_name.length;
		
		base_top_visible(true, subject);
		base_bottom_visible(true, btn_name);
		
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
