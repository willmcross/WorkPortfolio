/*
 *  Project3 State.java
 *  Rachel Bennett, Waseem Beraz, Mike Cross, James Spinella
 */

package project4;

/*
    State - Contains methods for determing appropriate parameter and return types of States
 */

public class Node implements Linkable {
     private State state;
     private Node next;
     private Node previous;
     private Node leftChild;
     private Node rightChild;
     private int value;
    
    /**
     * Returns the current node's left child node. 
     * @return the current node's left child node.
     */
    public Node getLeftChild() {
        return leftChild;
    }
    
    /**
     * Returns the node to the right of the current node.
     * @return the node to the right of the current node.
     */
    public Node getNext() {
        return next;
    }
    
    /**
     * Returns the node to the left of the current node.
     * @return the node to the left of the current node.
     */
    public Node getPrevious() {
        return previous;
    }
    
    /**
     * Returns the current node's right child node. 
     * @return the current node's right child node.
     */
    public Node getRightChild() {
        return rightChild;
    }
    
    /**
     * Returns the state object stored in the current node.
     * @return the state object stored in the current node.
     */
    public State getState() {
        return state;
    }
    
    /**
     * Sets the current node's left child node.
	 * @param node the node to assign to the left child.
     */
    public void setLeftChild(Node node) {
        leftChild = node;
    }
    
    /**
     * Sets the next pointer to the node to the right of the current node.
     * @param node the node to assign to the next pointer.
     */
    public void setNext(Node node) {
        next = node;
    }
    
    /**
     * Sets the previous pointer to the node to the left of the current node.
     * @param node the node to assign to the previous pointer.
     */
    public void setPrevious(Node node) {
        previous = node;
    }
        
    /**
     * Sets the current node's right child node.
	 * @param node the node to assign to the right child.
     */
    public void setRightChild(Node node) {
        rightChild = node;
    }
    
    
    // Added methods that we aren't supposed to add!
    // But I'm not sure how else to compare item and temp, as seen in node, without
    // having a method that maintains the "current value" of the "currently-selected node"

    public int getValue() {
        return value;
    }

    
}
