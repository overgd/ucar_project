package Sale;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

import Window.Base_Window_Panel;
import Window.ButtonImage;

public class Sale_Panel_0 extends Base_Window_Panel {
	
	JPanel Sale_Panel_0;
	
	JPanel grosssales_btn_panel, yearsearch_btn_panel, monthlysearch_btn_panel,
			searchilbyeol_btn_panel, salesregistration_btn_panel, detailedsearch_btn_panel;
	public JButton grosssales_btn, yearsearch_btn, monthlysearch_btn, searchilbyeol_btn,
			salesregistration_btn, detailedsearch_btn;
	
	ButtonImage img;
	
	public Sale_Panel_0() {
		
		setLayout(null);
		
		img = new ButtonImage();
		
		grosssales_btn = new JButton("총 매출");
		grosssales_btn.setIcon(img.ucinfo_img_1);
		grosssales_btn.setPressedIcon(img.ucinfo_img_2);
		yearsearch_btn = new JButton("연간 검색");
		yearsearch_btn.setIcon(img.userinfo_img_1);
		yearsearch_btn.setPressedIcon(img.userinfo_img_2);
		monthlysearch_btn = new JButton("월별 검색");
		
		searchilbyeol_btn = new JButton("일별 검색");
		searchilbyeol_btn.setIcon(img.pcinfo_img_1);
		searchilbyeol_btn.setPressedIcon(img.pcinfo_img_2);
		salesregistration_btn = new JButton("매출 등록");
		salesregistration_btn.setIcon(img.pcinfo_img_1);
		salesregistration_btn.setPressedIcon(img.pcinfo_img_2);
		detailedsearch_btn = new JButton("상세 검색");
		detailedsearch_btn.setIcon(img.pcinfo_img_1);
		detailedsearch_btn.setPressedIcon(img.pcinfo_img_2);
		
		grosssales_btn.setBounds(30, 10, 178, 200);
		yearsearch_btn.setBounds(30, 10, 178, 200);
		monthlysearch_btn.setBounds(30, 10, 178, 200);
		searchilbyeol_btn.setBounds(30, 10, 178, 200);
		salesregistration_btn.setBounds(30, 10, 178, 200);
		detailedsearch_btn.setBounds(30, 10, 178, 200);
		
		grosssales_btn_panel = new JPanel(null);
		grosssales_btn_panel.setBackground(Color.WHITE);
		yearsearch_btn_panel = new JPanel(null);
		yearsearch_btn_panel.setBackground(Color.WHITE);
		monthlysearch_btn_panel = new JPanel(null);
		monthlysearch_btn_panel.setBackground(Color.WHITE);
		searchilbyeol_btn_panel = new JPanel(null);
		searchilbyeol_btn_panel.setBackground(Color.WHITE);
		salesregistration_btn_panel = new JPanel(null);
		salesregistration_btn_panel.setBackground(Color.WHITE);
		detailedsearch_btn_panel = new JPanel(null);
		detailedsearch_btn_panel.setBackground(Color.WHITE);
		
		
		grosssales_btn_panel.add(grosssales_btn);
		yearsearch_btn_panel.add(yearsearch_btn);
		monthlysearch_btn_panel.add(monthlysearch_btn);
		searchilbyeol_btn_panel.add(searchilbyeol_btn);
		salesregistration_btn_panel.add(searchilbyeol_btn);
		detailedsearch_btn_panel.add(searchilbyeol_btn);
		
		Sale_Panel_0 = new JPanel(new GridLayout(3,3));
		Sale_Panel_0.setBackground(Color.WHITE);		
		
		Sale_Panel_0.add(grosssales_btn_panel);
		Sale_Panel_0.add(yearsearch_btn_panel);
		Sale_Panel_0.add(monthlysearch_btn_panel);
		Sale_Panel_0.add(searchilbyeol_btn_panel);
		Sale_Panel_0.add(salesregistration_btn_panel);
		Sale_Panel_0.add(detailedsearch_btn_panel);
		
		Sale_Panel_0.setBounds(256, 140, 500, 500);
		
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
