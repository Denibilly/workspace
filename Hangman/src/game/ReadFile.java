package game;

import java.util.*;
import java.io.*;



public class ReadFile {

	ArrayList<String> lines;
	
	public ReadFile(String p){
		try{
			BufferedReader reader = new BufferedReader(new FileReader(p));
			lines = new ArrayList<>();
			String line = null;
			while ((line = reader.readLine()) != null) {
			    lines.add(line.toLowerCase());
			}
			reader.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public String randomWord(){
		
		Random generator = new Random(); 
		int rand = generator.nextInt(lines.size()) + 1;
		
		return lines.get(rand);
	}
}
