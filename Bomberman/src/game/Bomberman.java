package game;
import java.io.*;
import javax.swing.JFrame;




public class Bomberman extends JFrame{

	static final long serialVersionUID = 0;
	
	// Main function
	public static void main(String[] args) throws IOException {
	
		Bomberman bomberman = new Bomberman();
		bomberman.start();

	}
	// End of the main function
	
	public void start(){
		// Graphics
		MapG panel = new MapG(new Map(6));
		this.add(panel);
		
		Interaction inter = new Interaction(panel);
		this.addKeyListener(inter);
		
		setVisible(true);
		setSize((panel.m.sizeX+4)*64+20, (panel.m.sizeY+4)*64+40);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
}
