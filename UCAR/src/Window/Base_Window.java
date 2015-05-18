package Window;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import Panel.Home_Panel;

public class Base_Window extends JFrame implements ActionListener {
		
	public CardLayout layout;
	public JPanel slide;
	public Base_Window_Panel base_panel;
	
	public JButton input_btn;
	
	public Base_Window(String title) {
		
		super(title);
		
		base_panel = new Base_Window_Panel();
		
		base_setting(true);
		
	}
	
	public void base_setting(boolean check) { // ������ �⺻ ���� 
		 		 
 		try{ 
 			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
 		} 
 		catch(Exception e){ 
 			e.printStackTrace(); 
 		} 
 		  
 		layout = new CardLayout();
		slide = new JPanel(layout);
		
		setLayout(layout);
		setAlwaysOnTop(true);  							//�׻� �� �ɼ� 
		setResizable(false);							//ũ�� ���� �Ұ��� 
 		setBounds(500, 50, 1024, 768);					// ��ġ(x : 500, y : 50), ũ��(1024x768) 
 		setVisible(true); 
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		JButton btn = (JButton)e.getSource();
		
	} 
	
}
