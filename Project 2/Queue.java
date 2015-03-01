package project2;

public class Queue implements Queueable {

    private int maxSize;
    private int front;
    private int rear;
    private int numElems;
    private Card[] array;

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
    }

    public void insert(Card card) {
        array[++rear] = card;
        numElems++;
    }

    public boolean isEmpty() {
        return numElems == 0;

    }

    public boolean isFull() {
        return numElems == maxSize;
    }

    public Card peek()   {
        Card card = null;
        if(!isEmpty()){
            card = array[front];
        }
        return card;
    }

    public int peek(int position)   {
        return array[position].getValue();
    }

    public Card remove()    {
        Card card = null;
        if(!isEmpty()) {
            card = array[front++];
            }
            return array[front++];
    }

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
