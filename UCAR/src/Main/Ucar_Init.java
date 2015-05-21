package Main;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;

import Car.Car_Panel_0;
import Car.Car_Panel_1_1;
import Car.Car_Panel_1_2;
import Car.Car_Panel_1_2_1;
import Car.Car_Panel_1_2_2;
import Car.Car_Panel_1_2_3;
import Car.Car_Panel_2_1;
import Car.Car_Panel_2_2;
import Deal.Deal_Panel_0;
import Deal.Deal_Panel_1_0;
import Deal.Deal_Panel_1_1;
import Deal.Deal_Panel_1_2;
import Deal.Deal_Panel_1_4;
import Deal.Deal_Panel_2_0;
import Deal.Deal_Panel_2_1;
import Deal.Deal_Panel_2_2;
import Deal.Deal_Panel_2_4;
import Panel.Detail_Panel;
import Panel.Home_Panel;
import Panel.Insert_Panel;
import Panel.ResultTable_Panel;
import Panel.Search_Panel;
import Panel.Third_Panel;
import Panel.TopAndBottom_Panel;
import Panel.TwoButton_Panel;
import Sale.Sale_Panel_0;
import Sale.Sale_Panel_6_0;
import User.User_Panel_0;
import Window.Base_Window;

public class Ucar_Init extends Base_Window {
	
	Home_Panel home_panel;
	
	Detail_Panel[] detail_panel = null;
	Insert_Panel[] insert_panel = null;
	ResultTable_Panel[] result_panel = null;
	Search_Panel[] search_panel = null;
	TwoButton_Panel[] twobtn_panel = null;
	TopAndBottom_Panel[] tandb_panel = null;
	
	Insert_Panel test_panel = null;
	
	String[] input_data;
	
	int location_id;
	
	int index_car = 0;
	int index_user = 0;
	int index_sale = 0;
	int index_deal = 0;

	public Ucar_Init(String title) {
		
		super(title);
	
		home_panel();
		
		add(slide);
		
		layout.show(slide, "home");
		
	}
	
	public void home_panel() {
		
		home_panel = new Home_Panel();

		home_panel.car_btn.addActionListener(this);
		home_panel.user_btn.addActionListener(this);
		home_panel.deal_btn.addActionListener(this);
		home_panel.sale_btn.addActionListener(this);
		
		slide.add(home_panel, "home");
	
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public void detail_panel_add(JButton btn) {
		
		if(btn == home_panel.car_btn) {
			detail_panel = new Detail_Panel[1];
			detail_panel[0] = new Car_Panel_1_2_1(input_data);
			
			for(int i = 0; i < detail_panel.length; i++) {
				detail_panel[i].backbtn.addActionListener(this);
				detail_panel[i].homebtn.addActionListener(this);
				for(int c = 0; c < detail_panel[i].btn_num; c++){
					detail_panel[i].bottom_btn[c].addActionListener(this);
				}
				slide.add(detail_panel[i], "car_detail_"+i);
			}
		}
		
	}
	
	
	public void insert_panel_add(JButton btn) {//////////////////////등록, 수정 패널
		
		if(btn == home_panel.car_btn) {///////////////////////////차
			insert_panel = new Insert_Panel[2];
			insert_panel[0] = new Car_Panel_1_2_2();
			insert_panel[1] = new Car_Panel_1_2_3();
			
			for(int i = 0; i < insert_panel.length; i++) {
				insert_panel[i].backbtn.addActionListener(this);
				insert_panel[i].homebtn.addActionListener(this);
				for(int c = 0; c < insert_panel[i].btn_num; c++){
					insert_panel[i].bottom_btn[c].addActionListener(this);
				}
				slide.add(insert_panel[i], "car_insert_"+i);
			}
		}
		
	}
	
	public void result_panel_add(JButton btn) {/////////////////////////결과 패널 추가
		
		if(btn == home_panel.car_btn) { ///////////////////////////차
			result_panel = new ResultTable_Panel[2];
			if(input_data[0] != null){
				result_panel[0] = new Car_Panel_1_2("car_info", "and c_type = '"+input_data[0]+"' and c_brand = '"+input_data[1]+"' and c_name = '"+input_data[2]+"'"); //자동차 검색
				result_panel[1] = new Car_Panel_2_2("usedcar_info", "and uc_c_id = (select c_id from car_info where 1=1 and c_type = '"+input_data[0]+"' and c_brand = '"+input_data[1]+"' and c_name = '"+input_data[2]+"')"); //중고차 차종 검색
			}
			else{
				result_panel[0] = new Car_Panel_1_2("car_info", " "); //자동차 검색
				result_panel[1] = new Car_Panel_2_2("usedcar_info", " "); //중고차 차종 검색
			}
			
			for(int i = 0; i < result_panel.length; i++) {
				result_panel[i].backbtn.addActionListener(this);
				result_panel[i].homebtn.addActionListener(this);
				for(int c = 0; c < result_panel[i].btn_num; c++){
					result_panel[i].bottom_btn[c].addActionListener(this);
				}
				result_panel[i].table.addMouseListener(this);
				slide.add(result_panel[i], "car_result_"+i);
			}
			
		}
		
		if(btn == home_panel.deal_btn) { ///////////////////////////매매
			result_panel = new ResultTable_Panel[4];
			result_panel[0] = new Deal_Panel_1_4("car_info", "and c_type = '"+input_data[0]+"' and c_brand = '"+input_data[1]+"' and c_name = '"+input_data[2]+"'"); //자동차 검색
			result_panel[1] = new Deal_Panel_2_4("usedcar_info", "and uc_c_id = (select c_id from car_info where 1=1 and c_type = '"+input_data[0]+"' and c_brand = '"+input_data[1]+"' and c_name = '"+input_data[2]+"')"); //중고차 차종 검색
			result_panel[2] = new Deal_Panel_1_4("car_info", ""); ///차종 전체 검색 결과
			result_panel[3] = new Deal_Panel_2_4("usedcar_info", "");  ///중고차 전체 검색 결과
			
			for(int i = 0; i < result_panel.length; i++) {
				result_panel[i].backbtn.addActionListener(this);
				result_panel[i].homebtn.addActionListener(this);
				for(int c = 0; c < result_panel[i].btn_num; c++){
					result_panel[i].bottom_btn[c].addActionListener(this);
				}
				result_panel[i].table.addMouseListener(this);
				slide.add(result_panel[i], "deal_result_"+i);
			}
			
		}
		
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public void search_panel_add(JButton btn) {//////////////////////////조회 판넬 추가
		
		if(btn == home_panel.car_btn) {/////////////////////////////차
			search_panel = new Search_Panel[2];
			search_panel[0] = new Car_Panel_1_1();///////////////////////////자동차 정보 검색	
			search_panel[1] = new Car_Panel_2_1();/////////////////////////중고차 검색
			
			for(int i = 0; i < search_panel.length; i++) {
				
				search_panel[i].backbtn.addActionListener(this);
				search_panel[i].homebtn.addActionListener(this);
				search_panel[i].base_center.search_list[0].addListSelectionListener(this);
				
				if(search_panel[i].btn_num > 0) {
					search_panel[i].bottom_btn[search_panel[i].btn_num-1].addActionListener(this);
				}
				
				slide.add(search_panel[i],"car_search_"+ i);
				
			}
		}
		
		else if(btn == home_panel.deal_btn) {///////////////////////////매매
			search_panel = new Search_Panel[2];
			search_panel[0] = new Deal_Panel_1_2();///////////////////////////차종 빠른 검색
			search_panel[1] = new Deal_Panel_2_2();///////////////////////////중고차 빠른 검색
			
			for(int i = 0; i < search_panel.length; i++) {
				
				search_panel[i].backbtn.addActionListener(this);
				search_panel[i].homebtn.addActionListener(this);
				search_panel[i].base_center.search_list[0].addListSelectionListener(this);
				
				if(search_panel[i].btn_num > 0) {
					search_panel[i].bottom_btn[search_panel[i].btn_num-1].addActionListener(this);
				}
				
				slide.add(search_panel[i],"deal_search_"+ i);
			
			}
		}
		
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public void twobtn_panel_add(JButton btn) {//////////////////////투버튼 판넬 추가
		
		if(btn == home_panel.car_btn) {/////////////////////////////차
			
			twobtn_panel = new TwoButton_Panel[1];
			twobtn_panel[0] = new Car_Panel_0();
			
			for(int i = 0; i < twobtn_panel.length; i++) {
				
				twobtn_panel[i].backbtn.addActionListener(this);
				twobtn_panel[i].homebtn.addActionListener(this);
				
				if(twobtn_panel[i].btn_num > 0) {
					twobtn_panel[i].bottom_btn[twobtn_panel[i].btn_num-1].addActionListener(this);
				}
				
				twobtn_panel[i].base_center.btn[0].addActionListener(this);
				twobtn_panel[i].base_center.btn[1].addActionListener(this);
				
				slide.add(twobtn_panel[i], "car_"+String.valueOf(index_car));
				index_car++;
			}
			
		}
		
		else if(btn == home_panel.user_btn) {///////////////////////////유저
			
			twobtn_panel = new TwoButton_Panel[1];
			twobtn_panel[0] = new User_Panel_0();
			
			for(int i = 0; i < twobtn_panel.length; i++) {
				
				twobtn_panel[i].backbtn.addActionListener(this);
				twobtn_panel[i].homebtn.addActionListener(this);
				
				if(twobtn_panel[i].btn_num > 0) {
					twobtn_panel[i].bottom_btn[twobtn_panel[i].btn_num-1].addActionListener(this);
				}
				
				slide.add(twobtn_panel[i], "user_"+String.valueOf(index_user));
				index_user++;
			}
			
		}
		
		else if(btn == home_panel.sale_btn) {////////////////////////////매출
			
			tandb_panel = new TopAndBottom_Panel[2];
			tandb_panel[0] = new Sale_Panel_0();

			for(int i = 0; i < tandb_panel.length; i++) {
				
				tandb_panel[i].backbtn.addActionListener(this);
				tandb_panel[i].homebtn.addActionListener(this);
		
				tandb_panel[i].gross_sales_btn.addActionListener(this);
				tandb_panel[i].detailed_search_btn.addActionListener(this);
				tandb_panel[i].monthly_search_btn.addActionListener(this);
				tandb_panel[i].sales_registration_btn.addActionListener(this);
				tandb_panel[i].search_ilbyeol_btn.addActionListener(this);
				tandb_panel[i].year_search_btn.addActionListener(this);
				
				slide.add(tandb_panel[i], "sale_"+String.valueOf(index_sale));
				index_sale++;
			}
			
			twobtn_panel = new TwoButton_Panel[1];
			twobtn_panel[0] = new Sale_Panel_6_0();
			
			for(int i = 0; i < twobtn_panel.length; i++) {
				
				twobtn_panel[i].backbtn.addActionListener(this);
				twobtn_panel[i].homebtn.addActionListener(this);
				
				if(twobtn_panel[i].btn_num > 0) {
					twobtn_panel[i].bottom_btn[twobtn_panel[i].btn_num-1].addActionListener(this);
				}
				
				slide.add(twobtn_panel[i], "sale_"+String.valueOf(index_sale));
				index_sale++;
			}
			
		}
		
		else if(btn == home_panel.deal_btn) {////////////////////////////매매
			
			twobtn_panel = new TwoButton_Panel[5];
			twobtn_panel[0] = new Deal_Panel_0();
			twobtn_panel[1] = new Deal_Panel_1_0(); ///////////////////////////매입
			twobtn_panel[2] = new Deal_Panel_1_1(); ///////////////////////////차종검색
			twobtn_panel[3] = new Deal_Panel_2_0(); ///////////////////////////판매
			twobtn_panel[4] = new Deal_Panel_2_1(); ///////////////////////////중고차검색
			
			for(int i = 0; i < twobtn_panel.length; i++) {
				
				twobtn_panel[i].backbtn.addActionListener(this);
				twobtn_panel[i].homebtn.addActionListener(this);
				
				if(twobtn_panel[i].btn_num > 0) {
					twobtn_panel[i].bottom_btn[twobtn_panel[i].btn_num-1].addActionListener(this);
				}
				
				twobtn_panel[i].base_center.btn[0].addActionListener(this);
				twobtn_panel[i].base_center.btn[1].addActionListener(this);
				
				slide.add(twobtn_panel[i], "deal_"+String.valueOf(index_deal));
				index_deal++;
			}
			
		}
		
		
	}
	
	public void test_add() {
		test_panel = new Third_Panel();
		
			test_panel.backbtn.addActionListener(this);
			test_panel.homebtn.addActionListener(this);
//			test_panel.base_center.search_list[0].addListSelectionListener(this);
			
//			if(test_panel.btn_num > 0) {
//				test_panel.bottom_btn[test_panel.btn_num-1].addActionListener(this);
//			}
			
			slide.add(test_panel, "test");		
		
	}
	
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		super.valueChanged(e);
	}

	@Override
	public void base_setting(boolean check) {
		
		super.base_setting(check);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		super.mouseClicked(e);
		
		int row = result_panel[0].table.getSelectedRow(); //마우스로 클릭한 행
		int column = result_panel[0].table.getSelectedColumn(); //마우스로 클릭한 열
		
		input_data = new String[result_panel[0].table.getColumnCount()];

		for(int i = 0; i < result_panel[0].table.getColumnCount() ;i++){
			
			try {
				input_data[i] = (String) result_panel[0].table.getValueAt(0, i);
			}
			catch(ClassCastException ce){
				input_data[i] = result_panel[0].table.getValueAt(0, i).toString();
			}
			
		}
				
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		super.mouseEntered(e);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		super.mouseExited(e);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		super.mousePressed(e);
	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		super.mouseReleased(e);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		super.actionPerformed(e);
		
		JButton btn = (JButton)e.getSource();
		
/*************************************홈버튼***********************************************/
		if(btn == home_panel.car_btn) { ///차 버튼
			
			twobtn_panel_add(home_panel.car_btn);
			
			this.layout.show(slide, "car_0");
			location_id = 1;
		}
		
		if(btn == home_panel.user_btn) { ///회원 버튼
			
//			test_add();
//			this.layout.show(slide, "test");
			
			twobtn_panel_add(home_panel.user_btn);
			
			this.layout.show(slide, "user_0");
			location_id = 2;
		}
		
		if(btn == home_panel.deal_btn) { ///매매 버튼
			
			twobtn_panel_add(home_panel.deal_btn);
			
			this.layout.show(slide, "deal_0");
			location_id = 3;
		}
		
		if(btn == home_panel.sale_btn) { ///매출 버튼
			
			twobtn_panel_add(home_panel.sale_btn);
			
			this.layout.show(slide, "sale_0");
			location_id = 4;
		}
/********************************************************************************************/
		
		if(search_panel != null){ //////////////////////////조회패널이 존재하면
			
			for(int c = 0; c < search_panel.length; c++){
				if(btn == search_panel[c].bottom_btn[0]) { ///+조회창 확인 버튼
					input_data = new String[3];
					for(int i = 0; i < input_data.length; i++){
						input_data[i] = search_panel[c].selection[i];
//						System.out.println(search_panel[c].selection[i]);
					}
				}
			}
			
			if(location_id == 1) {///////////////////////차
				for(int i = 0; i < search_panel.length; i++) {
					if(btn == search_panel[i].bottom_btn[0]) {
						try {		
							result_panel_add(home_panel.car_btn);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						layout.show(slide, "car_result_"+i); //////////////자동차 검색 결과
					}
				}
			}
			
			else if(location_id == 3) {///////////////////////매매
				for(int i = 0; i < search_panel.length; i++) {
					if(btn == search_panel[i].bottom_btn[0]) {
						try {		
							result_panel_add(home_panel.deal_btn);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						layout.show(slide, "deal_result_"+i); //////////////자동차 검색 결과
					}
				}
			}
			
			for(int i = 0; i < search_panel.length; i++) { ////////// 백 홈
				
				if(btn == search_panel[i].backbtn) {
					search_panel[i].setVisible(false);
					System.out.println("백버튼");
				}
				if(btn == search_panel[i].homebtn) {
					layout.show(slide, "home");
					System.out.println("홈버튼");
				}
	
				for(int c = 0; c < search_panel[i].btn_num; c++) {
					if(btn == search_panel[i].bottom_btn[c]) {
						System.out.println(c+"버튼");
					}
				}
				
			}/////////////////백 홈
		}
		
		if(twobtn_panel != null){//////////////////투버튼
			
			for(int i = 0; i < twobtn_panel.length; i++) { ////////// 백 홈
				
				if(btn == twobtn_panel[i].backbtn) {
//					layout.previous(slide);
					twobtn_panel[i].setVisible(false);
					System.out.println("백버튼");
				}
				if(btn == twobtn_panel[i].homebtn) {
					
					layout.show(slide, "home");
					System.out.println("홈버튼");
					break;
				}
				
				for(int c = 0; c < twobtn_panel[i].btn_num; c++) {
					if(btn == twobtn_panel[i].bottom_btn[c]) {
						System.out.println(c+"버튼");
					}
				}
				
			}/////////////////백 홈
		}
		
		if(tandb_panel != null){ //////////////탑앤바텀
			
			for(int i = 0; i < tandb_panel.length; i++) { ////////// 백 홈
				
				if(btn == tandb_panel[i].backbtn) {
//					layout.previous(slide);
					tandb_panel[i].setVisible(false);
					System.out.println("백버튼");
				}
				if(btn == tandb_panel[i].homebtn) {
					layout.show(slide, "home");
					System.out.println("홈버튼");
					
				}
	
				for(int c = 0; c < tandb_panel[i].btn_num; c++) {
					if(btn == tandb_panel[i].bottom_btn[c]) {
						System.out.println(c+"버튼");
					}
				}
				
			}/////////////////백 홈
		}
		
		if(result_panel != null){ //////////////결과패널
			
			for(int i = 0; i < result_panel.length; i++) { ////////// 백 홈
							
				if(btn == result_panel[i].backbtn) {
//					layout.previous(slide);
					result_panel[i].setVisible(false);
					System.out.println("백버튼");
				}
				if(btn == result_panel[i].homebtn) {
					layout.show(slide, "home");
					System.out.println("홈버튼");
				}
				for(int c = 0; c < result_panel[i].bottom_btn.length; c++) {
					if(btn == result_panel[i].bottom_btn[c]) {
						System.out.println(c+"버튼");
					}
				}
				
			}/////////////////백 홈
		}
		
		if(insert_panel != null){ //////////////결과패널
			
			for(int i = 0; i < insert_panel.length; i++) { ////////// 백 홈
							
				if(btn == insert_panel[i].backbtn) {
//					layout.previous(slide);
					insert_panel[i].setVisible(false);
					System.out.println("백버튼");
				}
				if(btn == insert_panel[i].homebtn) {
					layout.show(slide, "home");
					System.out.println("홈버튼");
				}
				for(int c = 0; c < insert_panel[i].bottom_btn.length; c++) {
					if(btn == insert_panel[i].bottom_btn[c]) {
						System.out.println(c+"버튼");
					}
				}
				
			}/////////////////백 홈
		}
/////////////////////////////////////////차///////////////////////////////////////////
		if(location_id == 1) {
			
			if(btn == twobtn_panel[0].base_center.btn[0]) {
				search_panel_add(home_panel.car_btn);
				layout.show(slide, "car_search_0"); ////자동차 정보 검색
			}
			
			if(btn == twobtn_panel[0].base_center.btn[1]) {
				search_panel_add(home_panel.car_btn);
				layout.show(slide, "car_search_1"); ////중고차 정보 검색
			}
			
			if(result_panel != null){
				if(btn == result_panel[0].bottom_btn[0]) {
					detail_panel_add(home_panel.car_btn);
					layout.show(slide, "car_detail_0");
				}
				if(btn == result_panel[0].bottom_btn[1]) {
					insert_panel_add(home_panel.car_btn);
					layout.show(slide, "car_insert_0");
				}
				if(btn == result_panel[0].bottom_btn[2]) {
					insert_panel_add(home_panel.car_btn);
					layout.show(slide, "car_insert_1");
				}
				if(btn == result_panel[0].bottom_btn[3]) {
						try {
							result_panel[0].DB_Connect();
							result_panel[0].DB_Delete("car_info", input_data);
						} catch (SQLException e1) {
							e1.printStackTrace();
						} 
						finally {
							layout.show(slide, "car_result_0");
						}
				}
			}
			
			if(insert_panel != null) {
				if(btn == insert_panel[0].bottom_btn[0]) {
					String[] insert_val = new String[insert_panel[0].input_text.length];
					
					for(int i = 0; i < insert_val.length; i++){
						insert_val[i] = insert_panel[0].input_text[i].getText();
					}
					insert_panel[0].DB_Connect();
					insert_panel[0].DB_insert("car_info", insert_val);
					layout.show(slide, "car_result_0");
				}
			}
		
		}

///////////////////////////////////////유저///////////////////////////////////////////
		
		
		
////////////////////////////////////////매매//////////////////////////////////////////
		if(location_id == 3) {
			if(btn == twobtn_panel[0].base_center.btn[0]) {
				layout.show(slide, "deal_1"); ////매입
			}
			if(btn == twobtn_panel[0].base_center.btn[1]) {
				layout.show(slide, "deal_3"); ////판매
			}
			if(btn == twobtn_panel[1].base_center.btn[0]) {
				layout.show(slide, "deal_2"); ////차종 검색
			}
			if(btn == twobtn_panel[3].base_center.btn[0]) {
				layout.show(slide, "deal_4"); /////중고차 검색
			}
			if(btn == twobtn_panel[2].base_center.btn[0]) {
				search_panel_add(home_panel.deal_btn);
				layout.show(slide, "deal_search_0"); ////차종 빠른 검색
			}
			if(btn == twobtn_panel[4].base_center.btn[0]) {
				search_panel_add(home_panel.deal_btn);
				layout.show(slide, "deal_search_1"); ////중고차 빠른 검색
			}
		}
		
////////////////////////////////////////매출/////////////////////////////////////////
		if(location_id == 4) {
			if(btn == tandb_panel[0].detailed_search_btn) {
				layout.show(slide, "sale_1");
			}
		}

		
	}
}
