import java.awt.*;
import javax.swing.*;
 
 
public class Square extends JPanel
{
	static final long serialVersionUID = 2;
	Image i;
 
	public static int TailleImage;
 
	protected boolean franchissable;
	protected boolean visible;
 
	protected String image;
	protected String combinaison;
 
	public Square()
	{
		franchissable=true;
		visible=false;
 
		System.out.println("1");
 
		Toolkit tk = Toolkit.getDefaultToolkit();
		i = tk.getImage("s.jpg");
		//repaint();
 
		TailleImage=i.getHeight(this);
	}
 
	//Permet de savoir si une case est franchissable
 
	public boolean isFranchissable()
	{
		return this.franchissable;
	}
 
	public void setFranchissable( boolean value)
	{
		if (this.franchissable!=value)
		{
			franchissable=value;
		}
	}
 
	// Permet de savoir si une case est visible
 
	public boolean isVisible()
	{
		return this.visible;
	}
 
	public void setVisible(boolean value)
	{
		if(this.visible!=value)
		{
			visible=value;
		}
	}
 
	//Récup l'image et lui donne une nouvelle valeur
 
	public String getImage()
	{
		return image;
	}
 
	public void setImage(String value)
	{
		if(this.image!=value)
		{
			image=value;
		}
	}
 
	//Récup et donne une nouvelle combinaison à la case
 
	public String getCombinaison()
	{
		return combinaison;
	}
 
	public void setCombinaison(String value)
	{
		if(this.combinaison!=value)
		{
			combinaison=value;
		}
	}
 
	public void Afficher()
	{
		if(isVisible()==true)
		{
			Toolkit tk = Toolkit.getDefaultToolkit();
			i = tk.getImage("image");
			repaint();
		}
	}
 
 
	public void paint(Graphics g, int _x, int _y)
	{
		if(this.visible==true)
		{
			if(i!=null)
			{
				g.drawImage(i, _x, _y, null);
			}
		}
	}	
}