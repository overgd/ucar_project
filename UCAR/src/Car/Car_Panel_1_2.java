package Car;

import java.awt.event.ActionEvent;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

import Panel.ResultTable_Panel;

public class Car_Panel_1_2 extends ResultTable_Panel {
	
	String[] btn_name = {"��", "���", "����", "����"};
	String subject = "�ڵ��� �˻� ���";

	public Car_Panel_1_2(String from_table, String where) {
		
		btn_num = btn_name.length;
		
		base_top_visible(true, subject);
		
		try {
		DB_Connect();
		DB_Select(from_table, where);
		}
		catch(Exception e) {
			System.out.println("����1");
		}
		finally {
			try {
				con.close();
			}
			catch(Exception e) {
				System.out.println("����2");
			}
		}
//		table.setFont(new Font("���� ���", 0, 15));
		add("Center", scrollpane);
		
		base_bottom_visible(true, btn_name);
		
	}
		
	@Override
	public void DB_Delete(String from_table, String[] where)
			throws SQLException {
		// TODO Auto-generated method stub
		super.DB_Delete(from_table, where);
	}

	@Override
	public void DB_Connect() {
		// TODO Auto-generated method stub
		super.DB_Connect();
	}


	@Override
	public void DB_Select(String from_table, String where) throws SQLException {
		// TODO Auto-generated method stub
		super.DB_Select(from_table, where);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		super.valueChanged(e);
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
	public void base_top_visible(boolean visible) {
		// TODO Auto-generated method stub
		super.base_top_visible(visible);
	}

	@Override
	public void base_bottom_visible(boolean visible) {
		// TODO Auto-generated method stub
		super.base_bottom_visible(visible);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		super.actionPerformed(e);
	}

	
	
}
