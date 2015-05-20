package Window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Base_Window_Center extends JPanel {
	
	public JButton[] btn;
	
	public JPanel[] search_panel = new JPanel[3];
	public JLabel[] search_label = new JLabel[3];
	public JList[] search_list = new JList[3];
	public JScrollPane[] list_scrollpane = new JScrollPane[3];
	
	int X = 285;
	int Y = 0;
	
	public Base_Window_Center(ImageIcon img_icon1, ImageIcon img_icon2) {
		
		super();
		
		TwoButton_Panel(img_icon1, img_icon2);
		
		setBackground(Color.WHITE);
		setVisible(true);
		
	}
	
	
	public Base_Window_Center(String[] search_name, int num, String[] list_val) {
		
		super();
		
		setBackground(Color.WHITE);
		setVisible(true);

	}
	
	public Base_Window_Center() {
		
		super();
		
		setBackground(Color.WHITE);
		setVisible(true);
		
	}
	
	public void SearchList_Panel(String[] search_name, int num, String[] list_val) {
		
		search_label[num] = new JLabel(search_name[num]);
		search_label[num].setBounds(10+(num*200), 0, 150, 30);
		add(search_label[num]);
		
		search_list[num] = new JList(list_val);
		list_scrollpane[num] = new JScrollPane(search_list[num]);
		list_scrollpane[num].setBounds(0, 0, 200, 200); //위치는 고정
		search_panel[num] = new JPanel(null);
		search_panel[num].add(list_scrollpane[num]);
		search_panel[num].setBounds(10+(num*200), 50, 200, 200);
		search_panel[num].setVisible(true);
		add(search_panel[num]);		
		
	}
	
	public void TwoButton_Panel(ImageIcon img_icon1, ImageIcon img_icon2) {
	
		setLayout(null);
		
		btn = new JButton[2];
		
		ImageIcon[] icon = new ImageIcon[btn.length];
		icon[0] = img_icon1;
		icon[1] = img_icon2;
		
		for(int i = 0; i < btn.length; i++) {
			btn[i] = new JButton();
			btn[i].setIcon(icon[i]);
			btn[i].setBounds(X+(i*250), Y, 200, 420);
			add(btn[i]);
		}	
		
	}

}
