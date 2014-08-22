package game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BlocG extends JPanel{
	
	static final long serialVersionUID = 0;
	
	private Image img;
	private int x, y;
	private Bloc b;
	
	Image wall = new ImageIcon("data/wallblock.png").getImage();
	Image empty = new ImageIcon("data/grass.png").getImage();
	Image breakable = new ImageIcon("data/breakable.png").getImage(); 
	
	public BlocG(Bloc b, int x, int y) {
		this.b = b;
		this.x = x;
		this.y = y;
		
		chooseImage();
	
	}
	
	private void chooseImage(){
		
		if(b.broken)
			img = empty;
		else if(b.breakable)
			img = breakable;
		else
			img = wall;
		
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
