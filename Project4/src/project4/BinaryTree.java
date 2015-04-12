/*
 *  Project4 BinaryTree.java
 *  Rachel Bennett, Waseem Beraz, Mike Cross, James Spinella
 */

package project4;

/*
    BinaryTree - Defines the properties and methods of a binary tree
 */

public class BinaryTree implements Treeable {

    private Node root;
    
    /********************/
    /* Delete Scenarios */
    /********************/ 
    private void deleteNoChildren(Node parent, boolean leftChild) {
        if (parent == root && parent.getLeftChild() == null) {
            root = null;
        } else if (leftChild) {
            parent.setLeftChild(null);
        } else {
            parent.setRightChild(null);
        }

    }

    private void deleteSingleChild(Node parent, boolean leftChild, Node temp) {
        if (temp.getLeftChild() == null) { // Determine which child exists
            if (leftChild) { // Determine path from parent deleted node is on
                parent.setLeftChild(temp.getRightChild()); // Update parent’s left pointer
            } else {
                parent.setRightChild(temp.getRightChild()); // Update parent’s right pointer
            }
        } else {
            if (leftChild) { // Determine path from parent deleted node is on
                parent.setLeftChild(temp.getLeftChild()); // Update parent’s left pointer
            } else {
                parent.setRightChild(temp.getLeftChild()); // Update parent’s right pointer
            }
        }

    }

    private void deleteWithChildren(Node parent, boolean leftChild, Node temp) {
        Node lastNode;

        if (leftChild) { // If the node to delete is parent’s left child
            lastNode = temp.getRightChild(); // Start with the node’s right child path
            while (lastNode.getLeftChild() != null) { // Find lowest left child on the path
                lastNode = lastNode.getLeftChild();
            }
            // Update the leftChild pointers of the parent node and the last node
            lastNode.setLeftChild(temp.getLeftChild());
            parent.setLeftChild(temp.getRightChild());
        } else { // If the node to delete is parent’s left child
            lastNode = temp.getLeftChild(); // Start with the node’s left child path
            while (lastNode.getRightChild() != null) { // Find lowest right child on the path
                lastNode = lastNode.getRightChild();
            }
            // Update the rightChild pointers of the parent node and the last node
            lastNode.setRightChild(temp.getRightChild());
            parent.setRightChild(temp.getLeftChild());
        }

    }

    
    /*********************/
    /* Interface Methods */
    /*********************/
    
    /**
     * Displays the State objects stored in the Binary Tree.
     *
     * @param ascending True if State objects ordered from smallest to largest;
     * otherwise, from largest to smallest.
     */
    public void display(boolean ascending) {
        if (ascending) {
            displayTreeLNR(root); // Display values in ascending order
        } else {
            displayTreeRNL(root); // Display values in descending order
        }

    }

    private void displayTreeLNR(Node node) { 
        if (node != null) {
            displayTreeLNR(node.getLeftChild());
            System.out.println(node.getState());
            displayTreeLNR(node.getRightChild());
        }

    }

    private void displayTreeRNL(Node node) {
        if (node != null) {
            displayTreeRNL(node.getRightChild());
            System.out.println(node.getState());
            displayTreeRNL(node.getLeftChild());
        }
    }

    /**
     * Adds a State object to the appropriate location of the Binary Tree.
     *
     * @param state The State object to add.
     */
    public void insert(Node item) {
        if (root == null) {
            root = item;
        } else {
            insert(root, item);
        }
    }

    private void insert(Node current, Node node) {
    if(current.getState().getPopulation() < node.getState().getPopulation()) {
        if (current.getLeftChild() == null) {
            current.setLeftChild(node);
        } else {
            insert(current.getLeftChild(), node);
        }
    } else {

        if (current.getRightChild() == null) {
            current.setRightChild(node);
        } else {
            insert(current.getRightChild(), node);
        }
    }
    }

    /**
     * Determines if the Binary Tree is empty.
     *
     * @return True if the Binary Tree is empty; otherwise, false.
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Removes a State object with the specified population from the Binary
     * Tree.
     *
     * Note: The isEmpty method should be called first to prevent errors.
     *
     * @param population The population of the State to remove.
     * @return The State object that was removed.
     */
    public Node remove(int population) {
        boolean found = false, isLeftChild = false;
        Node parent = root, temp = root;

        while (!found) { // Search the tree for the specified node
            if (population == temp.getState().getPopulation()) { // Once the node to delete is found
                found = true;
                // Determine how many children the node has and call the appropriate delete method
                if (temp.getLeftChild() == null && temp.getRightChild() == null) {
                    deleteNoChildren(parent, isLeftChild); // See slide 25
                } else if (temp.getLeftChild() == null || temp.getRightChild() == null) {
                    deleteSingleChild(parent, isLeftChild, temp); // See slides 26
                } else {
                    deleteWithChildren(parent, isLeftChild, temp); // See slides 27
                }
            } else { // Go to the next node
                parent = temp;
                if (population > temp.getState().getPopulation()) {
                    isLeftChild = true;
                    temp = temp.getLeftChild();
                } else {
                    isLeftChild = false;
                    temp = temp.getRightChild();
                }
            }
        }
        return temp;
    }
}