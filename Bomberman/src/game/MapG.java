package game;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MapG extends JPanel{
	
	static final long serialVersionUID = 0;
	
	Map m;
	
	public MapG(Map m) {
		this.m = m;
	}
	
	public void displayMap(Graphics g){
		BlocG bG, bG2;
		PlayerG pG;
		
		// First and last line of unbreakable blocs
		for(int i=0; i<m.sizeX+2; i++){
			// Unbreakable bloc
			bG = new BlocG(new Bloc(false, false), (i+1)*64, 64);
			bG2 = new BlocG(new Bloc(false, false), (i+1)*64, (m.sizeY+2)*64);
			bG.draw(g);
			bG2.draw(g);
		}
		
		//First and last column of unbreakable blocs
		for(int i=0; i<m.sizeY; i++){
			bG = new BlocG(new Bloc(false, false), 64, (i+2)*64);
			bG2 = new BlocG(new Bloc(false, false), (m.sizeX+2)*64, (i+2)*64);
			bG.draw(g);
			bG2.draw(g);
		}
		
			
		for(int x=0; x<m.sizeX; x++){
			for(int y=0; y<m.sizeY; y++){
				bG = new BlocG(m.blocs[x][y], (x+2)*64, (y+2)*64);
				bG.draw(g);
			}
		}
		
		for(int i=0; i<m.players.length; i++){
			Player p = m.players[i];
			// -18 because size of image (need to change this)
			pG = new PlayerG(p, (p.x+2)*64, (p.y+2)*64-18);
			pG.draw(g);
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		displayMap(g);
	  }
}
