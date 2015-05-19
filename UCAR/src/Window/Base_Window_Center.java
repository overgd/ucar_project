package Window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Base_Window_Center extends JPanel {
	
	public JButton[] btn;
	public JLabel[] search_label;
	public JList[] search_list;
	public JScrollPane[] list_scrollpane;
	
	int X = 285;
	int Y = 0;
	
	public Base_Window_Center(ImageIcon img_icon1, ImageIcon img_icon2) {
		
		super();
		
		TwoButton_Panel(img_icon1, img_icon2);
		
		setBackground(Color.WHITE);
		setVisible(true);
		
	}
	
	public Base_Window_Center(String[] search_name, String[] search_list_name) {
		
		super();
		
		SearchList_Panel(search_name, search_list_name);
		
		setBackground(Color.WHITE);
		setVisible(true);
		
	}	
	
	public Base_Window_Center() {
		
		super();
		
		setBackground(Color.WHITE);
		setVisible(true);
		
	}
	
	public void SearchList_Panel(String[] search_name, String[] search_list_name) {
		
		JPanel panel;
		
		String[] list = search_list_name;
		String[] name = search_name;
		
		setLayout(null);
		
		panel = new JPanel(null);

		search_list = new JList[list.length];
		search_label = new JLabel[search_list.length];
		list_scrollpane = new JScrollPane[search_list.length];
		
		for(int i = 0; i < name.length; i++) {
			
			search_label[i] = new JLabel(name[i]);
			search_label[i].setFont(new Font("¸¼Àº °íµñ",Font.BOLD ,30));
			search_label[i].setBounds(X-10+(i*200), Y, 200, 200);
			panel.add(search_label[i]);
			
		}
		
		for(int i = 0; i < list.length; i++) {
			
			search_list[i] = new JList(list);
			search_list[i].setFont(new Font("¸¼Àº °íµñ",0 ,30));
			
			list_scrollpane[i] = new JScrollPane(search_list[i]);
			list_scrollpane[i].setPreferredSize(new Dimension(250, 410));
			list_scrollpane[i].setBounds(X-60+(i*200), Y+150, 200, 250);
			
			panel.add(list_scrollpane[i]);
		}
		
		panel.setBounds(0, 0, 1024, 500);
		panel.setBackground(Color.WHITE);
		add(panel);
		
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
