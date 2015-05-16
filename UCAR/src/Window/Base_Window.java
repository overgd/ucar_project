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
	
	public void base_setting(boolean check) { // ������ �⺻ ���� 
		 		 
 		try{ 
 			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
 		} 
 		catch(Exception e){ 
 			e.printStackTrace(); 
 		} 
 		 
 		setBackground(Color.WHITE); 
		setAlwaysOnTop(true);  							//�׻� �� �ɼ� 
		setResizable(false);							//ũ�� ���� �Ұ��� 
 		setBounds(500, 50, 1024, 768);					// ��ġ(x : 500, y : 50), ũ��(1024x768) 
 		setVisible(true); 
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 	} 
	
}
