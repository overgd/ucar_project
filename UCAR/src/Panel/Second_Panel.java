package Panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import Window.Base_Window_Panel;

public class Second_Panel extends ResultTable_Panel {
	
	String[] btn_name = {"�ȳ�", "���"};
	String subject = "�ι�°";

	public Second_Panel() {

		base_top_visible(true, subject);
		
		try {
		DB_Connect();
		DB_Select("car_info", "");
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
