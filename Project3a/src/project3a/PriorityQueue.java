/*
 *  Project3 PriorityQueue.java
 *  Rachel Bennett, Waseem Beraz, Mike Cross, James Spinella
 */

package project3a;

/*
    PriorityQueue - Implements Queueable; provides methods for displaying and managing queue & State objects in queue
 */

public class PriorityQueue implements Queueable {

    private Node front;
    private Node rear;

    /**
     * Displays the items stored in the queue.
     */
    public void display() {

        Node node = rear;
        while (node != null) {
            System.out.println(node.getState().toString());
            node = node.getPrevious();
        }
    }

    /**
     * Displays the items in the queue from front to rear.
     */
    public void frontDisplay() {
        Node node = front;
        while (node != null) {
            System.out.println(node.getState().toString());
            node = node.getNext();

        }
        System.out.println();
    }

    /**
     * Adds a State object to the appropriate location of the queue.
     *
     * Note: The isFull method should be called first to prevent errors.
     *
     * @param state The State to add.
     */
    public void insert(State state) {
        if (!isFull()) {
            Node temp = new Node(state);

            if (front == null) { // if list is empty
                front = temp;
                rear = temp;
            } else {
                boolean foundLocation = false;
                Node searching = front;
                while (foundLocation == false) {
                    boolean comparison = temp.getState().getName().compareTo(searching.getState().getName()) < 0;
                    if (comparison && searching.getNext() != null) { // when there's another element to be addressed
                        searching = searching.getNext();
                    } else if (!comparison && searching == front) { // when it's first element
                        searching.setPrevious(temp);
                        temp.setNext(searching);
                        front = temp;
                        foundLocation = true;
                    } else if (comparison && searching.getNext() == null) { // else when at the end of the list
                        searching.setNext(temp);
                        temp.setPrevious(searching);
                        rear = temp;
                        foundLocation = true;
                    } else { // else when match is found
                        temp.setNext(searching);
                        temp.setPrevious(searching.getPrevious());
                        searching.getPrevious().setNext(temp);
                        searching.setPrevious(temp);

                        foundLocation = true;
                    }
                }
            }
        }
    }

    /**
     * Determines if the queue is empty.
     *
     * @return True if the queue is empty; otherwise, false.
     */
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * Determines if the queue is full.
     *
     * @return True if the queue is full; otherwise, false.
     */
    public boolean isFull() {
        // The list can never be full
        return false;
    }

    /**
     * Displays the items in the queue from rear to front.
     */
    public void rearDisplay() {
        Node node = rear;
        while (node != null) {
            System.out.println(node.getState().toString());
            node = node.getPrevious();
        }
        System.out.println();
    }

    /**
     * Removes a State object from the front of the queue.
     *
     * Note: The isEmpty method should be called first to prevent errors.
     *
     * @return The State object that was removed.
     */
    public State remove() {
        State temp = null;
        if (!isEmpty()) {
            temp = front.getState();
            front = front.getNext();
        }
        return temp;
    }

    /**
     * Removes a State object from the queue.
     *
     * Note: The isEmpty method should be called first to prevent errors.
     *
     * @param itemName The name of the State object to search for and remove.
     * @return The State object that was removed.
     */
    public State remove(String itemName) {
        State temp = null;
        if (!isEmpty()) { // isEmpty method
            boolean foundLocation = false;
            Node searching = front;
            while (foundLocation == false) {
                if (searching == null) {
                    foundLocation = true;
                } else if (itemName.compareTo(searching.getState().getName()) != 0) { // compares elements
                    searching = searching.getNext();
                } else { // when a match is found
                    temp = searching.getState();
                    foundLocation = true;
                    if (searching == front && searching == rear) {
                        front = null;
                    } else if (searching == front) {
                        front = searching.getNext();
                        front.setPrevious(null);
                    } else if (searching == rear) {
                        rear = searching.getPrevious();
                        rear.setNext(null);
                    } else {
                        searching.getPrevious().setNext(searching.getNext());
                        searching.getNext().setPrevious(searching.getPrevious());
                    }
                }
            }
        }
        return temp;
    }
}
