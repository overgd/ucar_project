package Main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import Car.Test_Panel;
import Panel.First_Panel;
import Panel.Home_Panel;
import Panel.Search_Panel;
import Panel.TwoButton_Panel;
import Window.Base_Window;
import Window.ButtonImage;

public class Ucar_Init extends Base_Window {
	
	Home_Panel home_panel;
	Search_Panel[] panel;
	TwoButton_Panel test_panel;
	
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
		
		panel = new Search_Panel[1];
		
		panel[0] = new First_Panel();
//		panel[1] = new First_Panel();
		
		for(int i = 0; i < panel.length; i++) {
			
			panel[i].backbtn.addActionListener(this);
			panel[i].homebtn.addActionListener(this);
			
			if(panel[i].btn_num > 0) {
				panel[i].bottom_btn[panel[i].btn_num-1].addActionListener(this);
			}
			
			slide.add(panel[i], String.valueOf(i));
		}
		
	}
	
	public void test_add() {
		test_panel = new Test_Panel();
		slide.add(test_panel, "test");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		super.actionPerformed(e);
		
		JButton btn = (JButton)e.getSource();
		
		if(btn == home_panel.car_btn) {
			panel_add();
			this.layout.show(slide, "0");
		}
		
		if(btn == home_panel.deal_btn) {
			test_add();
			this.layout.show(slide, "test");
		}
		
		for(int i = 0; i < panel.length; i++) {
			
			if(btn == panel[i].backbtn) {
				layout.previous(slide);
				System.out.println("백버튼");
			}
			if(btn == panel[i].homebtn) {
				layout.show(slide, "home");
				System.out.println("홈버튼");
			}
			
			for(int c = 0; c < panel[i].btn_num; c++) {
				if(btn == panel[i].bottom_btn[c]) {
					System.out.println(c+"버튼");
				}
			}
		}
		
	}
	

}
