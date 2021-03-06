package game;

import java.awt.*;
import java.io.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Animation{
	
	static final long serialVersionUID = 0;
	
	private ArrayList<BufferedImage> imgs;
	private BufferedImage pendu = null;
	
	
	public Animation(){
		createImages(pendu);
	}
	
	public ArrayList<BufferedImage> getImages(){
		return imgs;
	}
	
	public void createImages(Image im){
		
		BufferedImage temp;
		
		try{
			pendu = ImageIO.read(new File("pendu.jpg"));
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		for(int j=0; j<3; j++){
			for(int i=0; i<4; i++){
				temp = pendu.getSubimage(160*i,160*j, 160, 160);
				imgs.add(i+j, temp);
			}
		}
	}
}




