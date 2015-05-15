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

public class Base_Window_Center extends JPanel implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		if(btn == btn1) {
			center_layout.previous(slide);
		}
		else if(btn == btn2) {
			center_layout.show(slide, "c");
		}
		
	}

	CardLayout center_layout;
	
	JPanel slide;
	
	JPanel cd1, cd2, cd3;
	
	JButton btn1, btn2;

	public Base_Window_Center() {
		
		super();
		
		center_layout = new CardLayout();
		slide = new JPanel();
		slide.setLayout(center_layout);
		
		btn1 = new JButton("오케이");
		btn2 = new JButton("그리고");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		cd1 = new JPanel();
		cd1.add(new JLabel("안녕?"));
		
		cd2 = new JPanel();
		cd2.add(new JLabel("오랜만이야..."));
		
		cd3 = new JPanel();
		cd3.add(new JLabel("안녕...."));
		
		slide.add(cd1, "a");
		slide.add(cd2, "b");
		slide.add(cd3, "c");
		
		center_layout.show(slide, "a");
		
		add(slide);
		add(btn1);
		add(btn2);
		
		setVisible(true);
	}


}
