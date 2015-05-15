package Window;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Base_Window extends JFrame implements ActionListener {
	
	Base_Window_Top base_top;
	Base_Window_Center base_center;
	Base_Window_Bottom base_bottom;
	
	JButton[] bottom_btn;
	JButton backbtn, homebtn;
	
	String subject;
	
	public Base_Window(String title) {
		
		super(title);
		setLayout(new BorderLayout());
		
//		window_setting(true);
		
	}
	
	public String subject(String subject) {
		
		return subject;
	}
	
	public void base_setting(boolean check) { // ������ �⺻ ����
		setAlwaysOnTop(true);  							//�׻� �� �ɼ�
		setResizable(false);							//ũ�� ���� �Ұ���
		setBounds(500, 50, 1024, 768);					// ��ġ(x : 500, y : 50), ũ��(1024x768)
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void base_top_visible(boolean visible, String subject) {
		if(visible) {
			base_top = new Base_Window_Top(subject); //ž ������ �г�
			backbtn = base_top.top_dao.getBackbtn();
			backbtn.addActionListener(this);
			homebtn = base_top.top_dao.getHomebtn();
			homebtn.addActionListener(this);
			add("North", base_top);
		}
	}
	
	public void base_center_visible(boolean visible) {
		if(visible) {
			base_center = new Base_Window_Center();
			add("Center", base_center);
		}
	}
	
	public void base_bottom_visible(boolean visible, String[] btn_name) {
		
		if(visible) {
			
			base_bottom = new Base_Window_Bottom(btn_name); //���� ������ �г�
			add("South", base_bottom);
			
			bottom_btn = base_bottom.bottom_dao.getBottom_btn();
			for(int i = 0; i < bottom_btn.length; i++){
				bottom_btn[i].addActionListener(this);
			}
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btn = (JButton)e.getSource();
		
		for(int i = 0; i < bottom_btn.length; i++) {
			if(btn == bottom_btn[i]) {
				base_center.center_layout.show(base_center.slide, "a");
			}
		}
		if(btn == backbtn) {
			base_center.center_layout.previous(base_center.slide);
		}
		if(btn == homebtn) {
			base_center.center_layout.first(base_center.slide);
		}
		
	}
	
	
}
