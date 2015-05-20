package Deal;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;

import Panel.Search_Panel;
import Window.Base_Window_Center;

public class Deal_Panel_2_2 extends Search_Panel {

	String[] search_name = {"차  종", "브랜드", "모델명"};
	public String[] btn_name = {"검색"};
	String where = " ";
	
	public String subject = "첫번째";
	
	public Deal_Panel_2_2() {
		
		super();

		btn_num = btn_name.length;
		
		base_top_visible(true, "중고차 빠른 검색");
		
		base_center = new Base_Window_Center();
		base_center.setLayout(null);
		base_center.SearchList_Panel(search_name, 0, result_data_0);
		base_center.SearchList_Panel(search_name, 1, null_data);
		base_center.SearchList_Panel(search_name, 2, null_data);
		
		add(base_center);
		
		base_bottom_visible(true, btn_name);
		
		base_center.search_list[0].addListSelectionListener(this);
		base_center.search_list[1].addListSelectionListener(this);
		base_center.search_list[2].addListSelectionListener(this);
		
	}

	@Override
	public void DB_Select_0(int num) {
		// TODO Auto-generated method stub
		super.DB_Select_0(num);
	}

	@Override
	public void DB_Select_1(int num) {
		// TODO Auto-generated method stub
		super.DB_Select_1(num);
	}

	@Override
	public void DB_Select_2(int num) {
		// TODO Auto-generated method stub
		super.DB_Select_2(num);
	}

	@Override
	public void DB_Select(String column, String where) {
		// TODO Auto-generated method stub
		super.DB_Select(column, where);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		super.valueChanged(e);	
		JList mylist = (JList)e.getSource();
		
		if(mylist == base_center.search_list[0]){
			
				if( !base_center.search_list[0].getValueIsAdjusting()) { //똑같은 항목을 눌렀을 때 처리가 안되게
				
				selection[0] = (String)base_center.search_list[0].getSelectedValue();
				DB_Select("c_brand", "and c_type = '"+selection[0]+"'");
				DB_Select_1(0);
				
				base_center.search_panel[1].setVisible(false);
				base_center.SearchList_Panel(search_name, 1, result_data_1);
				base_center.search_list[1].addListSelectionListener(this);
				base_center.search_panel[1].setVisible(true);
				
				add(base_center);
				setVisible(true);
				
			}
		}
		
		if(mylist == base_center.search_list[1]){
			
				if( !base_center.search_list[1].getValueIsAdjusting()) { //똑같은 항목을 눌렀을 때 처리가 안되게
				
				selection[1] = (String)base_center.search_list[1].getSelectedValue();
				DB_Select("c_name", "and c_brand = '"+selection[1]+"'"+" and c_type = '"+selection[0]+"'");
				DB_Select_2(0);

				base_center.search_panel[2].setVisible(false);
				base_center.SearchList_Panel(search_name, 2, result_data_2);
				base_center.search_list[2].addListSelectionListener(this);
				base_center.search_panel[2].setVisible(true);
				
				add(base_center);
				setVisible(true);
				
			}
		}

			

		
		if( !base_center.search_list[2].getValueIsAdjusting()) { //똑같은 항목을 눌렀을 때 처리가 안되게
			
			selection[2] = (String)base_center.search_list[2].getSelectedValue();

		}
	
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
