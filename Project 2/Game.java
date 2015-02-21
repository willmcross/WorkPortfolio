/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Kanau
 */
public class Game {
    
    public int top = -1;
    private int[] Deckcoll;
    private int[] Playercoll;
    
    
    private void readFile () {
        	
        
        BufferedReader reader = new BufferedReader(new FileReader(
		"C:\\Cards.Input.txt"));


        String line;
	// Add all lines from file to ArrayList.
	while (!(line = reader.readLine()).equals("")) {

	    Deckcoll.add(new Card(line));
	}

	// Close it.
	reader.close();
    }
    
    
    
    public void execute() {
        Deck Deckcoll = new Deck();
        Player Playercoll = new Player();
    }
    
    
    public int getDeck(){
        return this.Deck;
    }
    
    public int getPlayer() {
        return this.Player;
    }
    
    
    private int dealCards (int numCards) {
        
        Deckcoll = new int [numCards];
       return Deckcoll[--top];
    }
    
    private void Display () {
        // This part is fuzzy, I need to ask littleton what he means by this function.
    }
    
    private void playGame () {
        
        
        
    }  
    
    
    
    
}
