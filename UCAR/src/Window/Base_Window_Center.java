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
	
	public Base_Window_Center(String[] search_name, String[] list_val1, String[] list_val2, String[] list_val3) {
		
		super();
		SearchList_Panel(search_name, list_val1, list_val2, list_val3);
		setBackground(Color.WHITE);
		setVisible(true);
		
	}	
	
	public Base_Window_Center() {
		
		super();
		
		setBackground(Color.WHITE);
		setVisible(true);
		
	}
	
	
	
	public void SearchList_Panel(String[] search_name, String[] list_val1, String[] list_val2, String[] list_val3) {
		
		JPanel panel;
		
		String[] list_val_1;
		String[] list_val_2;
		String[] list_val_3;
		
		list_val_1 = new String[list_val1.length];
		list_val_2 = new String[list_val2.length];
		list_val_3 = new String[list_val3.length];
		
		for(int i = 0; i < list_val1.length ;i++){
			list_val_1[i] = list_val1[i];
		}
		for(int i = 0; i < list_val2.length;i++){
			list_val_2[i] = list_val2[i];
		}
		for(int i = 0; i < list_val3.length;i++){
			list_val_3[i] = list_val3[i];
		}
		
		ArrayList<String[]> list = new ArrayList();
		
		list.add(0, list_val_1);
		list.add(1, list_val_2);
		list.add(2, list_val_3);
		
		String[] name = search_name;
		
		setLayout(null);
		
		panel = new JPanel(null);

		search_list = new JList[name.length];
		search_label = new JLabel[name.length];
		list_scrollpane = new JScrollPane[search_list.length];
		
		//////////////////////////////¶óº§////////////////////////////////////
		for(int i = 0; i < name.length; i++) {
			
			search_label[i] = new JLabel(name[i]);
			search_label[i].setFont(new Font("¸¼Àº °íµñ",Font.BOLD ,30));
			search_label[i].setBounds(X-10+(i*200), Y, 200, 200);
			panel.add(search_label[i]);
			
		}
		////////////////////////////¸®½ºÆ®////////////////////////////////////
	
			search_list[0] = new JList(list_val1);
			search_list[0].setFont(new Font("¸¼Àº °íµñ",0 ,30));
			
			list_scrollpane[0] = new JScrollPane(search_list[0]);
			list_scrollpane[0].setPreferredSize(new Dimension(250, 410));
			list_scrollpane[0].setBounds(X-60+(0*200), Y+150, 200, 250);
			
			panel.add(list_scrollpane[0]);
			
			search_list[1] = new JList(list_val2);
			search_list[1].setFont(new Font("¸¼Àº °íµñ",0 ,30));
			
			list_scrollpane[1] = new JScrollPane(search_list[1]);
			list_scrollpane[1].setPreferredSize(new Dimension(250, 410));
			list_scrollpane[1].setBounds(X-60+(1*200), Y+150, 200, 250);
			
			panel.add(list_scrollpane[1]);
			
			search_list[2] = new JList(list_val3);
			search_list[2].setFont(new Font("¸¼Àº °íµñ",0 ,30));
			
			list_scrollpane[2] = new JScrollPane(search_list[2]);
			list_scrollpane[2].setPreferredSize(new Dimension(250, 410));
			list_scrollpane[2].setBounds(X-60+(2*200), Y+150, 200, 250);
			
			panel.add(list_scrollpane[2]);
			
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
