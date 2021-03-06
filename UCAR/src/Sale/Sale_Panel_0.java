package Sale;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

import Panel.TopAndBottom_Panel;
import Panel.TwoButton_Panel;
import Window.Base_Window_Panel;
import Window.ButtonImage;

public class Sale_Panel_0 extends TopAndBottom_Panel {

	public JPanel panel;
	
	public JPanel gross_sales_btn_panel, year_search_btn_panel,
			monthly_search_btn_panel, search_ilbyeol_btn_panel,
			sales_registration_btn_panel, detailed_search_btn_panel;
	
	ButtonImage img;
	
	public Sale_Panel_0() {
		
		base_top_visible(true, "����");
		
		img = new ButtonImage();
		
		gross_sales_btn = new JButton();
		gross_sales_btn.setIcon(img.totalsaleinfo_img_1);
		gross_sales_btn.setPressedIcon(img.totalsaleinfo_img_2);
		sales_registration_btn = new JButton();
		sales_registration_btn.setIcon(img.saleregister_img_1);
		sales_registration_btn.setPressedIcon(img.saleregister_img_2);
		detailed_search_btn = new JButton();
		detailed_search_btn.setIcon(img.detailsearch_img_1);
		detailed_search_btn.setPressedIcon(img.detailsearch_img_2);
		year_search_btn = new JButton();
		year_search_btn.setIcon(img.yysearch_img_1);
		year_search_btn.setPressedIcon(img.yysearch_img_2);
		monthly_search_btn = new JButton();
		monthly_search_btn.setIcon(img.mmsearch_img_1);
		monthly_search_btn.setPressedIcon(img.mmsearch_img_2);
		search_ilbyeol_btn = new JButton();
		search_ilbyeol_btn.setIcon(img.ddsearch_img_1);
		search_ilbyeol_btn.setPressedIcon(img.ddsearch_img_2);

		gross_sales_btn.setBounds(130, 0, 200, 200);
		sales_registration_btn.setBounds(65, 0, 200, 200);
		detailed_search_btn.setBounds(0, 0, 200, 200);
		year_search_btn.setBounds(130, 0, 200, 200);
		monthly_search_btn.setBounds(65, 0, 200, 200);
		search_ilbyeol_btn.setBounds(0, 0, 200, 200);
		
		gross_sales_btn_panel = new JPanel(null);
		gross_sales_btn_panel.setBackground(Color.WHITE);
		sales_registration_btn_panel = new JPanel(null);
		sales_registration_btn_panel.setBackground(Color.WHITE);
		detailed_search_btn_panel = new JPanel(null);
		detailed_search_btn_panel.setBackground(Color.WHITE);
		year_search_btn_panel = new JPanel(null);
		year_search_btn_panel.setBackground(Color.WHITE);
		monthly_search_btn_panel = new JPanel(null);
		monthly_search_btn_panel.setBackground(Color.WHITE);
		search_ilbyeol_btn_panel = new JPanel(null);
		search_ilbyeol_btn_panel.setBackground(Color.WHITE);
		
		
		gross_sales_btn_panel.add(gross_sales_btn);
		sales_registration_btn_panel.add(sales_registration_btn);
		detailed_search_btn_panel.add(detailed_search_btn);
		year_search_btn_panel.add(year_search_btn);
		monthly_search_btn_panel.add(monthly_search_btn);
		search_ilbyeol_btn_panel.add(search_ilbyeol_btn);

		panel = new JPanel(new GridLayout(2,3));
		panel.setBackground(Color.WHITE);		
		
		panel.add(gross_sales_btn_panel);
		panel.add(sales_registration_btn_panel);
		panel.add(detailed_search_btn_panel);
		panel.add(year_search_btn_panel);
		panel.add(monthly_search_btn_panel);
		panel.add(search_ilbyeol_btn_panel);
		
		panel.setBounds(0, 0, 1024, 768);
		
		add(panel);
		
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
