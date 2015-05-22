package Car;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;

import Panel.Insert_Panel;
import Panel.Update_Panel;

public class Car_Panel_1_2_3 extends Update_Panel {

	public String subject = "자동차 정보 수정";
	public String[] label_name = {"차   종 ", "브랜드 ", "모델명 ", "연   식 ", "연   료", "배기량", "연   비", "출고가", "기준가"}; 
	public String[] btn_name = {"수정"};
	
	public Car_Panel_1_2_3(String[] input_data) {
		
		super();
		
		btn_num = btn_name.length;
		
		base_top_visible(true, subject);
		insert_data_add(input_data);
		insert_form_add(label_name);
		base_bottom_visible(true, btn_name);
	
	}

	@Override
	public void insert_data_add(String[] input_data) {
		// TODO Auto-generated method stub
		super.insert_data_add(input_data);
	}

	public void DB_Update(String table_name, String[] insert_val, String[] input_data) { 
		
//		for(int i = 0;i<input_data.length;i++){
//			System.out.println(input_data[i]);
//		}
		
		String updatesql_1 = "update ";
		String updatesql_2 = " set c_id = '"+input_data[0]+"', c_brand = '"+insert_val[1]+"', c_name = '"+insert_val[2]+"', c_releasecost = "+insert_val[7]+", c_yearmodel = '"+insert_val[3]+"', c_fuel = '"+insert_val[4]+"', c_standardcost = "+insert_val[8]+", c_displacement = '"+insert_val[5]+"', c_fe = '"+insert_val[6]+"', c_photo = '', c_type = '"+insert_val[0]+"' where c_id = '"+input_data[0]+"'";
		String updatesql;
		
		updatesql = updatesql_1	+ table_name + updatesql_2;
		
		String[] str = {"네", "아니오"};
		int ret = JOptionPane.showOptionDialog(this, "정말로 수정합니까?", "수정 확인", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, str, str[0]);
		if(ret == JOptionPane.YES_NO_OPTION){
			try{
				//id, brand, name, releasecost, yearmodel,
				//fuel, standardcost, displacement, fe, photo
				//type
				//id, 차종, 브랜드, 모델명, 연식, 연료, 배기량, 연비, 출고가, 기준가
				stmt = con.prepareStatement(updatesql);
//				pstmt.setString(1, insert_val[0]);  //id ,id
//				pstmt.setString(2, insert_val[1]); //
//				pstmt.setString(3, insert_val[2]);
//				pstmt.setInt(4, Integer.parseInt(insert_val[3]));
//				pstmt.setString(5, insert_val[4]);
//				pstmt.setString(6, insert_val[5]);
//				pstmt.setInt(7, Integer.parseInt(insert_val[6]));
//				pstmt.setString(8, insert_val[7]);
//				pstmt.setString(9, insert_val[8]);
//				pstmt.setString(10, "");
//				pstmt.setString(11, insert_val[10]);
//				pstmt.setString(12, insert_val[0]);
				System.out.println(updatesql);
				stmt.executeUpdate(updatesql);
//				ResultSet rs = pstmt.executeQuery(updatesql);
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}		
		}
		else if(ret == JOptionPane.NO_OPTION){
			
		}
	}

	@Override
	public void DB_Connect() {
		// TODO Auto-generated method stub
		super.DB_Connect();
	}

	@Override
	public void DB_Select(String column, String where) {
		// TODO Auto-generated method stub
		super.DB_Select(column, where);
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
