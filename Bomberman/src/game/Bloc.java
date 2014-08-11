package game;

public class Bloc {

	boolean breakable, broken;
	Bonus bonus;
	Bomb bomb;
	
	// Default bloc is broken
	public Bloc(boolean b){
		bonus = new Bonus();
		bomb = new Bomb(0);
		breakable = true;
		broken = b;
	}
	
	public Bloc(boolean breakable, boolean broken){
		bonus = new Bonus();
		bomb = new Bomb(0);
		this.breakable = breakable;
		this.broken = broken;
	}
	
	public void setBreakable(boolean b){
		breakable = b;
	}
	
	public void setBroken(boolean b){
		broken = b;
	}
}
