package Window;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Base_Window_Center extends JPanel {

	CardLayout center_layout;
	
	JPanel slide;
	
	JPanel cd1, cd2, cd3;

	public Base_Window_Center() {
		
		super();
		
		center_layout = new CardLayout();
		slide = new JPanel();
		slide.setLayout(center_layout);
		
		cd1 = new JPanel();
		cd1.add(new JLabel("¾È³ç?"));
		
		cd2 = new JPanel();
		cd2.add(new JLabel("¿À·£¸¸ÀÌ¾ß..."));
		
		cd3 = new JPanel();
		cd3.add(new JLabel("¾È³ç...."));
		
		slide.add(cd1, "a");
		slide.add(cd2, "b");
		slide.add(cd3, "c");
		
		center_layout.show(slide, "a");
		
		add(slide);
		
		setVisible(true);
	}


}
