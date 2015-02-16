/**
 * Provides the methods for a priority queue of State objects.
 */
public abstract class PriorityQueue implements Queueable {
    private int maxSize;
    private int numElems = 0;
    private int[] array;

    public PriorityQueue(int size) {
        maxSize = size;
        array = new int [maxSize];
    }

    public void insert (int item) {
        int x;

        if (numElems == 0) {
            array[numElems++] = item;
        }
        else {
            x = numElems;
            while(x > 0 && item > array[x - 1]) {
                array[x] = array[x - 1];
                x--;
            }
            array[x] = item
                    numElems++;
        }
    }

    public boolean isEmpty() {
        return numElems == 0;
    }

    public boolean isFull() {
        return numELems == maxSize;
    }

    public int remove() {
        return array[-- numElems];
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
