package Panel;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;

import DB.DB_Conn;
import DB.Model;
import Window.Base_Window_Panel;

public class ResultTable_Panel extends Base_Window_Panel {

	public DB_Conn conn;
	
	public Model model;
	public JTable table;
	
	public Connection con;
	public PreparedStatement pstmt, pstmtNoscroll;
	public Statement stmt;
	
	public ResultSet re, reNoscroll;
	
	public String selectSql = "select * from car_info where 1=1 ";
	
	public ResultTable_Panel() {
		
		table = new JTable();

	}
	
	public void DB_Connect() {
		
		conn = new DB_Conn();
		try{
			con = conn.getConnection();
			System.out.println("DB����");
		}
		catch(Exception e) {
			System.out.println("DB�������");
		}
		
	}
	
	public void DB_Select() throws SQLException {
		
		pstmt = con.prepareStatement(selectSql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); //last�޼��带 �����ϱ�  ���� �ΰ��� �ɼ��� �߰�
		pstmtNoscroll = con.prepareStatement(selectSql); //�׳� ������ ������ ����
		
		re = pstmt.executeQuery(); //re�� next�� �����ϴ�.
		
		reNoscroll = pstmtNoscroll.executeQuery(); //last�� �Ұ����ϴ�.
		
		model = new Model();
		model.setRows(re); //last�� ����ϱ� ������ re
		model.setData(reNoscroll); //�����͸� ä���, re�� first�� �ϴ� �ͺ��� �ϳ� �� ���� �� ȿ�����̴�.
		///re�� �ѹ� ���� ���������� �������⶧���� reNoscroll�� �ϳ� �� ���� �����͸� ä���.
		System.out.println("1");
		table.setModel(model); //���̺�� ���� ����
		System.out.println("1");

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
