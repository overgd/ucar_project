package Window;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Base_Window_Bottom extends JPanel {

	JButton[] btns;
	JPanel[] null_panel, btns_panel;
	
	public Base_Window_Bottom() {
		
		super();
		
		setLayout(new FlowLayout(FlowLayout.RIGHT)); // �׸��� ���̾ƿ�
		
		button_add(5);

		setVisible(true);
		
	}
	
	public void button_add(int btn_num){
		
		btns = new JButton[btn_num]; // ��ư ����
		btns_panel = new JPanel[btns.length]; // ��ư �г�
		null_panel = new JPanel[btns.length]; // ���� �г�

		/*���� ����*/
		for(int i = 0; i < null_panel.length; i++) {
			null_panel[i] = new JPanel();
			null_panel[i].setPreferredSize(new Dimension(30, 100));
		}
		
		/*��ư ����*/
		for(int i = 0; i < btns.length; i++) {
			
			btns[i] = new JButton("");
			btns[i].setPreferredSize(new Dimension(100, 40));
			
			btns_panel[i] = new JPanel();
			btns_panel[i].add(btns[i]);
			
			add(btns_panel[i]);
			add(null_panel[i]);

		}
	
	}

}
