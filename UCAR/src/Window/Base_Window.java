package Window;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Base_Window extends JFrame {
	
	Base_Window_Top base_top;
	Base_Window_Center base_center;
	Base_Window_Bottom base_bottom;
	String subject;
	
	public Base_Window(String title) {
		
		super(title);
		setLayout(new BorderLayout());
		
//		window_setting(true);
		
	}
	
	public String subject(String subject) {
		
		return subject;
	}
	
	public void base_setting(boolean check) { // ������ �⺻ ����
		setAlwaysOnTop(true);  							//�׻� �� �ɼ�
		setResizable(false);							//ũ�� ���� �Ұ���
		setBounds(500, 50, 1024, 768);					// ��ġ(x : 500, y : 50), ũ��(1024x768)
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void base_top_visible(boolean visible, String subject) {
		if(visible) {
			base_top = new Base_Window_Top(subject); //ž ������ �г�
			add("North", base_top);
		}
	}
	
	public void base_center_visible(boolean visible) {
		if(visible) {
			base_center = new Base_Window_Center();
			add("Center", base_center);
		}
	}
	
	public void base_bottom_visible(boolean visible, String[] btn_name) {
		if(visible) {
			base_bottom = new Base_Window_Bottom(btn_name); //���� ������ �г�
			add("South", base_bottom);
		}
	}
	
	
}
