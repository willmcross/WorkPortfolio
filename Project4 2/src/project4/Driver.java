/*
 *  Project4 Driver.java
 *  Rachel Bennett, Waseem Beraz, Mike Cross, James Spinella
 */

package project4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *   Driver - Procedural code for Project4; provides special provisions for reading two TXT files simultaneously 
 */

public class Driver {

    Stack stack = new Stack();
    BinaryTree tree = new BinaryTree();
    int[] deleteArray = new int[17];

    void execute(String[] args) {

        ReadToStack(); // Reads in two TXT files simultaneously

        // Displays the state data stored in the stack
        System.out.println("State            Capital          Abbr   Population   Region            Region #");

        while (stack.isEmpty() == false) {
            Node temp = stack.pop();
            System.out.println(temp.getState().toString());
            tree.insert(temp);
        }

        // Display the state data stored in the binary tree in LNR order (ascending)
        System.out.println();
        System.out.println("State            Capital          Abbr   Population   Region            Region #");

        tree.display(false);

        // Display the state data stored in the binary tree in RNL order (descending)
        System.out.println();
        System.out.println("State            Capital          Abbr   Population   Region            Region #");

        tree.display(true);

        // Reads in States.Delete.txt
        ReadToDelete();

        // Delete state objects from the binary tree using the integer values stored in the array
        System.out.println();
        System.out.println("Deleted States:");

        for (int i : deleteArray) {
            System.out.println(tree.remove(i).getState().toString());
        }

        // Display the updated state data stored in the binary tree (ascending)
        System.out.println();
        System.out.println("State            Capital          Abbr   Population   Region            Region #");

        tree.display(false);

        // Display the updated state data stored in the binary tree (descending)
        System.out.println();
        System.out.println("State            Capital          Abbr   Population   Region            Region #");

        tree.display(true);

    }

    // Special provisions for reading in two TXT files sumultaneously, reading in the "delete" TXT file
    private void ReadToStack() {
        try (
                // Uses class loader search mechanism
                InputStream input = this.getClass().getResourceAsStream("States.Input.A.txt");
                InputStreamReader isr = new InputStreamReader(input);
                BufferedReader reader = new BufferedReader(isr);
                InputStream input2 = this.getClass().getResourceAsStream("States.Input.B.txt");
                InputStreamReader isr2 = new InputStreamReader(input2);
                BufferedReader reader2 = new BufferedReader(isr2);) {
            String line;
            String line2;

            // Reads file by line
            boolean readLine = false;
            boolean readLine2 = false;

            line = reader.readLine();
            line2 = reader2.readLine();

            while (line != null || line2 != null) {

                State state = new State(line);
                State state2 = new State(line2);

                if (state.getName() != null && state.getName().compareTo(state2.getName()) < 0) {
                    stack.push(state);
                    readLine = true;
                } else {
                    stack.push(state2);
                    readLine = false;
                }
                if (readLine == true) {
                    line = reader.readLine();
                } else {
                    line2 = reader2.readLine();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void ReadToDelete() {
        try (
                //Uses class loader search mechanism
                InputStream input = this.getClass().getResourceAsStream("States.Delete.txt");
                InputStreamReader isr = new InputStreamReader(input);
                BufferedReader reader = new BufferedReader(isr);) {

            String line;
            int lineCount = 0;

            while ((line = reader.readLine()) != null) {
                int population = Integer.parseInt(line);
                deleteArray[lineCount] = population;
                lineCount++;
            }
        } catch (IOException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
