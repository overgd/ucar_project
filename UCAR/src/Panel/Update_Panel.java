package Panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;

import DB.DB_Conn;
import Window.Base_Window_Panel;

public class Update_Panel extends Base_Window_Panel {

	public DB_Conn conn;
	public Connection con;
	public PreparedStatement pstmt = null;
	public Statement stmt = null;
	
	public String subject = "TEST";
	public String[] btn_name = {"null"};
	
	public JPanel center_panel, right_panel, left_panel;
	public JPanel input_panel_1, input_panel_2, null_panel;

	public JLabel[] label;
	public String[] label_name = {""};
	public JTextField[] input_text;
	
	public String[] data = null;
	
	public int btn_num;
	
	public Update_Panel() {
		
		super();
		
	}
	
	public void insert_data_add(String[] input_data) {
		
		data = null;
		
		if(input_data != null) {
			data = new String[input_data.length];
			for(int i = 0; i < input_data.length; i++){
				data[i] = input_data[i];
			}
		}
	}
	
	public void DB_insert(String table_name, String[] insert_val) {
		
	}
	
	public void DB_Update(String table_name, String[] insert_val, String[] table_input_data) {
		
	}
	
	public void DB_Connect() {
		
		conn = new DB_Conn();
		try{
			con = conn.getConnection();
			System.out.println("DB¿¬°á");
		}
		catch(Exception e) {
			System.out.println("DB¿¬°á½ÇÆÐ");
		}
		
	}
	
	public void DB_Select(String column, String where) { 
		
		String selectsql_1 = "select distinct ";
		String selectsql_2 = " from car_info where 1=1 ";
		String selectsql;
		if(where != ""){
			selectsql = selectsql_1	+ column + selectsql_2 + where;
		}
		else {
			selectsql = selectsql_1	+ column + selectsql_2;
		}
		try {
			System.out.println(selectsql);
			pstmt = con.prepareStatement(selectsql);
			ResultSet rs = pstmt.executeQuery();

			int i = 0;
			
			while(rs.next()) {
	
				i++;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
	}
	
	public void insert_form_add(String[] label_name) {
		
		center_panel = new JPanel(new GridLayout(1, 2));
		
		left_panel = new JPanel(null);
		left_panel.setBackground(Color.white);
		right_panel = new JPanel(null);
		right_panel.setBackground(Color.WHITE);
		
		input_panel_1 = new JPanel(new GridLayout(label_name.length, 1));
		input_panel_1.setBackground(Color.WHITE);
		input_panel_1.setBounds(190, 20, 110, 380);
		input_panel_2 = new JPanel(new GridLayout(label_name.length, 1));
		input_panel_2.setBounds(300, 20, 200, 380);
		
		null_panel = new JPanel();
		null_panel.add(new JLabel("±¸Çö ¸øÇÔ ¤Ð¤Ð"));	
		null_panel.setBounds(100, 200, 200, 380);
		null_panel.setBackground(Color.WHITE);
		
		label = new JLabel[label_name.length];
		input_text = new JTextField[label_name.length];
		
		for(int i = 0; i < label_name.length; i++) {
			
			label[i] = new JLabel(label_name[i]);
			label[i].setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 30));
			
			input_text[i] = new JTextField("");
			if(data != null) {
				input_text[0] = new JTextField(data[10]);
				input_text[1] = new JTextField(data[1]);
				input_text[2] = new JTextField(data[2]);
				input_text[3] = new JTextField(data[4]);
				input_text[4] = new JTextField(data[5]);
				input_text[5] = new JTextField(data[7]);
				input_text[6] = new JTextField(data[8]);
				input_text[7] = new JTextField(data[3]);
				input_text[8] = new JTextField(data[6]);
			}
			
//			input_text[i] = new JTextField("");
			input_text[i].setFont(new Font("¸¼Àº °íµñ", 0, 20));
			
			input_panel_1.add(label[i]);
			input_panel_2.add(input_text[i]);
		}
		
		left_panel.add(input_panel_1);
		left_panel.add(input_panel_2);
		
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
