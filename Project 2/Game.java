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

    private Deck[] Deckcoll = new Deck[52];
    private Player[] Playercoll = new Player[15];
    
    
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
    
    
    public Deck getDeck(){
        return ;
    }
    
    public Player getPlayer() {
        return ;
    }
    
    
    private void dealCards (int numCards) {
        // Pass a card from Deckcoll to Playercoll. No clue how.
    }
    
    private void Display () {
        // This part is fuzzy, I need to ask littleton what he means by this function.
    }
    
    private void playGame () {
        //Initialize game, mostly logic and busywork / math. Probably can do.
    }
    
    
    
    
    
    
}
