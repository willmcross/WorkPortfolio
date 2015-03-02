
/**
 * Methods for the Player's Hand
 */

public abstract class PriorityQueue implements Queueable {
    public int maxSize;
    public int numElems = 0;
    public Card[] array;

    /* Instantiates new array */
    public PriorityQueue(int size) {
        array = new Card[size];
    }

    /* Facilitates drawing of card into Player's hand */
    public void insert (Card card) {
        array[numElems++] = card;
    }

    /* Tests to see if Player's hand is empty */
    public boolean isEmpty() {
        return numElems == 0;
    }

    /* Tests to see if Player's hand is full */
    public boolean isFull() {
        return numElems > array.length;
    }

    public Card peek() {
        Card card = null;
        if (!isEmpty()) {
            card = array[numElems];
        }
        return card;
    }

    /* Returns a card in Player's hand */
    public int peek(int position){
      int cardValue = 0;

      if(array[position] != null)
         cardValue = array[position].getValue();

      return cardValue;
    }

    /* Removes first card in Player's hand */
    public Card remove() {
        int minIndex = 0;
        Card min = array[0];

        for (int i=0; i < numElems; i++) {
            if (min.getValue() > array[i].getValue()) {
                minIndex =i;
                min = array[i];
            }
        }
        for (int i = minIndex; i < numElems; i++){
            array[i] = array[i+1];
        }
        numElems--;
        return min;
    }

    /* Removes a card in a certain position in Player's hand */
    public Card remove(int position){
        Card c = array[position];
        for (int i = position; i < numElems; i++){
            array[i] = array[i + 1];
        }
        numElems--;
        return c;
    }

    /**
     * Displays the States objects stored in the stack.
     */
    @Override
    public void displayQueue() {
        for (int x = numElems - 1; x >= 0; x--) {
            System.out.format("%s ", array[x]);
        }
        System.out.println();
    }
}
