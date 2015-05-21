package Main;

import java.awt.AlphaComposite;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Ucar_Logo extends JPanel implements ActionListener {

	Image myImage = new ImageIcon("./img/logo.jpg").getImage();

	Timer timer = new Timer(20, this);

	private float alpha = 1f;

	public Ucar_Logo() {
	    timer.start();
	}

	public void paint(Graphics g) {
		  
		super.paint(g);
	    Graphics2D g2d = (Graphics2D) g;

	    g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
	    g2d.drawImage(myImage, 10, 10, null);
	    
	}

	public void actionPerformed(ActionEvent e) {
		  
		alpha += -0.02f;
		    
		if (alpha <= 0) {
			alpha = 0;
		    timer.stop();		    
		    
		    new Ucar_Init("UCAR 0.2.150521");
		    this.setVisible(false);
		}
		
		repaint();
		    
	}
	
}
