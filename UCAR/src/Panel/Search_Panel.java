package Panel;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import DB.DB_Conn;
import Window.Base_Window_Panel;

public class Search_Panel extends Base_Window_Panel implements ListSelectionListener {
	
	public DB_Conn conn;
	public Connection con;
	public PreparedStatement pstmt;
	public Statement stmt;
	public String selectsql = "select * from test_info where 1=1 ";
	public String[] selection;
	
	public int btn_num;
	public String subject;
	
	public ArrayList<String>[] table_data;
	
	public Search_Panel() {
		
		super();
		selection = new String[3];
		
		
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
	
	public void DB_Select(String where) { 
	
		try {
			
			selectsql = selectsql + where;
			
			stmt = con.prepareStatement(selectsql);
			
			ResultSet rs = stmt.executeQuery(selectsql);
			
			table_data = new ArrayList[3];
			
			for(int i = 0; i < table_data.length; i++) {	
				table_data[i] = new ArrayList<String>();
			}
			
			int i = 0;
			
			while(rs.next()) {
				
				table_data[0].add(i, rs.getString("car"));
				table_data[1].add(i, rs.getString("brand"));
				table_data[2].add(i, rs.getString("model"));
				
				for(int c = 0; c < table_data.length; c++) {
					if(i != 0) {
						
							if(table_data[c].get(i).equals(table_data[c].get(i-1))){
								System.out.println("같음");
							}
							else if(!table_data[c].get(i).equals(table_data[c].get(i-1))) {
								System.out.println(table_data[c].get(i));
							}					
					}
					
					else if(i == 0) {
						System.out.println(table_data[c].get(i));
					}
				}
				i++;
			}
			
			System.out.println("조회 완료");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		super.valueChanged(e);
		
		for(int i = 0; i < base_center.search_list.length; i++) {
			if( !base_center.search_list[i].getValueIsAdjusting()) { //똑같은 항목을 눌렀을 때 처리가 안되게
				selection[i] = (String)base_center.search_list[i].getSelectedValue();
				System.out.println(selection[i]);
			}
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
