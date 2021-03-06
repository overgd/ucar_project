package Panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;

import DB.DB_Conn;
import DB.Model;
import Window.Base_Window_Panel;

public class ResultTable_Panel extends Base_Window_Panel {

	public DB_Conn conn;
	
	public Model model;
	public JTable table;
	public JScrollPane scrollpane;
	
	public Connection con = null;
	public PreparedStatement pstmt, pstmtNoscroll;
	public Statement stmt = null;
	
	public ResultSet re, reNoscroll;
	
	public String selectSql1 = "select * from ";
	public String selectSql2 = " where 1=1 ";
	public String selectSql = "";
	
	public int btn_num;
	
	public ResultTable_Panel() {
		
		table = new JTable();
		scrollpane = new JScrollPane(table);
		table.setFont(new Font("맑은 고딕", 0, 20));
		table.setRowHeight(80);
		table.setBackground(Color.WHITE);
		
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
	
	public void DB_Delete(String from_table, String[] where) throws SQLException {
		
		System.out.println(table.getColumnName(1));
				
		String deleteSql1 = "delete from ";
		String deleteSql2 = " where 1=1";
		String deleteSql = "";
		
		deleteSql = deleteSql1 + from_table + deleteSql2;
		
		for(int i = 0; i < where.length ;i++) {
			if(i == where.length-2){
			}
			else{
			deleteSql = deleteSql + " and " + table.getColumnName(i) + " = '" + where[i] + "'";
			}
		}
		String[] str = {"네", "아니오"};
		int ret = JOptionPane.showOptionDialog(this, "정말로 삭제합니까?", "삭제 확인", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, str, str[0]);
		if(ret == JOptionPane.YES_NO_OPTION){
			stmt = con.createStatement();
			stmt.executeUpdate(deleteSql);
			System.out.println(deleteSql);
		}
		else if(ret == JOptionPane.NO_OPTION){
			System.out.println(deleteSql);
		}
		
	}
	
	public void DB_Select(String from_table, String where) throws SQLException {
		
		selectSql = selectSql1 + from_table + selectSql2 + where;
		System.out.println(selectSql);
		pstmt = con.prepareStatement(selectSql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); //last메서드를 생성하기  위해 두가지 옵션을 추가
		pstmtNoscroll = con.prepareStatement(selectSql); //그냥 쿼리만 가지고 만듦
		
		re = pstmt.executeQuery(); //re는 next만 가능하다.
		
		reNoscroll = pstmtNoscroll.executeQuery(); //last가 불가능하다.
		
		model = new Model();
		model.setRows(re); //last를 써야하기 때문에 re
		model.setData(reNoscroll); //데이터를 채우기, re를 first로 하는 것보다 하나 더 만들어서 더 효율적이다.
		///re가 한번 돌면 마지막으로 가버리기때문에 reNoscroll를 하나 더 만들어서 데이터를 채운다.

		table.setModel(model); //테이블과 모델을 연결

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
