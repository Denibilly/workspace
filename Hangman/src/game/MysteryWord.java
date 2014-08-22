package game;

import java.util.*;

public class MysteryWord {
	
	String word;
	TreeSet<String> alphabet;
	int tries;
	
	public MysteryWord(String w, int t){
		word = w;
		alphabet = new TreeSet<String>();
		tries = t;
	}
	
	public int getTries(){
		return tries;
	}
	
	public void displayGame(){
		
		// DEBUG
		//System.out.println("\nDEBUG - le mot est:"+word+"\n");
		// DEBUG
		
		for(int i=0; i<word.length(); i++){
			String s = word.charAt(i)+"";
			if(alphabet.contains(s)){
				System.out.print(" "+s.toUpperCase());	
			}
			else
				System.out.print(" _");
		}
		System.out.println("\n\nIl vous reste "+tries+" essais. Une lettre?");		
	}
	
	public void displayTries(){
		System.out.println("\nLettres jouees :");
		for (Iterator<String> it = alphabet.iterator(); it.hasNext(); ) {
	        String f = it.next();
	        System.out.print(f.toUpperCase()+"-");
	    }
		System.out.println("\n");
	}
	
	public void guess(Scanner inputReader){
		
		String input="";
				
		while(input.length() > 1 || input == ""){
			displayTries();
			displayGame();
			inputReader = new Scanner(System.in);
			input = inputReader.nextLine();
		}
		
		if(alphabet.contains(input)){
			System.out.println("Vous avez deja essaye cette lettre. \n");
		}
		else if(word.toLowerCase().contains(input)){
			System.out.println("Vous avez trouve une lettre, bien joue! \n");
			alphabet.add(input);
		}
		else{
			System.out.println("Essaye encore! \n");
			alphabet.add(input);
			tries--;
		}
	}
	
	public boolean end(){
		if(tries==0)
			return true;
		for(int i=0; i< word.length(); i++){
			if(!alphabet.contains( word.charAt(i)+"") )
				return false;
		}
		return true;
		
	}

}
