package project2;

public class Queue implements Queueable {

    private int maxSize;
    private int front;
    private int rear;
    private int numElems;
    private int[] array;

    public Queue (int size) {
        maxSize = size;
        array = new int[maxSize];
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
        array[++rear] = value;
        numElems++;
    }

    public boolean isEmpty() {
        return numElems == 0;

    }

    public boolean isFull() {
        return numElems == maxSize;
    }

    public int peek()   {
        return Card.position;
    }

    public int peek(int position)   {
        while(!isFull())    {
            return Card.position;
        }
    }

    public Card remove()    {
      numElems--;
      return array[front++];
    }

    public Card remove(int position)  {

    }
}
