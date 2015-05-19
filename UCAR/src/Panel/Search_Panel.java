package Panel;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import DB.DB_Conn;
import Window.Base_Window_Panel;

public class Search_Panel extends Base_Window_Panel {
	
	public DB_Conn conn;
	public Connection con;
	public PreparedStatement pstmt;
	public Statement stmt;
	public String selectsql = "select * from test_info where car = ? and brand = ? and model = ?";
	
	public int btn_num;
	public String subject;
	
	public ArrayList<String>[] table_data;
	
	public Search_Panel() {
		
		super();
		
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
	
	public void DB_Select() { 
	
		try {
			pstmt = con.prepareStatement(selectsql);
			pstmt.setString(1, "대형");
			pstmt.setString(2, "");
			pstmt.setString(3, "");
			ResultSet rs = pstmt.executeQuery();
			
			table_data = new ArrayList[3];
			
			table_data[0] = new ArrayList<String>();
			table_data[1] = new ArrayList<String>();
			table_data[2] = new ArrayList<String>();
			
			
			int i = 0;
			
			while(rs.next()) {
				
				table_data[0].add(i, rs.getString("car"));
				table_data[1].add(i, rs.getString("brand"));
				table_data[2].add(i, rs.getString("model"));
				
				if(i != 0) {
					
					if(table_data[0].get(i).equals(table_data[0].get(i-1))){
						System.out.println("같음");
					}
					else if(!table_data[0].get(i).equals(table_data[0].get(i-1))) {
						System.out.println(table_data[0].get(i));
					}
					
					if(table_data[1].get(i).equals(table_data[1].get(i-1))){
						System.out.println("같음");
					}
					else if(!table_data[1].get(i).equals(table_data[1].get(i-1))) {
						System.out.println(table_data[1].get(i));
					}
					
					if(table_data[2].get(i).equals(table_data[2].get(i-1))){
						System.out.println("같음");
					}
					else if(!table_data[2].get(i).equals(table_data[2].get(i-1))) {
						System.out.println(table_data[2].get(i));
					}
				}
				
				else if(i == 0) {
					System.out.println(table_data[0].get(i));
					System.out.println(table_data[1].get(i));
					System.out.println(table_data[2].get(i));
				}
				
				i++;
			}
			
			System.out.println("조회 완료");
			
		} catch (SQLException e) {
			e.printStackTrace();
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
	public void base_center_visible(boolean visible, String[] search_name,
			String[] search_list_name) {
		// TODO Auto-generated method stub
		super.base_center_visible(visible, search_name, search_list_name);
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
