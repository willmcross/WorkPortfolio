
/**
 * Methods for the Discard Pile
 */

public class Queue implements Queueable {

    private int maxSize;
    private int front;
    private int rear;
    private int numElems = 0;
    private Card[] array;

    /* Instantiates new array */
    public Queue (int size) {
        maxSize = size;
        array = new Card[maxSize];
        front = numElems;
        rear = -1;
    }


    /**
     * Displays the Card objects stored in the queue.
     */
    public void displayQueue() {
        for (int x = front; x <= rear; x++) {
            System.out.format("%s ", array[x]);
        }
        System.out.println();
    }

    public void insert(Card card) {
        rear++;
        array[rear] = card;
        numElems++;
    }

    /* Tests to see if Player's hand is empty */
    public boolean isEmpty() {
        return numElems == 0;

    }

    /* Tests to see if Discard Pile is full */
    public boolean isFull() {
        return numElems == maxSize;
    }

    /* Returns front card in Discard Pile */
    public Card peek()   {
        Card card = null;
        if(!isEmpty()){
            card = array[front];
        }
        return card;
    }

    /* Returns a card in Discard Pile */
    public int peek(int position)   {
        return array[position].getValue();
    }

    /* Removes first card in Discard Pile */
    public Card remove()    {
        Card card = null;
        if(!isEmpty()) {
            card = array[front++];
            }
            return array[front++];
    }
    /* Removes a card in a certain position in Discard Pile */
    public Card remove(int position)  {
        Card card = null;
        if(!isEmpty()){
            card = array[position];

            for (int x = position; x < rear; x++) {
                array[x] = array[x+1];
            }
            rear--;
        }
        return card;
    }
}
