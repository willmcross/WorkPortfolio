/*
 *  Project4 Stack.java
 *  Rachel Bennett, Waseem Beraz, Mike Cross, James Spinella
 */

package project4;

/*
    Stack - Provides the methods required to implement a stack as a linked-list.
 */

public class Stack implements Stackable{

    private Node front;

    /**
     * Displays the items stored in the Stack.
     */
    public void display() {
        Node node = front;
        while (node != null) {
            System.out.println(node.getState().toString());
            node = node.getNext();
        }
        System.out.println();
    }

    /**
     * Determines if the Stack is empty.
     *
     * @return True if the Stack is empty; otherwise, false.
     */
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * Determines if the Stack is full.
     *
     * @return True if the Stack is full; otherwise, false.
     */
    public boolean isFull() {
        // The list can never be full
        return false;
    }

    /**
     * Removes a item from the top of the Stack.
     *
     * Note: The isEmpty method should be called first to prevent errors.
     *
     * @return The item that was removed.
     */
    public Node pop() {
        Node temp = front;

        front = front.getNext();
        return temp;
    }

    /**
     * Adds a item to the top of the Stack.
     *
     * Note: The isFull method should be called first to prevent errors.
     *
     * @param item The item to add.
     */
    public void push(State item) {
        if (!isFull()) {
            Node temp = new Node(item);

            if (front != null) {
                temp.setNext(front);
            }
            front = temp;
        }
    }
}
