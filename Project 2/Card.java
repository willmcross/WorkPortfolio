/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author Kanau
 */
public class Card extends CardData {
   
    
    
    Card foo = new Card(value);
    
     Card (int value) {
        foo.generateFace(value);
        foo.generateSuit(value, true);
}
    
    
    public String getFace(){
        return foo.face;
    }
            
    public int getValue () {
        return foo.value;
    }        
    
    
    public String toString () {
        foo.face.toString();
        Integer.toString(foo.value);
        return foo.toString();    
    }
    
    
}
