package Home;

import javax.swing.JButton;
import javax.swing.JLabel;

import Window.Base_Window;

public class Home_Window extends Base_Window {
	
	String[] btn_name = {"수정", "등록", "리셋"};
	
	public Home_Window(String title) {

		super(title);
		
		base_top_visible(true, "상세 조회");
		
		base_center_visible(true);
		
		base_bottom_visible(true, btn_name);

		base_setting(true);
		
	}
	
	@Override
	public void base_setting(boolean check) {
		// TODO Auto-generated method stub
		super.base_setting(check);
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
	public void base_center_visible(boolean visible) {
		// TODO Auto-generated method stub
		super.base_center_visible(visible);
	}

	@Override
	public void base_bottom_visible(boolean visible, String[] btn_name) {
		// TODO Auto-generated method stub
		super.base_bottom_visible(visible, btn_name);
	}
	
}
