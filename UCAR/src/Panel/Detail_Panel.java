package Panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;

import DB.DB_Conn;
import Window.Base_Window_Panel;

public class Detail_Panel extends Base_Window_Panel {

	public String subject = "TEST";
	public String[] btn_name = {"null"};
	
	public JPanel center_panel, right_panel, left_panel;
	public JPanel detail_panel_1, detail_panel_2, null_panel;

	public JLabel[] label;
	public String[] label_name = {""};
	public JTextField[] detail_text;
	
	public String[] data;
	
	public int btn_num;
	
	public Detail_Panel() {
		
		super();
		
	}
	
	public void detail_data_add(String[] input_data) {
		
		data = new String[input_data.length];
		
		for(int i = 0; i < input_data.length; i++){
			data[i] = input_data[i];
		}
	}
	
	public void detail_form_add(String[] label_name) {
		
		center_panel = new JPanel(new GridLayout(1, 2));
		
		left_panel = new JPanel(null);
		left_panel.setBackground(Color.white);
		right_panel = new JPanel(null);
		right_panel.setBackground(Color.WHITE);
		
		detail_panel_1 = new JPanel(new GridLayout(label_name.length, 1));
		detail_panel_1.setBackground(Color.WHITE);
		detail_panel_1.setBounds(190, 20, 110, 380);
		detail_panel_2 = new JPanel(new GridLayout(label_name.length, 1));
		detail_panel_2.setBounds(300, 20, 200, 380);
		
		null_panel = new JPanel();
		null_panel.add(new JLabel("±¸Çö ¸øÇÔ ¤Ð¤Ð"));	
		null_panel.setBounds(100, 200, 200, 380);
		null_panel.setBackground(Color.WHITE);
		
		label = new JLabel[label_name.length];
		detail_text = new JTextField[label_name.length];
		
		for(int i = 0; i < label_name.length; i++) {
			
			label[i] = new JLabel(label_name[i]);
			label[i].setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 30));
			
			detail_text[i] = new JTextField("");
			if(data != null) {
				detail_text[0] = new JTextField(data[0]);
				detail_text[1] = new JTextField(data[10]);
				detail_text[2] = new JTextField(data[1]);
				detail_text[3] = new JTextField(data[2]);
				detail_text[4] = new JTextField(data[4]);
				detail_text[5] = new JTextField(data[5]);
				detail_text[6] = new JTextField(data[7]);
				detail_text[7] = new JTextField(data[8]);
				detail_text[8] = new JTextField(data[3]);
				detail_text[9] = new JTextField(data[6]);
			}
			
			detail_text[i].setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 30));
			detail_text[i].setEnabled(false);

			detail_panel_1.add(label[i]);
			detail_panel_2.add(detail_text[i]);
		}
		
		left_panel.add(detail_panel_1);
		left_panel.add(detail_panel_2);
		
		right_panel.add(null_panel);
		
		center_panel.add(left_panel);
		center_panel.add(right_panel);
		
		add("Center", center_panel);

	}

	@Override
	public String subject(String subject) {
		// TODO Auto-generated method stub
		return super.subject(subject);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		super.valueChanged(e);
	}

	@Override
	public void base_top_visible(boolean visible, String subject) {
		// TODO Auto-generated method stub
		super.base_top_visible(visible, subject);
	}

	@Override
	public void base_top_visible(boolean visible) {
		// TODO Auto-generated method stub
		super.base_top_visible(visible);
	}

	@Override
	public void base_center_visible(boolean visible, ImageIcon img_icon1,
			ImageIcon img_icon2) {
		// TODO Auto-generated method stub
		super.base_center_visible(visible, img_icon1, img_icon2);
	}

	@Override
	public void base_center_visible(boolean visible, String[] search_name) {
		// TODO Auto-generated method stub
		super.base_center_visible(visible, search_name);
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

	@Override
	public void base_bottom_visible(boolean visible) {
		// TODO Auto-generated method stub
		super.base_bottom_visible(visible);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		super.actionPerformed(e);
	}
	
	

}
