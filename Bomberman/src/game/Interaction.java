package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Interaction implements KeyListener{
	
	MapG mg;
	
	
	public Interaction(MapG mg){
		super();
		this.mg = mg;
		
	}
	
	public void keyPressed(KeyEvent event) {
		
		String dir = "";
		//printEventInfo("Key Pressed", event);
		
		// 27 is ESC key code
		if(event.getKeyCode()==27) {
			System.exit(0);//exit
		}
		
		//// Movements of the player ////
		
		// Space Key code
		if(event.getKeyCode()==32) {
		
		}
		
		if(event.getKeyCode()==37)
			dir = "left";
		if(event.getKeyCode()==39)
			dir = "right";
		if(event.getKeyCode()==38) 
			dir = "up";
		if(event.getKeyCode()==40)
			dir = "down";
		
		// Second player
		// Left: Q -> 81
		if(event.getKeyCode()==81)
			dir = "left";
		// Right: D -> 68
		if(event.getKeyCode()==68)
			dir = "right";
		// Up: 90 -> Z
		if(event.getKeyCode()==90) 
			dir = "up";
		// Down: S -> 83
		if(event.getKeyCode()==83)
			dir = "down";
		
		int player=0;
		if(event.getKeyCode() >= 68)
			player = 1;
		mg.m.movePlayer(mg.m.players[player], dir);
		
		
		
		
		//// End of the players movements ////
		
		// Repaint the main panel after modifications
		mg.repaint();
	}
	
	public void keyReleased(KeyEvent event) {
		//printEventInfo("Key Released", event);
	}
	
	public void keyTyped(KeyEvent event) {
	    //printEventInfo("Key Typed", event);
	}
	
	
	/*
	private void printEventInfo(String str, KeyEvent e) {
	
		System.out.println(str+":");
	    int code = e.getKeyCode();
	    System.out.println("   Code: " + KeyEvent.getKeyText(code));
	    System.out.println("   Value: " + code);
	
	}
	*/
}

