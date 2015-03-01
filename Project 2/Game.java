/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Kanau
 */
public class Game {
    
    Game Gameref = new Game();
    Deck Deckref = new Deck(52);
    public int top = -1;
    Player Player1 = new Player(15, "Player 1", 0, this.Gameref);
    Player Player2 = new Player(15, "Player 2", 1, this.Gameref);
    Player Player3 = new Player(15, "Player 3", 2, this.Gameref);
    Player Player4 = new Player(15, "Player 4", 3, this.Gameref);
    Player[] Playerlist = {Player1, Player2, Player3, Player4};
 
        
    
    
    private void readFile () throws FileNotFoundException, IOException {
       
        
        BufferedReader reader = new BufferedReader(new FileReader(
		"C:\\Cards.Input.txt"));

        String line;
        Card temp;
	// Add all lines from file to ArrayList.
	while (!(line = reader.readLine()).equals("")) {
                temp = new Card(Integer.parseInt(line));
                    Deckref.push(temp);
	}

	// Close it.
	reader.close();
        
    }

    public void execute() throws IOException {
        readFile();
        dealCards(1);
        
           }
    
    
    public Deck getDeck(){
        return this.Deckref;
    }
    
    public int getPlayer(int Player) {
      return Player1.getPosition();
                }
    
    
    private int dealCards (int numCards) {
      Deckref.pop();
       return numCards;
    }
    
    private void Display () {
        Player1.displayHand();
        Player2.displayHand();
        Player3.displayHand();
        Player4.displayHand();
    }
    
    private void playGame () {
        
    }  
    
   
    
    
}
