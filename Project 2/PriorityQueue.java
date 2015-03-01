package project2;

/**
 * Provides the methods for a priority queue of State objects.
 */
public abstract class PriorityQueue implements Queueable {
    public int maxSize;
    public int numElems = 0;
    public Card[] array;

    public PriorityQueue(int size) {
        array = new Card[size];
    }

    public void insert (Card card) {
        array[numElems++] = card;
    }

    public boolean isEmpty() {
        return numElems == 0;
    }

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
    
    /**
     * Displays the States objects stored in the stack.
     */
    @Override
    public void displayQueue() {
        for (int x = numElems - 1; x >= 0; x--) {
            System.out.format("%s ", array[x]);
        }
    }
}
