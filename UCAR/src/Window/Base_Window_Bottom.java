package Window;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Base_Window_Bottom extends JPanel {

	JButton[] btns;
	JPanel[] null_panel, btns_panel;
	
	public Base_Window_Bottom() {
		
		super();
		
		btns = new JButton[7]; // ��ư
		btns_panel = new JPanel[7]; // ��ư ������ �г�
		null_panel = new JPanel[7]; // ���� �г�
		
		
		for(int i = 0; i < btns.length; i++) {
			
			btns[i] = new JButton("�ϳ�");
			
			btns[i].setPreferredSize(new Dimension(100, 50));
			
			btns_panel[i] = new JPanel();
			
			btns_panel[i].add(btns[i]);
		
			add(btns_panel[i]);
			
		}
		
		
		for(int i = 0; i < btns.length; i++) { // �Ʒ� ���� ����
			null_panel[i] = new JPanel();
			add(null_panel[i]);
		}
		
		setLayout(new GridLayout(0, 7)); // �׸��� ���̾ƿ�
		
		setVisible(true);
		
	}

}
