package Main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.event.ListSelectionEvent;

import Car.Test_Panel;
import Panel.First_Panel;
import Panel.Home_Panel;
import Panel.Search_Panel;
import Panel.TwoButton_Panel;
import Window.Base_Window;
import Window.Base_Window_Panel;
import Window.ButtonImage;

public class Ucar_Init extends Base_Window {
	
	Home_Panel home_panel;
	Search_Panel[] search_panel;
	TwoButton_Panel[] twobtn_panel;
	TwoButton_Panel test_panel;
	
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
	
	public void panel_add() {
		
		search_panel = new First_Panel[1];
		
		search_panel[0] = new First_Panel();		
		
		for(int i = 0; i < search_panel.length; i++) {
			
			search_panel[i].backbtn.addActionListener(this);
			search_panel[i].homebtn.addActionListener(this);
			search_panel[i].base_center.search_list[0].addListSelectionListener(this);
			
			if(search_panel[i].btn_num > 0) {
				search_panel[i].bottom_btn[search_panel[i].btn_num-1].addActionListener(this);
			}
			
			slide.add(search_panel[i], String.valueOf(i));
			
		}
		
	}
	
	public void test_add() {
		test_panel = new Test_Panel();
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
		
		if(btn == home_panel.car_btn) { ///차 버튼
			panel_add();
			this.layout.show(slide, "0");
		}
		
		if(btn == home_panel.user_btn) { ///회원 버튼
			test_add();
			this.layout.show(slide, "test");
		}
		
		if(btn == home_panel.deal_btn) { ///매매 버튼
			test_add();
			this.layout.show(slide, "test");
		}
		
		if(btn == home_panel.sale_btn) { ///매출 버튼
			test_add();
			this.layout.show(slide, "test");
		}
		
		if(btn == search_panel[0].bottom_btn[0]) { ///+조회창 확인 버튼
			
			input_data = new String[3];
			for(int i = 0; i < input_data.length; i++){
				input_data[0] = search_panel[0].selection[i];
				System.out.println(search_panel[0].selection[i]);
			}
			
		}
		
		for(int i = 0; i < search_panel.length; i++) { ////////// 백 홈
			
			if(btn == search_panel[i].backbtn) {
				layout.previous(slide);
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
}
