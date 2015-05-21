package Sale;

import java.awt.event.ActionEvent;

import Panel.ResultTable_Panel;

public class Sale_Panel_6_2_2 extends ResultTable_Panel {
	String[] btn_name = {"수정", "삭제", "환불", "리셋", "상세"};
	String subject = "검색 결과";

	public Sale_Panel_6_2_2() {

		base_top_visible(true, subject);
		
		try {
		DB_Connect();
		DB_Select("user_info", "");
		}
		catch(Exception e) {
			System.out.println("예외1");
		}
		finally {
			try {
				con.close();
			}
			catch(Exception e) {
				System.out.println("예외2");
			}
		}
//		table.setFont(new Font("맑은 고딕", 0, 15));
		add("Center", scrollpane);
		
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
