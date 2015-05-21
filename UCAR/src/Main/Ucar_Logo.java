package Main;

import java.awt.AlphaComposite;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Ucar_Logo extends JPanel implements ActionListener, MouseListener {

	public Image myImage = new ImageIcon("./img/logo.jpg").getImage();

	public Timer timer = new Timer(20, this);

	private float alpha = 1f;

	public Ucar_Logo() {
	    timer.start();
	}

	public void paint(Graphics g) {
		  
		super.paint(g);
	    Graphics2D g2d = (Graphics2D) g;
	    
	    g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
	    g2d.drawImage(myImage, 0, 0, null);
	    
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {

		alpha += -0.1f;
		    
		if (alpha <= 0) {
			alpha = 0;
		    timer.stop();		    
		    
//		    new Ucar_Init("UCAR 0.2.150521");
//		    this.setVisible(false);
		}
		
		repaint();
		    
	}
	
}
