
/**
 * Methods for translating ints to card values
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
