package project2;

/**
 * Provides the methods for a priority queue of State objects.
 */
public abstract class PriorityQueue implements Queueable {
    
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
