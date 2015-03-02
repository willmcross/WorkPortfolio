/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kanau
 */
public class Card extends CardData {  
    
     public Card (int value) {
        generateFace(value);
        generateSuit(value, false);
    }
    
    
    public String getFace(){
        return face;
    }
            
    public int getValue () {
        return value;
    }        
    
    
    public String toString () {
        String card = value + face;
        return card;   
    }
    
    
}
