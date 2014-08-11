package game;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PlayerG extends JPanel {

	static final long serialVersionUID = 0;
	
	private Image img;
	private int x, y;
	private Player p;
	
	Image p1 = new ImageIcon("data/p1.png").getImage();
	Image p2 = new ImageIcon("data/p2.png").getImage();
	Image p3 = new ImageIcon("data/p3.png").getImage();
	
	public PlayerG(Player p, int x, int y){
		this.p = p;
		this.x = x;
		this.y = y;
		
		chooseImage();
	}
	
	private void chooseImage(){
		
		if(p.id == 1)
			img = p1;
		else
			img = p2;
		
		// We get the specification of the image
	    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
	    setPreferredSize(size);
	    setMinimumSize(size);
	    setMaximumSize(size);
	    setSize(size);
	    setLayout(null);
	}
	
	public void draw(Graphics g){
		g.drawImage(img, x, y, null);
	}
}
