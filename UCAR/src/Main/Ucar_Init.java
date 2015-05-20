package Main;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;

import Car.Car_Panel_0;
import Car.Test_Panel;
import Deal.Deal_Panel_0;
import Deal.Deal_Panel_1_0;
import Deal.Deal_Panel_1_1;
import Deal.Deal_Panel_2_0;
import Deal.Deal_Panel_2_1;
import Panel.First_Panel;
import Panel.Home_Panel;
import Panel.Search_Panel;
import Panel.TopAndBottom_Panel;
import Panel.TwoButton_Panel;
import Sale.Sale_Panel_0;
import User.User_Panel_0;
import Window.Base_Window;

public class Ucar_Init extends Base_Window {
	
	Home_Panel home_panel;
	
	Search_Panel[] search_panel = null;
	TwoButton_Panel[] twobtn_panel = null;
	TopAndBottom_Panel[] tandb_panel = null;
	
	Search_Panel test_panel = null;
	
	String[] input_data;

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
	
	public void search_panel_add(JButton btn) {
		
		if(btn == home_panel.car_btn) {
			search_panel = new First_Panel[1];
			search_panel[0] = new First_Panel();		
			
			for(int i = 0; i < search_panel.length; i++) {
				
				search_panel[i].backbtn.addActionListener(this);
				search_panel[i].homebtn.addActionListener(this);
				search_panel[i].base_center.search_list[0].addListSelectionListener(this);
				
				if(search_panel[i].btn_num > 0) {
					search_panel[i].bottom_btn[search_panel[i].btn_num-1].addActionListener(this);
				}
				
				slide.add(search_panel[i],"car_"+ String.valueOf(i));
			}
		}
		
	}
	
	public void twobtn_panel_add(JButton btn) {
		
		if(btn == home_panel.car_btn) {
			
			twobtn_panel = new TwoButton_Panel[1];
			twobtn_panel[0] = new Car_Panel_0();
			
			for(int i = 0; i < twobtn_panel.length; i++) {
				
				twobtn_panel[i].backbtn.addActionListener(this);
				twobtn_panel[i].homebtn.addActionListener(this);
				
				if(twobtn_panel[i].btn_num > 0) {
					twobtn_panel[i].bottom_btn[twobtn_panel[i].btn_num-1].addActionListener(this);
				}
				
				slide.add(twobtn_panel[i], "car_"+String.valueOf(i));
			}
			
		}
		
		else if(btn == home_panel.user_btn) {
			
			twobtn_panel = new TwoButton_Panel[1];
			twobtn_panel[0] = new User_Panel_0();
			
			for(int i = 0; i < twobtn_panel.length; i++) {
				
				twobtn_panel[i].backbtn.addActionListener(this);
				twobtn_panel[i].homebtn.addActionListener(this);
				
				if(twobtn_panel[i].btn_num > 0) {
					twobtn_panel[i].bottom_btn[twobtn_panel[i].btn_num-1].addActionListener(this);
				}
				
				slide.add(twobtn_panel[i], "user_"+String.valueOf(i));
			}
			
		}
		
		else if(btn == home_panel.sale_btn) {
			
			tandb_panel = new TopAndBottom_Panel[1];
			tandb_panel[0] = new Sale_Panel_0();

			for(int i = 0; i < tandb_panel.length; i++) {
				
				tandb_panel[i].backbtn.addActionListener(this);
				tandb_panel[i].homebtn.addActionListener(this);
				
				if(tandb_panel[i].btn_num > 0) {
					tandb_panel[i].bottom_btn[tandb_panel[i].btn_num-1].addActionListener(this);
				}
				
				slide.add(tandb_panel[i], "sale_"+String.valueOf(i));
			}
			
		}
		
		else if(btn == home_panel.deal_btn) {
			
			twobtn_panel = new TwoButton_Panel[5];
			twobtn_panel[0] = new Deal_Panel_0();
			twobtn_panel[1] = new Deal_Panel_1_0();
			twobtn_panel[2] = new Deal_Panel_1_1();
			twobtn_panel[3] = new Deal_Panel_2_0();
			twobtn_panel[4] = new Deal_Panel_2_1();
			
			for(int i = 0; i < twobtn_panel.length; i++) {
				
				twobtn_panel[i].backbtn.addActionListener(this);
				twobtn_panel[i].homebtn.addActionListener(this);
				
				if(twobtn_panel[i].btn_num > 0) {
					twobtn_panel[i].bottom_btn[twobtn_panel[i].btn_num-1].addActionListener(this);
				}
				
				slide.add(twobtn_panel[i], "deal_"+String.valueOf(i));
			}
			
		}
		
		
	}
	
	public void test_add() {
		test_panel = new Test_Panel();
		
			test_panel.backbtn.addActionListener(this);
			test_panel.homebtn.addActionListener(this);
			test_panel.base_center.search_list[0].addListSelectionListener(this);
			
			if(test_panel.btn_num > 0) {
				test_panel.bottom_btn[test_panel.btn_num-1].addActionListener(this);
			}
			
			slide.add(test_panel, "test");		
		
	}
	
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		super.valueChanged(e);
	}

	@Override
	public void base_setting(boolean check) {
		// TODO Auto-generated method stub
		super.base_setting(check);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		super.mouseClicked(e);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseEntered(e);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseExited(e);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mousePressed(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
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
		}
		
		if(btn == home_panel.user_btn) { ///ȸ�� ��ư
			twobtn_panel_add(home_panel.user_btn);
			this.layout.show(slide, "user_0");
		}
		
		if(btn == home_panel.deal_btn) { ///�Ÿ� ��ư
			twobtn_panel_add(home_panel.deal_btn);
			this.layout.show(slide, "deal_0");
		}
		
		if(btn == home_panel.sale_btn) { ///���� ��ư
			twobtn_panel_add(home_panel.sale_btn);
			this.layout.show(slide, "sale_0");
		}
/********************************************************************************************/
		
//		if(btn == search_panel[0].bottom_btn[0]) { ///+��ȸâ Ȯ�� ��ư
//			
//			input_data = new String[3];
//			for(int i = 0; i < input_data.length; i++){
//				input_data[0] = search_panel[0].selection[i];
//				System.out.println(search_panel[0].selection[i]);
//			}
//			
//		}
		
		if(search_panel != null){
			for(int i = 0; i < search_panel.length; i++) { ////////// �� Ȩ
				
				if(btn == search_panel[i].backbtn) {
					layout.previous(slide);
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
		
		if(twobtn_panel != null){
			
			for(int i = 0; i < twobtn_panel.length; i++) { ////////// �� Ȩ
				
				if(btn == twobtn_panel[i].backbtn) {
					layout.previous(slide);
					System.out.println("���ư");
				}
				if(btn == twobtn_panel[i].homebtn) {
					layout.show(slide, "home");
					System.out.println("Ȩ��ư");
				}
	
				for(int c = 0; c < twobtn_panel[i].btn_num; c++) {
					if(btn == twobtn_panel[i].bottom_btn[c]) {
						System.out.println(c+"��ư");
					}
				}
				
			}/////////////////�� Ȩ
		}
		
		if(tandb_panel != null){
			
			for(int i = 0; i < tandb_panel.length; i++) { ////////// �� Ȩ
				
				if(btn == tandb_panel[i].backbtn) {
					layout.previous(slide);
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
	}
}
