package Car;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

import Panel.TwoButton_Panel;
import Window.Base_Window_Panel;
import Window.ButtonImage;

public class Test_Panel extends TwoButton_Panel {
	
	JPanel Sale_Panel_0;
	
	JPanel gross_sales_btn_panel, year_search_btn_panel,
			monthly_search_btn_panel, search_ilbyeol_btn_panel,
			sales_registration_btn_panel, detailed_search_btn_panel;
	public JButton gross_sales_btn, year_search_btn,
			monthly_search_btn, search_ilbyeol_btn,
			sales_registration_btn, detailed_search_btn;
	
	ButtonImage img;
	
	public Test_Panel() {
		
		setLayout(null);
		
		img = new ButtonImage();
		
		gross_sales_btn = new JButton("총 매출");
		gross_sales_btn.setIcon(img.ucinfo_img_1);
		gross_sales_btn.setPressedIcon(img.ucinfo_img_2);	
		year_search_btn = new JButton("연간 검색");
		year_search_btn.setIcon(img.userinfo_img_1);
		year_search_btn.setPressedIcon(img.userinfo_img_2);
		monthly_search_btn = new JButton("월별 검색");
		search_ilbyeol_btn = new JButton("일별 검색");
		search_ilbyeol_btn.setIcon(img.pcinfo_img_1);
		search_ilbyeol_btn.setPressedIcon(img.pcinfo_img_2);
		sales_registration_btn = new JButton("매출 등록");
		sales_registration_btn.setIcon(img.pcinfo_img_1);
		sales_registration_btn.setPressedIcon(img.pcinfo_img_2);
		detailed_search_btn = new JButton("상세 검색");
		detailed_search_btn.setIcon(img.pcinfo_img_1);
		detailed_search_btn.setPressedIcon(img.pcinfo_img_2);
		
		gross_sales_btn.setBounds(30, 10, 178, 200);
		year_search_btn.setBounds(30, 10, 178, 200);
		monthly_search_btn.setBounds(30, 10, 178, 200);
		search_ilbyeol_btn.setBounds(30, 10, 178, 200);
		sales_registration_btn.setBounds(30, 10, 178, 200);
		detailed_search_btn.setBounds(30, 10, 178, 200);
		
		gross_sales_btn_panel = new JPanel(null);
		gross_sales_btn_panel.setBackground(Color.WHITE);
		year_search_btn_panel = new JPanel(null);
		year_search_btn_panel.setBackground(Color.WHITE);
		monthly_search_btn_panel = new JPanel(null);
		monthly_search_btn_panel.setBackground(Color.WHITE);
		search_ilbyeol_btn_panel = new JPanel(null);
		search_ilbyeol_btn_panel.setBackground(Color.WHITE);
		sales_registration_btn_panel = new JPanel(null);
		sales_registration_btn_panel.setBackground(Color.WHITE);
		detailed_search_btn_panel = new JPanel(null);
		detailed_search_btn_panel.setBackground(Color.WHITE);
		
		
		gross_sales_btn_panel.add(gross_sales_btn);
		year_search_btn_panel.add(year_search_btn);
		monthly_search_btn_panel.add(monthly_search_btn);
		search_ilbyeol_btn_panel.add(search_ilbyeol_btn);
		sales_registration_btn_panel.add(search_ilbyeol_btn);
		detailed_search_btn_panel.add(search_ilbyeol_btn);
		
		Sale_Panel_0 = new JPanel(new GridLayout(3,3));
		Sale_Panel_0.setBackground(Color.WHITE);		
		
		Sale_Panel_0.add(gross_sales_btn_panel);
		Sale_Panel_0.add(year_search_btn_panel);
		Sale_Panel_0.add(monthly_search_btn_panel);
		Sale_Panel_0.add(search_ilbyeol_btn_panel);
		Sale_Panel_0.add(sales_registration_btn_panel);
		Sale_Panel_0.add(detailed_search_btn_panel);
		
		Sale_Panel_0.setBounds(0, 0, 1024, 768);
		
		add(Sale_Panel_0);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		super.actionPerformed(e);
		
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
	
}
