package Window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Base_Window_Top extends JPanel { //�⺻ ������ ž

	JButton backbtn, homebtn; // �� ��ư, Ȩ ��ư
	
	public Base_Window_Top() {
		
		setLayout(new BorderLayout()); //���� ���̾ƿ�
		
		
		/*��ư ����*/
		backbtn = new JButton("�ڷΰ���"); // �� ��ư
		
		homebtn = new JButton("Ȩ"); // Ȩ ��ư
		
		
		/*��ư�߰�*/
		add("West", backbtn); 
		add("East", homebtn);
		
		setVisible(true);
	}
	
}
