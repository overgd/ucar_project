package Window;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonImage extends JPanel {
	
	public ImageIcon home_img, back_img, pcinfo_img_1, pcinfo_img_2,
	saleinfo_img_1, saleinfo_img_2, ucinfo_img_1, ucinfo_img_2,
	userinfo_img_1, userinfo_img_2;
	
	public ButtonImage() {
		
		home_img = new ImageIcon("./img/btn_home_1.jpg");
		back_img = new ImageIcon("./img/btn_back_1.jpg");
		pcinfo_img_1 = new ImageIcon("./img/btn_pcinfo_1.png");
		pcinfo_img_2 = new ImageIcon("./img/btn_pcinfo_2.png");
		saleinfo_img_1 = new ImageIcon("./img/btn_saleinfo_1.png");
		saleinfo_img_2 = new ImageIcon("./img/btn_saleinfo_2.png");
		ucinfo_img_1 = new ImageIcon("./img/btn_ucinfo_1.png");
		ucinfo_img_2 = new ImageIcon("./img/btn_ucinfo_2.png");
		userinfo_img_1 = new ImageIcon("./img/btn_userinfo_1.png");
		userinfo_img_2 = new ImageIcon("./img/btn_userinfo_2.png");
	}
}
