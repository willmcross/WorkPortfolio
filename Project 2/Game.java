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
    
    
   
    public int top = -1;
    private int[] Deckcoll;
    private int[] Playercoll;
        
    
    
    private void readFile () {
        try {	
        
        BufferedReader reader = new BufferedReader(new FileReader(
		"C:\\Cards.Input.txt"));


	// Add all lines from file to ArrayList.
	while (!(line = reader.readLine()).equals("")) {

	    Deckcoll.add(new CardData.card());
	}

	// Close it.
	reader.close();
        
        } catch (e){
            
        }
    }

 
    public void execute() {
        Deck Deckcoll = new Deck[52];
        Player Playercoll = new Player[14];
    }
    
    
    public int getDeck(){
        return this.Deckcoll[0];
    }
    
    public int getPlayer() {
        return this.Playercoll[0];
    }
    
    
    private int dealCards (int numCards) {
        
        ;
       return Deckcoll[--top];
    }
    
    private void Display () {
        // This part is fuzzy, I need to ask littleton what he means by this function.
    }
    
    private void playGame () {
        
        
        
    }  
    
    
    
    
}
