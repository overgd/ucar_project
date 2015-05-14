package Home;

import Window.Base_Window;

public class Home_Window extends Base_Window {
	
	public Home_Window(String title) {

		super(title);
		base_top_visible(true);
		base_bottom_visible(false);
		
	}
	
	@Override
	public String subject(String subject) {
		subject = "";
		return subject;
	}

	@Override
	public void base_top_visible(boolean visible) {
		// TODO Auto-generated method stub
		super.base_top_visible(visible);
	}

	@Override
	public void base_bottom_visible(boolean visible) {
		// TODO Auto-generated method stub
		super.base_bottom_visible(visible);
	}


	
}
