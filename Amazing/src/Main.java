import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
class carte extends carteEditeur implements ActionListener 
{
	static final long serialVersionUID = 0;
	JPanel panel;
	JMenuBar mbar;
 
	JButton b1;
	JButton b2;
	JButton b3;
 
	Drawing d;
	Image i;
	//item it;
	carteEditeur ce;
 
	Container contentPane=getContentPane();
 
	//protected Case[][] grille;
 
	public static final int DEFAULT_WIDTH=1000;
	public static final int DEFAULT_HEIGHT=700;
 
 
	//public static final int largeur=20;
	//public static final int longueur=20;
 
 
	public carte()
	{
		//panel.setLayout(new GridLayout(3, 3, 1, 1));
		//panel.setBackground(Color.cyan);
		contentPane.setLayout(new FlowLayout());
		//contentPane.add(panel);
		setTitle("Chasse au Trésor");
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		setDefaultCloseOperation(carte.EXIT_ON_CLOSE);
 
		//insertion objets sur le fenétre
 
		//panel=new JPanel();
 
		d=new Drawing(DEFAULT_WIDTH, DEFAULT_HEIGHT);
 
 
		//panel.setSize(200,200);
		//panel.setBackground(Color.black);
		//contentPane.add(panel);
		contentPane.add(d);
 
		//g=new grille();
		//contentPane.add(g);
 
		//Jusqu'ici, on a définit une Fenétre avec un panneau
 
		//Maintenant, on met la barre de menu
 
		mbar=new JMenuBar();
		b1=new JButton("Menu Fond");
 
		//JMenuItem m11 =new JMenuItem("Image Fond");
		//m11.addActionListener(this);
		//m1.add(m11);
		b1.addActionListener(this);
 
		b3=new JButton("Creer Carte");
		b3.addActionListener(this);
 
		/*JMenuItem m12 =new JMenuItem("Eau");
		m12.addActionListener(this);
		m1.add(m12);*/
 
 
		b2=new JButton("Niveau Suivant");
		//JMenuItem m21 =new JMenuItem("Bleu");
		//m21.addActionListener(this);
		//m2.add(mbar);
		b2.addActionListener(this);
 
		/*JMenuItem m22 =new JMenuItem("Vert");
		m22.addActionListener(this);
		m2.add(m22);*/
 
		mbar.add(b1);
		mbar.add(b2);
		mbar.add(b3);
 
		setJMenuBar(mbar);
 
		//grille=new Case[longueur][largeur];
 
		/*for(int i=0; i<longueur; i++)
		{
			for(int j=0; j<largeur; j++)
			{
				grille[i][j]=new Case();
			}
		}*/
 
	}
 
	/*public void Afficher()
	{
		for(int i=0; i<longueur; i++)
		{
			for(int j=0; j<largeur; j++)
			{
				grille[i][j].Afficher();
			}
		}
 
	}*/
 
	public void actionPerformed(ActionEvent evt)
	{
		//if(evt.getSource() instanceof JMenuItem)//permet de vérifier si une référence d'objet est une instance de la classe JMenuItem
		//{
     		String ChoixOption=evt.getActionCommand();
			if(ChoixOption.equals("Menu Fond")){
 
				//dessin d=new dessin(200, 200);
				//this.getContentPane().add(d);
				//a=1;
 
				d.reload();
 
				//repaint();
				//panel.setBackground(Color.yellow);
			}
			else if(ChoixOption.equals("Niveau Suivant"))
				{
				//dessin d=new dessin(200, 200);
				//this.getContentPane().add(d);
 
 
 
				//panel.setBackground(Color.pink);
				}
 
			else if(ChoixOption.equals("Creer Carte"))
			{
				JFrame it=new Item();
				it.setVisible(true);
			}
 
 
			/*else if(ChoixOption.equals("Blue"))
			{
				mbar.setBackground(Color.blue);
				//m1.setBackground(Color.blue);
				m2.setBackground(Color.blue);
 
			}
			else if(ChoixOption.equals("Vert"))
			{
				mbar.setBackground(Color.green);
				//m1.setBackground(Color.green);
				m2.setBackground(Color.green);
			}*/
		//}
	}
}
 
public class Main
{
	public static void main(String[] args)
	{
		JFrame f=new carte();
		f.setVisible(true);
	}
}