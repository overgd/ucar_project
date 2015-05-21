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
	
	
	public void insert_panel_add(JButton btn) {//////////////////////���, ���� �г�
		
		if(btn == home_panel.car_btn) {///////////////////////////��
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
	
	public void result_panel_add(JButton btn) {/////////////////////////��� �г� �߰�
		
		if(btn == home_panel.car_btn) { ///////////////////////////��
			result_panel = new ResultTable_Panel[2];
			if(input_data[0] != null){
				result_panel[0] = new Car_Panel_1_2("car_info", "and c_type = '"+input_data[0]+"' and c_brand = '"+input_data[1]+"' and c_name = '"+input_data[2]+"'"); //�ڵ��� �˻�
				result_panel[1] = new Car_Panel_2_2("usedcar_info", "and uc_c_id = (select c_id from car_info where 1=1 and c_type = '"+input_data[0]+"' and c_brand = '"+input_data[1]+"' and c_name = '"+input_data[2]+"')"); //�߰��� ���� �˻�
			}
			else{
				result_panel[0] = new Car_Panel_1_2("car_info", " "); //�ڵ��� �˻�
				result_panel[1] = new Car_Panel_2_2("usedcar_info", " "); //�߰��� ���� �˻�
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
		
		if(btn == home_panel.deal_btn) { ///////////////////////////�Ÿ�
			result_panel = new ResultTable_Panel[4];
			result_panel[0] = new Deal_Panel_1_4("car_info", "and c_type = '"+input_data[0]+"' and c_brand = '"+input_data[1]+"' and c_name = '"+input_data[2]+"'"); //�ڵ��� �˻�
			result_panel[1] = new Deal_Panel_2_4("usedcar_info", "and uc_c_id = (select c_id from car_info where 1=1 and c_type = '"+input_data[0]+"' and c_brand = '"+input_data[1]+"' and c_name = '"+input_data[2]+"')"); //�߰��� ���� �˻�
			result_panel[2] = new Deal_Panel_1_4("car_info", ""); ///���� ��ü �˻� ���
			result_panel[3] = new Deal_Panel_2_4("usedcar_info", "");  ///�߰��� ��ü �˻� ���
			
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
	public void search_panel_add(JButton btn) {//////////////////////////��ȸ �ǳ� �߰�
		
		if(btn == home_panel.car_btn) {/////////////////////////////��
			search_panel = new Search_Panel[2];
			search_panel[0] = new Car_Panel_1_1();///////////////////////////�ڵ��� ���� �˻�	
			search_panel[1] = new Car_Panel_2_1();/////////////////////////�߰��� �˻�
			
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
		
		else if(btn == home_panel.deal_btn) {///////////////////////////�Ÿ�
			search_panel = new Search_Panel[2];
			search_panel[0] = new Deal_Panel_1_2();///////////////////////////���� ���� �˻�
			search_panel[1] = new Deal_Panel_2_2();///////////////////////////�߰��� ���� �˻�
			
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
	public void twobtn_panel_add(JButton btn) {//////////////////////����ư �ǳ� �߰�
		
		if(btn == home_panel.car_btn) {/////////////////////////////��
			
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
		
		else if(btn == home_panel.user_btn) {///////////////////////////����
			
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
		
		else if(btn == home_panel.sale_btn) {////////////////////////////����
			
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
		
		else if(btn == home_panel.deal_btn) {////////////////////////////�Ÿ�
			
			twobtn_panel = new TwoButton_Panel[5];
			twobtn_panel[0] = new Deal_Panel_0();
			twobtn_panel[1] = new Deal_Panel_1_0(); ///////////////////////////����
			twobtn_panel[2] = new Deal_Panel_1_1(); ///////////////////////////�����˻�
			twobtn_panel[3] = new Deal_Panel_2_0(); ///////////////////////////�Ǹ�
			twobtn_panel[4] = new Deal_Panel_2_1(); ///////////////////////////�߰����˻�
			
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
		
		int row = result_panel[0].table.getSelectedRow(); //���콺�� Ŭ���� ��
		int column = result_panel[0].table.getSelectedColumn(); //���콺�� Ŭ���� ��
		
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
		
/*************************************Ȩ��ư***********************************************/
		if(btn == home_panel.car_btn) { ///�� ��ư
			
			twobtn_panel_add(home_panel.car_btn);
			
			this.layout.show(slide, "car_0");
			location_id = 1;
		}
		
		if(btn == home_panel.user_btn) { ///ȸ�� ��ư
			
//			test_add();
//			this.layout.show(slide, "test");
			
			twobtn_panel_add(home_panel.user_btn);
			
			this.layout.show(slide, "user_0");
			location_id = 2;
		}
		
		if(btn == home_panel.deal_btn) { ///�Ÿ� ��ư
			
			twobtn_panel_add(home_panel.deal_btn);
			
			this.layout.show(slide, "deal_0");
			location_id = 3;
		}
		
		if(btn == home_panel.sale_btn) { ///���� ��ư
			
			twobtn_panel_add(home_panel.sale_btn);
			
			this.layout.show(slide, "sale_0");
			location_id = 4;
		}
/********************************************************************************************/
		
		if(search_panel != null){ //////////////////////////��ȸ�г��� �����ϸ�
			
			for(int c = 0; c < search_panel.length; c++){
				if(btn == search_panel[c].bottom_btn[0]) { ///+��ȸâ Ȯ�� ��ư
					input_data = new String[3];
					for(int i = 0; i < input_data.length; i++){
						input_data[i] = search_panel[c].selection[i];
//						System.out.println(search_panel[c].selection[i]);
					}
				}
			}
			
			if(location_id == 1) {///////////////////////��
				for(int i = 0; i < search_panel.length; i++) {
					if(btn == search_panel[i].bottom_btn[0]) {
						try {		
							result_panel_add(home_panel.car_btn);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						layout.show(slide, "car_result_"+i); //////////////�ڵ��� �˻� ���
					}
				}
			}
			
			else if(location_id == 3) {///////////////////////�Ÿ�
				for(int i = 0; i < search_panel.length; i++) {
					if(btn == search_panel[i].bottom_btn[0]) {
						try {		
							result_panel_add(home_panel.deal_btn);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
						layout.show(slide, "deal_result_"+i); //////////////�ڵ��� �˻� ���
					}
				}
			}
			
			for(int i = 0; i < search_panel.length; i++) { ////////// �� Ȩ
				
				if(btn == search_panel[i].backbtn) {
					search_panel[i].setVisible(false);
					System.out.println("���ư");
				}
				if(btn == search_panel[i].homebtn) {
					layout.show(slide, "home");
					System.out.println("Ȩ��ư");
				}
	
				for(int c = 0; c < search_panel[i].btn_num; c++) {
					if(btn == search_panel[i].bottom_btn[c]) {
						System.out.println(c+"��ư");
					}
				}
				
			}/////////////////�� Ȩ
		}
		
		if(twobtn_panel != null){//////////////////����ư
			
			for(int i = 0; i < twobtn_panel.length; i++) { ////////// �� Ȩ
				
				if(btn == twobtn_panel[i].backbtn) {
//					layout.previous(slide);
					twobtn_panel[i].setVisible(false);
					System.out.println("���ư");
				}
				if(btn == twobtn_panel[i].homebtn) {
					
					layout.show(slide, "home");
					System.out.println("Ȩ��ư");
					break;
				}
				
				for(int c = 0; c < twobtn_panel[i].btn_num; c++) {
					if(btn == twobtn_panel[i].bottom_btn[c]) {
						System.out.println(c+"��ư");
					}
				}
				
			}/////////////////�� Ȩ
		}
		
		if(tandb_panel != null){ //////////////ž�ع���
			
			for(int i = 0; i < tandb_panel.length; i++) { ////////// �� Ȩ
				
				if(btn == tandb_panel[i].backbtn) {
//					layout.previous(slide);
					tandb_panel[i].setVisible(false);
					System.out.println("���ư");
				}
				if(btn == tandb_panel[i].homebtn) {
					layout.show(slide, "home");
					System.out.println("Ȩ��ư");
					
				}
	
				for(int c = 0; c < tandb_panel[i].btn_num; c++) {
					if(btn == tandb_panel[i].bottom_btn[c]) {
						System.out.println(c+"��ư");
					}
				}
				
			}/////////////////�� Ȩ
		}
		
		if(result_panel != null){ //////////////����г�
			
			for(int i = 0; i < result_panel.length; i++) { ////////// �� Ȩ
							
				if(btn == result_panel[i].backbtn) {
//					layout.previous(slide);
					result_panel[i].setVisible(false);
					System.out.println("���ư");
				}
				if(btn == result_panel[i].homebtn) {
					layout.show(slide, "home");
					System.out.println("Ȩ��ư");
				}
				for(int c = 0; c < result_panel[i].bottom_btn.length; c++) {
					if(btn == result_panel[i].bottom_btn[c]) {
						System.out.println(c+"��ư");
					}
				}
				
			}/////////////////�� Ȩ
		}
		
		if(insert_panel != null){ //////////////����г�
			
			for(int i = 0; i < insert_panel.length; i++) { ////////// �� Ȩ
							
				if(btn == insert_panel[i].backbtn) {
//					layout.previous(slide);
					insert_panel[i].setVisible(false);
					System.out.println("���ư");
				}
				if(btn == insert_panel[i].homebtn) {
					layout.show(slide, "home");
					System.out.println("Ȩ��ư");
				}
				for(int c = 0; c < insert_panel[i].bottom_btn.length; c++) {
					if(btn == insert_panel[i].bottom_btn[c]) {
						System.out.println(c+"��ư");
					}
				}
				
			}/////////////////�� Ȩ
		}
/////////////////////////////////////////��///////////////////////////////////////////
		if(location_id == 1) {
			
			if(btn == twobtn_panel[0].base_center.btn[0]) {
				search_panel_add(home_panel.car_btn);
				layout.show(slide, "car_search_0"); ////�ڵ��� ���� �˻�
			}
			
			if(btn == twobtn_panel[0].base_center.btn[1]) {
				search_panel_add(home_panel.car_btn);
				layout.show(slide, "car_search_1"); ////�߰��� ���� �˻�
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

///////////////////////////////////////����///////////////////////////////////////////
		
		
		
////////////////////////////////////////�Ÿ�//////////////////////////////////////////
		if(location_id == 3) {
			if(btn == twobtn_panel[0].base_center.btn[0]) {
				layout.show(slide, "deal_1"); ////����
			}
			if(btn == twobtn_panel[0].base_center.btn[1]) {
				layout.show(slide, "deal_3"); ////�Ǹ�
			}
			if(btn == twobtn_panel[1].base_center.btn[0]) {
				layout.show(slide, "deal_2"); ////���� �˻�
			}
			if(btn == twobtn_panel[3].base_center.btn[0]) {
				layout.show(slide, "deal_4"); /////�߰��� �˻�
			}
			if(btn == twobtn_panel[2].base_center.btn[0]) {
				search_panel_add(home_panel.deal_btn);
				layout.show(slide, "deal_search_0"); ////���� ���� �˻�
			}
			if(btn == twobtn_panel[4].base_center.btn[0]) {
				search_panel_add(home_panel.deal_btn);
				layout.show(slide, "deal_search_1"); ////�߰��� ���� �˻�
			}
		}
		
////////////////////////////////////////����/////////////////////////////////////////
		if(location_id == 4) {
			if(btn == tandb_panel[0].detailed_search_btn) {
				layout.show(slide, "sale_1");
			}
		}

		
	}
}
