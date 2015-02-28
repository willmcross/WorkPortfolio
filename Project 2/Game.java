/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Kanau
 */
public class Game {
    
    Game Gameref = new Game();
    Deck Deckref = new Deck();
    public int top = -1;
    Player Player1 = new Player(15, "Player 1", 0, this.Gameref);
    Player Player2 = new Player(15, "Player 1", 1, this.Gameref);
    Player Player3 = new Player(15, "Player 1", 2, this.Gameref);
    Player Player4 = new Player(15, "Player 1", 3, this.Gameref);
    Player[] Playerlist = {Player1, Player2, Player3, Player4};
 
        
    
    
    private void readFile () throws FileNotFoundException {

        
        BufferedReader reader = new BufferedReader(new FileReader(
		"C:\\Cards.Input.txt"));

        String line;
	// Add all lines from file to ArrayList.
	while (!(line = reader.readLine()).equals("")) {

	    Deck.add(new String(line));
	}

	// Close it.
	reader.close();
        
    }

    public void execute() {
        dealCards(1);
           }
    
    
    public int getDeck(){
        return this.Deckref;
    }
    
    public int getPlayer(int Player) {
        
        return Player[x];
    }
    
    
    private int dealCards (int numCards) {
      numCards = Deckref.Deck(top);        
       return numCards;
    }
    
    private void Display () {
        Player1.displayHand();
        Player2.displayHand();
        Player3.displayHand();
        Player4.displayHand();
    }
    
    private void playGame () {
        
        while (Player)
        
    }  
    
   
    
    
}
