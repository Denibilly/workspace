import javax.swing.*;
 
 
public class Game extends JPanel 
{
	static final long serialVersionUID = 1;
	protected Square[][] grille;
 
	public static final int largeur=20;
	public static final int longueur=20;
 
	
	public static final int largeurCaseGraphique= 20;
 
	public Game()
	{
		grille=new Square[longueur][largeur];
		setSize(longueur * largeurCaseGraphique, largeur * largeurCaseGraphique);
	}
 
	public void creergrille()
	{
		for(int i=0; i<longueur; i++)
		{
			for(int j=0; j<largeur; j++)
			{
				grille[i][j]=new Square();
			}
		}
	}
 
}

