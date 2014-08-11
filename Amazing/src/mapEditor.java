import java.awt.Image;
 
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
 
import javax.swing.*;
 
 
class carteEditeur extends JFrame //implements MouseListener, MouseMotionListener
{
 
	static final long serialVersionUID = 3;
	Image i;
	Drawing d;
	Square c;
	//String[] items= new String[]{"arbre","Pont","Terre","Herbe"};
	String image;
 
	public void editCarte()
	{
    	this.addMouseListener( new MouseListener() 
		{
    		public void mouseClicked(MouseEvent arg0) {
    			// TODO Auto-generated method stub
 
    		}
 
 
    		public void mouseEntered(MouseEvent arg0) {
    			// TODO Auto-generated method stub
 
    		}
 
 
    		public void mouseExited(MouseEvent arg0) {
    			// TODO Auto-generated method stub
 
    		}
 
 
    		public void mousePressed(MouseEvent arg0) {
    			// TODO Auto-generated method stub
 
    		}
 
 
    		public void mouseReleased(MouseEvent arg0) {
    			// TODO Auto-generated method stub
 
 
    		}
		});
 
		this.addMouseMotionListener( new MouseMotionListener() 
		{
			public void mouseDragged(MouseEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("1");
				c=new Square();
			}
 
 
			public void mouseMoved(MouseEvent arg0) {
				// TODO Auto-generated method stub
 
			}
		});
 
	}	
}