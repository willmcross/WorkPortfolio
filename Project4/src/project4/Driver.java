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
    
    void execute(String[] args) {
    BinaryTree bTree = new BinaryTree();
    Stack stackAdd = new Stack();
        
    // try block incompatible with IntelliJ - ***MUST USE NETBEANS***
     try (
             // TXT File Import (States.Input.txt) [as per args]
             InputStream input = this.getClass().getResourceAsStream("States.Input.A.txt");
             InputStreamReader isr = new InputStreamReader(input);
             BufferedReader reader = new BufferedReader(isr);) {
         String line;
         // Reads file one line at a time
         int lineCount = 0;
         while ((line = reader.readLine()) != null) {
             State state = new State(line);
             bTree.insert(state);
             lineCount++;
         }
     } catch (IOException ex) {
         Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
    }    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
