import java.awt.*;
import java.awt.event.*;
 
import javax.swing.*;
 
 
public class Item extends JFrame implements ItemListener
{
 
	static final long serialVersionUID = 4;
	Checkbox arbre;
	Checkbox sable;
	Checkbox pont;
	Checkbox serpent;
 
	carteEditeur ce;
	Container contentPane=getContentPane();
 
	public Item()
	{
		super("Choix Item");
		setDefaultCloseOperation(Item.EXIT_ON_CLOSE);
		setSize(250, 250);
 
		contentPane.setLayout(new FlowLayout());
 
		arbre= new Checkbox("arbre", false);
		sable= new Checkbox("sable", false);
		pont= new Checkbox("pont", false);
		serpent= new Checkbox("serpent", false);
 
		System.out.println("1");
 
		contentPane.add(arbre);
		contentPane.add(sable);
		contentPane.add(pont);
		contentPane.add(serpent);
 
		System.out.println("1");
 
		arbre.addItemListener(this);
		sable.addItemListener(this);
		pont.addItemListener(this);
		serpent.addItemListener(this);
 
		System.out.println("1");
	}
 
	public  void itemStateChanged(ItemEvent evt) 
	{	
		String s = (String) (evt.getItem());
 
		if(s!=null){
		if(s == "arbre")
		{
 
		    ce.editCarte();
 
		}
 
		if(s == "sable")
		{
			System.out.println("1");
		}
 
		if(s == "pont")
		{
			System.out.println("1");
		}
		if(s == "serpent")
		{
			System.out.println("1");
		}
		}
		else{
			System.out.println("1");
		}
 
	}
 
}