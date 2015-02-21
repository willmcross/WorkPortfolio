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
public class Card  extends CardData {
    
    CardData foo = new Card();
    
    public String getFace(){
        return this.face;
    }
            
    public int getValue () {
        return this.value;
    }        
    
    
    @Override
    public void toString () {
        this.face.toString();
        this.value.toString();
    }
    
}
