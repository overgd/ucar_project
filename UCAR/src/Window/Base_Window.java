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
	
	public void base_setting(boolean check) { // 윈도우 기본 설정
		setAlwaysOnTop(true);  							//항상 위 옵션
		setResizable(false);							//크기 조절 불가능
		setBounds(500, 50, 1024, 768);					// 위치(x : 500, y : 50), 크기(1024x768)
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void base_top_visible(boolean visible, String subject) {
		if(visible) {
			base_top = new Base_Window_Top(subject); //탑 윈도우 패널
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
			base_bottom = new Base_Window_Bottom(btn_name); //바텀 윈도우 패널
			add("South", base_bottom);
		}
	}
	
	
}
