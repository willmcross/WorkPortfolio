package project2;

public class Queue implements Queueable {
    
    /**
     * Displays the Card objects stored in the queue.
     */
    @Override
    public void displayQueue() {
        for (int x = front; x <= rear; x++) {
            System.out.format("%s ", array[x]);
        }
    }
}
