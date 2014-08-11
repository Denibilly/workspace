
import java.awt.*;
import java.awt.event.*;
//import javax.swing.*;


import javax.swing.JOptionPane;
 
class Drawing extends Canvas
{
 
	static final long serialVersionUID = 5;
	Image i;
    String[] fonds= new String[]{"Sable","Eau","Terre","Herbe"};
    //Game g;
 
    public static final int largeur=500;
	public static final int longueur=500;
 
	private static final Color couleurDesLignes = Color.black;
	private static final Color couleurFondDeGrille = Color.white;
	public static final int largeurCaseGraphique= 20;
 
 
 
    public Drawing(int largeur, int hauteur) {	
	this.setSize(largeur,hauteur);
	this.addMouseListener( new MouseAdapter() {
	    public void mouseClicked(MouseEvent evt) {
		System.out.println( "Clicked at " +
                    evt.getX() + " " + evt.getY() );
 
	    //paintCarte(evt.getX(), evt.getY());
 
	    }
 
	    public void mousePressed(MouseEvent evt) {
		System.out.println( "Pressed at " +
                    evt.getX() + " " + evt.getY() );
	    }
	    public void mouseReleased(MouseEvent evt) {
		System.out.println( "Released at " +
                    evt.getX() + " " + evt.getY() );
 
		repaint();
 
	    }
	});
	this.addMouseMotionListener( new MouseMotionAdapter() {
	    public void mouseDragged( MouseEvent evt) {
		System.out.println( "Dragged to " +
                    evt.getX() + " " + evt.getY() );
 
		//paintCarte(evt.getX(), evt.getY());
 
	    }
	    public void mouseMoved( MouseEvent evt) {
		System.out.println( "Moved to " +
                    evt.getX() + " " + evt.getY() );
	    }
	});
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	i = tk.getImage( "C:/Documents and Settings/Singarin/Mes documents/Mes images/Sable.jpg" );
    repaint();
}
 
    public void reload()
    {
    	/*if(a==1)
    	{
    	Toolkit tk = Toolkit.getDefaultToolkit();
    	System.out.println("Reload");
    	i = tk.getImage( "C:/Documents and Settings/Singarin/Mes documents/Mes images/exodia.gif" );
    	repaint();
    	}*/
 
    	String fond = (String)JOptionPane.showInputDialog(null,"Choississez un fond",
				"Fond",JOptionPane.QUESTION_MESSAGE, null, fonds, fonds[0]);
 
 
		if("Sable".equals(fond))
		{
			Toolkit tk = Toolkit.getDefaultToolkit();
			i = tk.getImage( "C:/Documents and Settings/Singarin/Mes documents/Mes images/sable.jpg" );
			repaint();
		}
 
		if("Eau".equals(fond))
		{
			Toolkit tk = Toolkit.getDefaultToolkit();
			i = tk.getImage( "C:/Documents and Settings/Singarin/Mes documents/Mes images/mer.jpg" );
			repaint();
		}
 
		if("Terre".equals(fond))
		{
			Toolkit tk = Toolkit.getDefaultToolkit();
			i = tk.getImage( "C:/Documents and Settings/Singarin/Mes documents/Mes images/desert.jpg" );
			repaint();
 
 
		}
 
		if("Herbe".equals(fond))
		{
			Toolkit tk = Toolkit.getDefaultToolkit();
			i = tk.getImage( "C:/Documents and Settings/Singarin/Mes documents/Mes images/herbe.gif" );
			repaint();
		}
    }
 
    public void update(Graphics g)
    {
    	paint(g);
    }
 
    public void paint(Graphics gr) 
    {
 
    	Dimension s = getSize();
	    System.out.println( s.width + " " + s.height );
	    //g.setColor( Color.black );
	    //g.fillRect( 0, 0, s.width, s.height);
	    //g.setColor( Color.red );
	    //g.drawString( "Bonjour...", 10, s.height-10);
	    if (i!= null) 
	    {
	       gr.drawImage( i, 0, 0, this);
	    }
 
        //dessiner la grille
 
	    gr.setColor(couleurFondDeGrille);
		//gr.fillRect(200, 200, longueur * largeurCaseGraphique, largeur * largeurCaseGraphique);
		gr.fillRect(0,0,0,0);
	    gr.setColor(couleurDesLignes);
		for (int i = 0; i < longueur; i++)
		    gr.drawLine(i*largeurCaseGraphique, 0, i*largeurCaseGraphique, longueur*largeurCaseGraphique);
		for (int i = 0; i < largeur; i++)
		    gr.drawLine(0, i*largeurCaseGraphique, largeur*largeurCaseGraphique, i*largeurCaseGraphique);
 
 
    }
}