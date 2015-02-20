/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

/**
 *
 * @author RachelBennett
 */
public class Player extends PriorityQueue {
    
    //reference q represents player's hand
    private Queue q = new Queue();
    private String name;
    private int position;
    //instance of game, tells player what game they're playing
    private Game game;
    
    //constructor, creates specific player objects, properties
    public Player(int size, String name, int position, Game game){
        super(size);
        this.name = name;
        this.position = position;
        this.game = game;
    }
    //displays player's name, cards in hand and in discard pile
    public void display(){
        System.out.println(name + "\n" + displayHand() + "\n" + q.displayHand());
    }
    //determines if player is holding specified type of card in hand
    //if so, one card is returned, otherwise, null is returned
    public Card doYouHaveAny(int card){ //int card is number player is looking for
        Card c = null; //object of card class
        
        for (int i = 0; i < 15; i++){
            if (peek(i) != null && peek(i) == card){
                c = remove(i);
            }
        }
        return c;
    }
    //returns player's position (a number between 0 and 3)
    public int getPosition(){
        return position;
    }
    //performs operations required to play a round (in game rules section)
    public playHand(){
        int pos;
        Card min;
        int minimum = 0;
        int position = 0;
        boolean found = false;
   
        matchCards();
        minimum = peek(0);
        for (int i = 1; i < 15; i++){
            if (peek(i) != null && minimum > peek(i)){
                minimum = peek(i);
                position = i;
            }
        }
        pos = position + 1;
        while (pos != position && found == false){
            if (pos == 4){
                pos = 1;
            }
            Player next = array[pos];
            min = next.doYouHaveAny(minimum);
            if (min != null){
                insert (min);
                found = true;
                matchCards();
            }
            pos++;
        }
        if (found == false){
            drawCard();
            matchCards();
        }
        
    }
    //stores specified card into player's discard pile
    private void discard(Card card){
        q.insert(card);
    }
    //displays cards in player's hand
    private void displayHand(){
        //part of priority queue, parent class
        displayQueue();
    }
    //displays cards in player's discard pile
    private void displayPile(){
        //part of queue, referenced by q
        q.displayQueue();
    }
    //draws a card from the deck of cards (the deck object)
    private void drawCard(){
        Deck d = game.getDeck();
        //pop card from deck and insert into player hand
        insert(d.pop());
    }
    //determines player in next higher position
    private Player getNextPlayer(Player currentPlayer){
        int pos = currentPlayer.getPosition();
        
        if (pos == 3){
            pos = 0;
        }
        //accesses array that stores player objects
        return game.array[pos + 1];
    }
    //searches player's hand for matching pairs of cards
    //if match is found, pair of cards discarded into discard pile
    private void matchCards(){
        for (int i = 0; i < 15; i++){
            for (int j = 0; j < 15; j++){
                //peek i is value at location
                if (peek(i) != null && peek(j) != null && peek(i) == peek(j) && i != j){
                    //removes cards and stores them in discard pile
                    discard(remove(i));
                    discard(remove(j));
                }
            }
        }
    }
}
