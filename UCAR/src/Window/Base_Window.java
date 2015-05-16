package Window;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.UIManager;

import Home.Home_Window_Panel;

public class Base_Window extends JFrame {
		
	public Base_Window(String title) {
		
		super(title);		
		
		base_setting(true);
		
	}
	
	public void base_setting(boolean check) { // 윈도우 기본 설정 
		 		 
 		try{ 
 			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
 		} 
 		catch(Exception e){ 
 			e.printStackTrace(); 
 		} 
 		 
 		setBackground(Color.WHITE); 
		setAlwaysOnTop(true);  							//항상 위 옵션 
		setResizable(false);							//크기 조절 불가능 
 		setBounds(500, 50, 1024, 768);					// 위치(x : 500, y : 50), 크기(1024x768) 
 		setVisible(true); 
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 	} 
	
}
