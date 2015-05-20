package Panel;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashSet;

import javax.swing.ImageIcon;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import DB.DB_Conn;
import Window.Base_Window_Center;
import Window.Base_Window_Panel;

public class Search_Panel extends Base_Window_Panel implements ListSelectionListener {
	
	public DB_Conn conn;
	public Connection con;
	public PreparedStatement pstmt;
	public Statement stmt;
	
	public String[] result_data_0;
	public String[] result_data_1;
	public String[] result_data_2;
	
	public String[] null_data = {""};
	public String[] search_name = {""};
	public String[] selection;
	
	public int btn_num;
	public String subject;
	
	public ArrayList<String>[] table_data;
	
	public Search_Panel() {
		
		super();
		
		selection = new String[3];
		
		DB_Connect();
		DB_Select("car", "");
		DB_Select_0(0);
		
	}
	
	public void DB_Select_0(int num) {
		
		result_data_0 = new String[table_data[num].size()];
		
		for(int i = 0; i < table_data[num].size() ;i++){
			result_data_0[i] = table_data[num].get(i);
		}

	}
	
	public void DB_Select_1(int num) {
		
		result_data_1 = new String[table_data[num].size()];
		
		for(int i = 0; i < table_data[num].size() ;i++){
			result_data_1[i] = table_data[num].get(i);
		}

	}
	
	public void DB_Select_2(int num) {
		
		result_data_2 = new String[table_data[num].size()];
		
		for(int i = 0; i < table_data[num].size() ;i++){
			result_data_2[i] = table_data[num].get(i);
		}

	}

	public void DB_Connect() {
		
		conn = new DB_Conn();
		try{
			con = conn.getConnection();
			System.out.println("DB연결");
		}
		catch(Exception e) {
			System.out.println("DB연결실패");
		}
		
	}
	
	public void DB_Select(String column, String where) { 
		
		String selectsql_1 = "select distinct ";
		String selectsql_2 = " from test_info where 1=1 ";
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
			
			table_data = new ArrayList[3];
			
			for(int i = 0; i < table_data.length; i++) {	
				table_data[i] = new ArrayList<String>();
			}
			
			int i = 0;
			
			while(rs.next()) {
				table_data[0].add(i, rs.getString(1));
				i++;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		super.valueChanged(e);
		
	
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
