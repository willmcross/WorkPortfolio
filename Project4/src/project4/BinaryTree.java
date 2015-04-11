package project4;



public class BinaryTree implements Treeable {
    
    private Node root;
    
    
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

    public boolean isEmpty() {
        return root == null;
    }

    public Node remove(int population) {
        if (root == null) {
            //return false;
        } else {
            //return root.remove(population, null);
            }
        return null;
        }
    }

//
