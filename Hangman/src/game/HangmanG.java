package game;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class HangmanG extends JPanel{

	static final long serialVersionUID = 0;
	
	MysteryWord word;
	Animation a;
	int state;
	
	public HangmanG(MysteryWord w){
		word = w;
		a = new Animation();
		state = 0;
	}
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(a.getImages().get(state), null, 50,50);
	}
}
