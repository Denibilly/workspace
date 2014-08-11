package game;

public class Player {

	// Identification
	String name;
	int id;
	
	// Position
	int x, y;
	
	// Player attributes
	int score;
	int lifes;
	
	// Player improvements
	float speed;
	// Bomb power
	int power, bombs, maxBombs;
	
	// Player powers
	boolean remote, push, punch;
	boolean visible;
	boolean ghost;
	
	public Player(String n, int x, int y, int id){
		name = n;
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public void setGhost(boolean g){
		ghost = g;
	}
}
