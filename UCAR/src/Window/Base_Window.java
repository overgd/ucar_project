package Window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Base_Window extends JFrame {
	
	Base_Window_Top base_top;
	Base_Window_Bottom base_bottom;
	
	public Base_Window(String title) {
		
		super(title);
		setLayout(new BorderLayout());
		
		base_top = new Base_Window_Top(); //탑 윈도우 패널
		add("North", base_top);
		
		base_bottom = new Base_Window_Bottom(); //바텀 윈도우 패널
		add("South", base_bottom);
		
		setAlwaysOnTop(true);
		setResizable(false);
		setBounds(500, 50, 1024, 768); // 위치(x : 500, y : 50), 크기(1024x768)
		setVisible(true); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
}
