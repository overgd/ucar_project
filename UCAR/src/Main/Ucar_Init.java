package Main;

import java.awt.Frame;

import Home.Home_Window_Panel;
import Window.Base_Window;

public class Ucar_Init extends Base_Window {
	
	Home_Window_Panel home_panel;
	
	public Ucar_Init(String title) {
		
		super(title);
		
		home_panel = new Home_Window_Panel();
		
		add(home_panel);
		
		super.base_setting(true);
		
	}

}
