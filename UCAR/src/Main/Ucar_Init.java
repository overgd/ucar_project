package Main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import Panel.First_Panel;
import Panel.Home_Panel;
import Panel.Search_Panel;
import Panel.TwoButton_Panel;
import Window.Base_Window;
import Window.ButtonImage;

public class Ucar_Init extends Base_Window {
	
	Home_Panel home_panel;
	Search_Panel[] panel;
	
	public Ucar_Init(String title) {
		
	super(title);
		
		home_panel = new Home_Panel();
		
		home_panel.car_btn.addActionListener(this);
		home_panel.user_btn.addActionListener(this);
		home_panel.deal_btn.addActionListener(this);
		home_panel.sale_btn.addActionListener(this);
		
		panel = new Search_Panel[2];
		
		panel[0] = new First_Panel();
		panel[1] = new First_Panel();
		
		slide.add(home_panel, "home");
		
		for(int i = 0; i < panel.length; i++) {
			
			panel[i].backbtn.addActionListener(this);
			panel[i].homebtn.addActionListener(this);
			if(panel[i].btn_num > 0) {
			panel[i].bottom_btn[panel[i].btn_num-1].addActionListener(this);
			}
			
			slide.add(panel[i], String.valueOf(i));
		}
		
		add(slide);
		
		layout.show(slide, "home");
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		super.actionPerformed(e);
		
		JButton btn = (JButton)e.getSource();
		
		if(btn == home_panel.car_btn) {
			this.layout.show(slide, "0");
		}
		
		for(int i = 0; i < panel.length; i++) {
			if(btn == panel[i].backbtn) {
				layout.previous(slide);
				System.out.println("���ư");
			}
			if(btn == panel[i].homebtn) {
				layout.show(slide, "home");
				System.out.println("Ȩ��ư");
			}
		}
		
	}
	

}