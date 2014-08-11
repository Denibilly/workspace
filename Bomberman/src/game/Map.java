package game;

public class Map {

	int sizeX, sizeY;
	Bloc blocs[][];
	Player players[];
	
	///////////////////// Temporary for testing /////////////////////
	int current;
	
	// Constructor
	public Map(int s){
		int temp = s/2;
		sizeY = 2*temp+1;
		sizeX = 4*temp+1;
		
		blocs = new Bloc[sizeX][sizeY];
		players = new Player[2];
		current = 0;
		
		putBlocks();
		putPlayers();
	}
	
	private void putPlayers(){
		players[0] = new Player("Denis", 0, 0, 1);
		players[1] = new Player("Aymeric", sizeX-1, sizeY-1, 2);
		players[1].setGhost(true);
	}
	
	// Generate the map
	private void putBlocks(){
		
		// Initialisation
		for(int x=0; x<sizeX; x++){
			for(int y=0; y<sizeY; y++){
				if(x%2==0 || y%2==0){
					blocs[x][y] = new Bloc(true, false);
				}
				else{
					blocs[x][y] = new Bloc(false, false);
				}
			}
		}
		
		int x = sizeX-1;
		int y = sizeY-1;
		// Corner top left
		blocs[0][0].setBroken(true);
		blocs[0][1].setBroken(true);
		blocs[1][0].setBroken(true);
		// Corner bottom right
		blocs[x][y].setBroken(true);
		blocs[x][y-1].setBroken(true);
		blocs[x-1][y].setBroken(true);
			
	}
	
	public void movePlayer(Player p, String direction){
		
		if(direction == "up"){
			if(p.y>0){
				if((p.ghost && blocs[p.x][p.y-1].breakable) || blocs[p.x][p.y-1].broken)
					p.y--;
			}
		}
		else if(direction == "down"){
			if(p.y<this.sizeY-1){
				if((p.ghost && blocs[p.x][p.y+1].breakable) || blocs[p.x][p.y+1].broken)
					p.y++;
			}
				
		}
		else if(direction == "left"){
			if(p.x>0){
				if((p.ghost && blocs[p.x-1][p.y].breakable) || blocs[p.x-1][p.y].broken)
					p.x--;
			}
				
		}
		else if(direction == "right"){
			if(p.x<this.sizeX-1){
				if((p.ghost && blocs[p.x+1][p.y].breakable) || blocs[p.x+1][p.y].broken)
					p.x++;
			}
		}
	}
	
	
	/*
	// Display full array with ASCII char
	public void fullDisplayBlocks(){
		
		// Top of the array (220)
		for(int i=0;i<sizeX+2; i++)
			System.out.print('▄');
		System.out.println();
		// First line end
		
		// First column with a pipe (219)
		for(int y=0; y<sizeY; y++){
			System.out.print('█');
			for(int x=0; x<sizeX; x++){
				if(blocs[x][y].broken)
					// Space
					System.out.print(' ');
				else
					// Dense display (219)
					System.out.print('█');
			}
			System.out.println('█');
		}
		
		// Bottom of the array (223)
		for(int i=0;i<sizeX+2; i++)
			System.out.print('▀');
		System.out.println();
		// Bottom line end
	}
	*/
		
}
