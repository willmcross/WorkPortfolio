/*
 *  Project3 Node.java
 *  Rachel Bennett, Waseem Beraz, Mike Cross, James Spinella
 */

package project3a;

/*
    Project3 - Implements Linkable, provides methods for managing nodes
 */

public class Node implements Linkable {
    
    private State state;
    private Node next;
    private Node previous;

    public Node(State state) {
        this.state = state;
    }

    /**
     * Returns the node to the right of the current node.
     *
     * @return the node to the right of the current node.
     */
    public Node getNext() {
        return next;
    }

    /**
     * Returns the node to the left of the current node.
     *
     * @return the node to the left of the current node.
     */
    public Node getPrevious() {
        return previous;
    }

    /**
     * Returns the State object stored in the current node.
     *
     * @return the State object stored in the current node.
     */
    public State getState() {
        return state;
    }

    /**
     * Returns the node containing the specified name.
     *
     * @param stateName The name to search for.
     * @param node The node to start searching from.
     * @return the node containing the specified name.
     */
    public Node searchNodes(String stateName, Node node) {
        while (!(node.getState().getName().equals(state.getName())) && !(node.getNext() == null)) {
            node = node.getNext();
        }
        return node;
    }

    /**
     * Sets the next pointer to the node to the right of the current node.
     *
     * @param node the node to assign to the next pointer.
     */
    public void setNext(Node node) {
        next = node;
    }

    /**
     * Sets the previous pointer to the node to the left of the current node.
     *
     * @param node the node to assign to the previous pointer.
     */
    public void setPrevious(Node node) {
        previous = node;
    }

    /**
     * Returns a formatted string containing the State data.
     *
     * @return a formatted string containing the State data.
     */
    public String toString() {
        return state.toString();
    }
}


