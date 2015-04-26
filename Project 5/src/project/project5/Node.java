package project.project5;

/**
 * Project.java - Executes driver, etc.
 */

public class Node implements Linkable {
    
    private Node next;
    private State state;
    
    
    public Node(State state){
        this.state = state;
    }
       
    /**
     * Returns the node to the right of the current node.
     * @return the node to the right of the current node.
     */
    public Node getNext() {
       return next; 
    }

    /**
     * Returns the state object stored in the current node.
     * @return the state object stored in the current node.
     */
    public State getState() {
        return state;
    }

    /**
     * Sets the next pointer to the node to the right of the current node.
     * @param node the node to assign to the next pointer.
     */
    public void setNext(Node node) {
        this.next = next;
    }
}
