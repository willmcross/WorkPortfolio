package project4;



public class BinaryTree implements Treeable {
    
    private Node root;
    // public Node remove();
    
    public void display(boolean ascending) {
        if(ascending) {
            displayTreeLNR(root); // Display values in ascending order
        }
        else {
            displayTreeRNL(root); // Display values in descending order
        }
    }
    private void displayTreeLNR(Node node) { // Recursive method
        if(node != null) {
            displayTreeLNR(node.getLeftChild());
            System.out.print(node.getPrevious());
            displayTreeLNR(node.getRightChild());
        }
    }
    private void displayTreeRNL(Node node) { // Recursive method
        if(node != null) {
            displayTreeRNL(node.getRightChild());
            System.out.print(node.getPrevious());
            displayTreeRNL(node.getLeftChild());
        }
    }

    /**
     * Adds a State object to the appropriate location of the Binary Tree.
     * @param state The State object to add.
     */
    public void insert(Node state) {
        boolean inserted = false;
        Node temp = root;

        if(temp == null){
            root = state;
        }
        else {
            while(!inserted){
                if(state.getValue() < temp.getValue()) {
                    if(temp.getLeftChild() ==null) {
                        temp.setLeftChild(state);
                        inserted = true;
                    }
                    else {
                        temp = temp.getLeftChild();
                    }
                }
                else {
                    if(temp.getRightChild() == null) {
                        temp.setRightChild(state);
                        inserted = true;
                    }
                    else {
                        temp = temp.getRightChild();
                    }
                }
            }

        }
    }

    /**
     * Determines if the Binary Tree is empty.
     * @return True if the Binary Tree is empty; otherwise, false.
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Removes a State object with the specified population from the Binary Tree.
     * 
     * Note:  The isEmpty method should be called first to prevent errors.
     * @param population The population of the State to remove.
     * @return The State object that was removed.
     */
    public Node remove(int population) {
        boolean isLeftChild = false;
        Node parent = root, temp = root;

        // Determine how many children the node has and call the appropriate delete method
        if(temp.getLeftChild() == null && temp.getRightChild() == null) {
           deleteNoChildren(parent, isLeftChild); // See slide 25
        }
        else if(temp.getLeftChild() == null || temp.getRightChild() == null) {
           deleteSingleChild(parent, isLeftChild, temp); // See slides 26
        }
        else {
           deleteWithChildren(parent, isLeftChild, temp); // See slides 27
        }
        return temp;
    }
    
    // deleteNoChildren
    private void deleteNoChildren(Node parent, boolean parentsLeftChild) {
        if(parent == root && parent.getLeftChild() == null) {
           root = null;
        }
        else if(parentsLeftChild) {
           parent.setLeftChild(null);
        }
        else {
           parent.setRightChild(null);
        }
    }
    
    // deleteSingleChild
    private void deleteSingleChild(Node parent, boolean parentsLeftChild, Node temp) {
      if(temp.getLeftChild() == null) { // Determine which child exists
         if(parentsLeftChild) { // Determine path from parent deleted node is on
            parent.setLeftChild(temp.getRightChild()); // Update parent’s left pointer
         }
         else {
            parent.setRightChild(temp.getRightChild()); // Update parent’s right pointer
         }
      }
      else {
         if(parentsLeftChild) { // Determine path from parent deleted node is on
            parent.setLeftChild(temp.getLeftChild()); // Update parent’s left pointer
         }
         else {
            parent.setRightChild(temp.getLeftChild()); // Update parent’s right pointer
         }
      } 
    }
   
    // deleteWithChildren
    private void deleteWithChildren(Node parent, boolean parentsLeftChild, Node node) {
       Node lastNode = null;
	
       if(parentsLeftChild) { // If the node to delete is parent’s left child
           lastNode = node.getRightChild(); // Start with the node’s right child path
           while(lastNode.getLeftChild() != null) { // Find lowest left child on the path
               lastNode = lastNode.getLeftChild();
           }
           // Update the leftChild pointers of the parent node and the last node
           lastNode.setLeftChild(node.getLeftChild());
           parent.setLeftChild(node.getRightChild());
       }
       else { // If the node to delete is parent’s left child
           lastNode = node.getLeftChild(); // Start with the node’s left child path
           while(lastNode.getRightChild() != null) { // Find lowest right child on the path
               lastNode = lastNode.getRightChild();
           }
           // Update the rightChild pointers of the parent node and the last node
           lastNode.setRightChild(node.getRightChild());
           parent.setRightChild(node.getLeftChild());
       }
   }
   
    
    
    
}