package project4;



public class BinaryTree implements Treeable {
    
    private Node root;
    // public Node remove();
    private Node temp;
    private Node prev;
    private Node next;
    private Node old;
    
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

    public void insert(Node item) {
        boolean inserted = false;
        Node temp = root;

        if(temp == null){
            root = item;
        }
        else {
            while(!inserted){
                if(item.getValue() < temp.getValue()) {
                    if(temp.getLeftChild() ==null) {
                        temp.setLeftChild(item);
                        inserted = true;
                    }
                    else {
                        temp = temp.getLeftChild();
                    }
                }
                else {
                    if(temp.getRightChild() == null) {
                        temp.setRightChild(item);
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
        prev = root.getPrevious();
        next = root.getNext();
        old = root;
        root = prev;
        return old;
    }
}