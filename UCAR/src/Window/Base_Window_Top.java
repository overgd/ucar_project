package Window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Base_Window_Top extends JPanel { //기본 윈도우 탑

	Base_Window_Top_Dao top_dao;
	
	JButton backbtn, homebtn; // 백 버튼, 홈 버튼
	JPanel[] btns_panel;
	JPanel[] null_panel;
	JLabel subject_label;
	String subject;
	
	ButtonImage img;
	
	public Base_Window_Top(String subject) {
		
		setLayout(new BorderLayout()); //보더레이아웃
		
		top_dao = new Base_Window_Top_Dao();
		
		img = new ButtonImage();
		
		btns_panel = new JPanel[2];
		btns_panel[0] = new JPanel();
		btns_panel[1] = new JPanel();
		
		subject_label = new JLabel(subject);
		subject_label.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		
		null_panel = new JPanel[3];
		for(int i = 0; i < null_panel.length; i++) {
			null_panel[i] = new JPanel();
			null_panel[i].setPreferredSize(new Dimension(30, 150));
			null_panel[i].setBackground(Color.WHITE);
		}
		
		/*버튼 생성*/
		backbtn = new JButton(); // 백 버튼
		backbtn.setIcon(img.back_img_1);
		backbtn.setPressedIcon(img.back_img_2);
		backbtn.setPreferredSize(new Dimension(140, 140));
		top_dao.setBackbtn(backbtn);
		
		homebtn = new JButton(); // 홈 버튼
		homebtn.setIcon(img.home_img_1);
		homebtn.setPressedIcon(img.home_img_2);
		homebtn.setPreferredSize(new Dimension(140, 140));
		top_dao.setHomebtn(homebtn);
		
		/*버튼을 패널에 추가*/
		btns_panel[0].add(null_panel[0]);
		btns_panel[0].add(backbtn); 
		btns_panel[0].add(null_panel[1]);
		btns_panel[0].add(subject_label);
		btns_panel[0].setBackground(Color.WHITE);
		
		btns_panel[1].add(homebtn);
		btns_panel[1].add(null_panel[2]);
		btns_panel[1].setBackground(Color.WHITE);
		
		add("West", btns_panel[0]);
		add("East", btns_panel[1]);
		
		setBackground(Color.WHITE);
		setVisible(true);
	}
	
}
