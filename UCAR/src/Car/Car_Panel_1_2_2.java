package Car;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.event.ListSelectionEvent;

import Panel.Insert_Panel;

public class Car_Panel_1_2_2 extends Insert_Panel {

	public String subject = "자동차 정보 등록";
	public String[] label_name = {" I    D ","차   종 ", "브랜드 ", "모델명 ", "연   식 ", "연   료", "배기량", "연   비", "출고가", "기준가"}; 
	public String[] btn_name = {"등록", "취소"};
	public String[] insert_val;
	
	public Car_Panel_1_2_2() {
		
		super();
		
		btn_num = btn_name.length;
		
		base_top_visible(true, subject);
		insert_form_add(label_name);
		base_bottom_visible(true, btn_name);
	
	}
	
	public void DB_insert(String table_name, String[] insert_val) { 
		
		String insertsql_1 = "insert into ";
		String insertsql_2 = " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		String insertsql;
		
		insertsql = insertsql_1	+ table_name + insertsql_2;
		
		try{
			//id, brand, name, releasecost, yearmodel,
			//fuel, standardcost, displacement, fe, photo
			//type
			//id, 차종, 브랜드, 모델명, 연식, 연료, 배기량, 연비, 출고가, 기준가
			System.out.println(insert_val[0]);
			pstmt = con.prepareStatement(insertsql);
			pstmt.setString(1, insert_val[0]);  //id ,id
			pstmt.setString(11, insert_val[1]);
			pstmt.setString(2, insert_val[2]);
			pstmt.setString(3, insert_val[3]);
			pstmt.setString(5, insert_val[4]);
			pstmt.setString(6, insert_val[5]);
			pstmt.setString(8, insert_val[6]);
			pstmt.setString(9, insert_val[7]);
			pstmt.setInt(4, Integer.parseInt(insert_val[8]));
			pstmt.setInt(7, Integer.parseInt(insert_val[9]));
			pstmt.setString(10, "");
			System.out.println(insertsql);
			ResultSet rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
	}

	@Override
	public void DB_Connect() {
		// TODO Auto-generated method stub
		super.DB_Connect();
	}


	@Override
	public void insert_form_add(String[] label_name) {
		// TODO Auto-generated method stub
		super.insert_form_add(label_name);
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
