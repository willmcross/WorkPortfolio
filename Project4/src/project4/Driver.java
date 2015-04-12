/*
 *  Project3 State.java
 *  Rachel Bennett, Waseem Beraz, Mike Cross, James Spinella
 */

package project4;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    State - Contains methods for determing appropriate parameter and return types of States
 */

public class Driver {
    
    Stack stack = new Stack();
    BinaryTree bTree = new BinaryTree();
    // Integer array to hold 17 values
    int[] array = new int[17];
        
    void execute(String[] args) { 
        
    
    readInputFiles("States.Input.A.txt", "States.Input.B.txt");     
        
    /********************/     
    /** Console Output **/
    /********************/  
             
    // Console Output, All the States
    System.out.println("Linked list from Front to Rear:");
    System.out.println("State            Capital          Abbr   Population   Region            Region #");
    stack.display();
    
    // Transfer the state objects from the stack to the binary tree
    while (!stack.isEmpty()) {
        bTree.insert(stack.pop());
    }

    // Display the state data stored in the binary tree in LNR order (ascending)
    System.out.println("Linked list from Rear to Front:");
    System.out.println("State            Capital          Abbr   Population   Region            Region #");
    //bTree.displayTreeLNR(Node node);
    
    // Display the state data stored in the binary tree in RNL order (descending)
    System.out.println("Linked list from Rear to Front:");
    System.out.println("State            Capital          Abbr   Population   Region            Region #");
    //bTree.displayTreeRNL(Node node);

    // Read the deletion data into the program using the third input data file
    System.out.println("Linked list from Rear to Front:");
    System.out.println("State            Capital          Abbr   Population   Region            Region #");
    //       
      
    // Delete state objects from the binary tree using the integer values stored in the array
    System.out.println("Linked list from Rear to Front:");
    System.out.println("State            Capital          Abbr   Population   Region            Region #");
    //bTree.remove(int population);
    
    // Display the updated state data stored in the binary tree
    System.out.println("Linked list from Rear to Front:");
    System.out.println("State            Capital          Abbr   Population   Region            Region #");
    bTree.display(true);
        
        
        
    }
    
    public void readInputFiles(String fileName1, String fileName2) {

            String line1 = ""; //Stores state data read in from the first input file

            String line2 = ""; //Stores state data read in from the second input file

            boolean line1Pushed = true, line2Pushed = true; //truth values of which line was pushed into the stack

            boolean endOfFile1 = false, endOfFile2 = false; //truth values of reaching the end of the input files

            try {

                BufferedReader br1 = new BufferedReader(new FileReader(fileName1));

                BufferedReader br2 = new BufferedReader(new FileReader(fileName2));

                while (!endOfFile1 || !endOfFile2) {

                    if (line1Pushed) {

                        line1 = br1.readLine();

                    }

                    if(line1 == null){

                        line1 = "Z";

                        endOfFile1 = true;

                    }

                    if (line2Pushed) {

                        line2 = br2.readLine();

                    }

                    if(line2 == null){

                        line2 = "Z";

                        endOfFile2 = true;

                    }

                    if(line1.compareToIgnoreCase(line2) < 0 && (!endOfFile1 || !endOfFile2)){

                        stack.push(new Node(new State(line1)));

                        line1Pushed = true;

                        line2Pushed = false;

                    }else if(!endOfFile1 || !endOfFile2){

                        stack.push(new Node(new State(line2)));

                        line2Pushed = true;

                        line1Pushed = false;

                    }

                }

            } catch (FileNotFoundException e) {

                System.out.println("Error: File Not Found");

            } catch (IOException e) {

                System.out.println("Error: IO error");

       }
            
    }
        
             
}
