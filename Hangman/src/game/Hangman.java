package game;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;

public class Hangman extends JFrame{
 
	static final long serialVersionUID = 0;
	
	public static void main(String[] args) throws IOException{
	
		Hangman hg = new Hangman();
		hg.start();
		
		/*
		ReadFile file = new ReadFile("C:\\Java\\dico.txt");
		String word = file.randomWord();
		MysteryWord m = new MysteryWord(word, 8);
		Scanner inputReader = new Scanner(System.in);
		
		while(!m.end()){
			m.guess(inputReader);
		}
		
		if(m.getTries()==0)
			System.out.println("Vous avez perdu!!");
		else
			System.out.println("Vous avez gagne!!");
		
		System.out.println("Le mot etait : "+word.toUpperCase());
		
		
		inputReader.close();
		*/	
	}
	
	public void start(){
		ReadFile file = new ReadFile("C:\\Java\\dico.txt");
		String word = file.randomWord();
		MysteryWord m = new MysteryWord(word, 8);
		
		// Graphics
		HangmanG panel = new HangmanG(m);
		this.add(panel);
		
		/*
		Interaction inter = new Interaction(panel);
		this.addKeyListener(inter);
		*/
		setVisible(true);
		setSize(panel.getHeight(), panel.getWidth());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}



