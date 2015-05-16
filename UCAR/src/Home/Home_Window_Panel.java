package Home;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

import Window.Base_Window;
import Window.Base_Window_Panel;

public class Home_Window_Panel extends Base_Window_Panel {

	JButton backbtn;
	JButton homebtn;
	
	JPanel home_panel;
	
	JPanel car_btn_panel, user_btn_panel, deal_btn_panel, sale_btn_panel;
	JButton car_btn, user_btn, deal_btn, sale_btn;
	
	public Home_Window_Panel() {
		
		setLayout(null);
		
		car_btn = new JButton("차");
		user_btn = new JButton("회원");
		deal_btn = new JButton("매매");
		sale_btn = new JButton("판매");
		
		car_btn.addActionListener(this);
		user_btn.addActionListener(this);
		deal_btn.addActionListener(this);
		sale_btn.addActionListener(this);
		
		car_btn.setBounds(30, 10, 200, 200);
		user_btn.setBounds(30, 10, 200, 200);
		deal_btn.setBounds(30, 10, 200, 200);
		sale_btn.setBounds(30, 10, 200, 200);
		
		car_btn_panel = new JPanel(null);
		car_btn_panel.setBackground(Color.WHITE);
		user_btn_panel = new JPanel(null);
		user_btn_panel.setBackground(Color.WHITE);
		deal_btn_panel = new JPanel(null);
		deal_btn_panel.setBackground(Color.WHITE);
		sale_btn_panel = new JPanel(null);
		sale_btn_panel.setBackground(Color.WHITE);
		
		car_btn_panel.add(car_btn);
		user_btn_panel.add(user_btn);
		deal_btn_panel.add(deal_btn);
		sale_btn_panel.add(sale_btn);
		
		home_panel = new JPanel(new GridLayout(2,2));
		home_panel.setBackground(Color.WHITE);		
		
		home_panel.add(car_btn_panel);
		home_panel.add(user_btn_panel);
		home_panel.add(deal_btn_panel);
		home_panel.add(sale_btn_panel);
		
		home_panel.setBounds(256, 140, 500, 500);
		
		add(home_panel);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		super.actionPerformed(e);
		
		JButton btn = (JButton)e.getSource();
		if(btn == car_btn) {
			
		}

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
