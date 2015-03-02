/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Kanau
 */
public class Game {
    private Game Gameref;
    private Deck Deckref;
    private Player Player1;
    private Player Player2;
    private Player Player3;
    private Player Player4;
    public Player[] Playerlist;
    
    public Game(){
        // Gameref = new Game();
        Deckref = new Deck(52);
        Player1 = new Player(15, "Player 1", 0, this);
        Player2 = new Player(15, "Player 2", 1, this);
        Player3 = new Player(15, "Player 3", 2, this);
        Player4 = new Player(15, "Player 4", 3, this);
        Playerlist = new Player[4]; 
        Playerlist[0] = Player1; 
        Playerlist[1] = Player2; 
        Playerlist[2] = Player3;
        Playerlist[3] = Player4;
        execute(); 
}
 
        
    
    
    private void readFile (){
       
       File file = new File("CardsInput.txt");
       
       try {
       
         Scanner filereader = new Scanner(file);
         
        String line;
        Card temp;
	      // Add all lines from file to ArrayList.
	      while (filereader.hasNextInt()) {
                temp = new Card(filereader.nextInt());
                Deckref.push(temp);
         }
         
        
         Deckref.displayStack();
         
         filereader.close(); 
         }
         catch(FileNotFoundException e) {
            e.printStackTrace();    
	      }
      }

    public void execute(){
        boolean win = false;
        int rounds = 0;
        readFile();
        dealCards();
        while (win == false)  {
           if (Deckref.isEmpty() == true) {
               win = true;
           } else if ((Player1.isEmpty() == true) || (Player2.isEmpty() == true) ||(Player3.isEmpty() == true) ||(Player4.isEmpty() == true))  {
               win = true;
           }
           else {
               Playerlist[rounds%4].playHand();
               rounds++;  
           }
        }
       System.out.println("After " + rounds + " rounds\n");
       Player1.display();
       Player2.display();
       Player3.display();
       Player4.display(); 
       Deckref.displayStack();      
    }
    
    
    public Deck getDeck(){
        return this.Deckref;
    }
    
    public int getPlayer(int Player) {
      return Player1.getPosition();
    }
    
    
    private void dealCards() {
      for (int i = 0; i < 7; i++) {
         Player1.drawCard();
         Player2.drawCard();
         Player3.drawCard();
         Player4.drawCard();
      }
    }
    
    private void Display () {
        Player1.display();
        Player2.display();
        Player3.display();
        Player4.display();
    }
    
    private void playGame () {
        
    }  
    
   
    
    
}
