/*
 *  Project4 Stack.java
 *  Rachel Bennett, Waseem Beraz, Mike Cross, James Spinella
 */

package project4;

/*
    Stack - Provides the methods required to implement a stack as a linked-list.
 */

public class Stack implements Stackable {
    
// Linked List declaration
    private Node front;
    //private Node temp = new Node();
    
    /**
     * Displays the items stored in the stack.
     */
    public void display() {
        Node node = front;
        while (node != null) {
            System.out.println(node.getState().toString());
            node = node.getNext();
        }
        //System.out.println();
    }

    /**
     * Determines if the stack is empty.
     * @return True if the stack is empty; otherwise, false.
     */
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * Determines if the stack is full.
     * @return True if the stack is full; otherwise, false.
     */
    public boolean isFull() {
        // The list can never be full
        return false;
    }

    /**
     * Removes a item from the top of the stack.
     * 
     * Note:  The isEmpty method should be called first to prevent errors.
     * @return The item that was removed.
     */
    public Node pop() {
        //Node temp = front;
        //front = front.getNext();
        //return temp.getState();
        isEmpty();
        Node temp = front;
        front = temp.getNext();
        return temp;
    }

    /**
     * Adds a item to the top of the stack.
     * 
     * Note:  The isFull method should be called first to prevent errors.
     * @param item The item to add.
     */
    
    public void push(Node item) {
        if (!isFull()) {
            Node temp = item;

            if (front == null) {
                front = temp;
            } else {
                temp.setNext(front);
            }
            front = temp;
        }
    }
}

