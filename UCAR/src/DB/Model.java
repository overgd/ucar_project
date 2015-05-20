package DB;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.table.AbstractTableModel;

public class Model extends AbstractTableModel {

	Object[][] data; //� ������ �����Ͷ� �־�� �Ǳ� ������
	String[] columnNames;
	int rows, cols;
	
	public void setRows(ResultSet rs) {
		
		try{
			
			rs.last(); //�˻��ȵ����� �� �Ʒ���
			rows = rs.getRow(); //������ ���� ��ȣ
		}
		catch (Exception e) {
			
		}
		
	}
	
	public void setData(ResultSet rs) {
		// �������� �˻������ �־��ִ� �޼���
		try {
			ResultSetMetaData rsmd; //��Ÿ����Ÿ
			rsmd = rs.getMetaData();
			cols = rsmd.getColumnCount(); //���� ����
			columnNames = new String[cols]; 
			for(int i = 0; i < cols; i++) { // �˻��� ����� �������� ä��
				columnNames[i] = rsmd.getColumnName(i+1); //���� �̸�
			}
			data = new Object[rows][cols];
			int r = 0;
			while(rs.next()) { //�˻� �� ����ŭ �ݺ�
				for(int c = 0; c  < cols; c++){
					data[r][c] = rs.getObject(c+1); // ������ ����
				}
				r = r+1;
			}
			rs.close();
		}		
		
		catch(Exception e) {
			
		}
		
	}
	
	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		return data.length;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		
		return data[arg0][arg1];
	}

	@Override
	public String getColumnName(int column) {
		
		return columnNames[column];
	}

}
