/*
 *  Project3 Driver.java
 *  Rachel Bennett, Waseem Beraz, Mike Cross, James Spinella
 */

package project3a;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Driver - Contains methods for executing the program; reading, displaying, and writing the data
 */

public class Driver {

    void execute(String[] args) {
        PriorityQueue = new PriorityQueue();
        Stack stackAdd = new Stack();
        Stack stackDel = new Stack();
        Stack stackUpd = new Stack();

        // try block incompatible with IntelliJ - ***MUST USE NETBEANS***
        try (
                // TXT File Import (States.Input.txt) [as per args]
                InputStream input = this.getClass().getResourceAsStream("States.Input.txt");
                InputStreamReader isr = new InputStreamReader(input);
                BufferedReader reader = new BufferedReader(isr);) {
            String line;
            // Reads file one line at a time
            int lineCount = 0;
            while ((line = reader.readLine()) != null) {
                State state = new State(line);
                pQueue.insert(state);
                lineCount++;
            }
        } catch (IOException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Console Output Setup
        System.out.println("Linked list from Front to Rear:");
        System.out.println("State            Capital          Abbr   Population   Region            Region #");
        pQueue.frontDisplay();

        System.out.println("Linked list from Rear to Front:");
        System.out.println("State            Capital          Abbr   Population   Region            Region #");
        pQueue.rearDisplay();

        try (
                // TXT File Import (States.Trans.txt) [as per args]
                InputStream input = this.getClass().getResourceAsStream("States.Trans.txt");
                InputStreamReader isr = new InputStreamReader(input);
                BufferedReader reader = new BufferedReader(isr);) {
            String line;
            //Reads file...
            int lineCount = 0;
            while ((line = reader.readLine()) != null) {
                char trans = line.charAt(0);
                line = line.substring(1);
                State state = new State(line);
                // Responds to Add, Delete, Update actions
                switch (trans) {
                    case 'A':
                        stackAdd.push(state);
                        break;
                    case 'D':
                        stackDel.push(state);
                        break;
                    case 'U':
                        stackUpd.push(state);
                        break;
                }

                lineCount++;
            }
        } catch (IOException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Console Output Setup
        System.out.println("Add Stack:");
        System.out.println("State            Capital          Abbr   Population   Region            Region #");
        stackAdd.display();

        System.out.println("Delete Stack:");
        System.out.println("State            Capital          Abbr   Population   Region            Region #");
        stackDel.display();

        System.out.println("Update Stack");
        System.out.println("State            Capital          Abbr   Population   Region            Region #");
        stackUpd.display();

        while (!stackAdd.isEmpty()) {
            pQueue.insert(stackAdd.pop());
        }

        while (!stackDel.isEmpty()) {
            pQueue.remove(stackDel.pop().getName());
        }

        while (!stackUpd.isEmpty()) {
            State state = stackUpd.pop();
            pQueue.remove(state.getName());
            pQueue.insert(state);
        }

        // Console Output Setup
        System.out.println("Linked list from Front to Rear:");
        System.out.println("State            Capital          Abbr   Population   Region            Region #");
        pQueue.frontDisplay();

        System.out.println("Linked list from Rear to Front:");
        System.out.println("State            Capital          Abbr   Population   Region            Region #");
        pQueue.rearDisplay();

        writeFile(pQueue);

    }

    // Writes data to States.Output.txt (as per args)
    public void writeFile(PriorityQueue priQueue) {
        try {
            File fout = new File("States.Output.txt");

            if (!fout.exists()) {
                fout.createNewFile();
            }

            FileOutputStream fos = new FileOutputStream(fout);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            int i = 0;
            while (!priQueue.isEmpty()) {
                bw.write(priQueue.remove().toString());
                bw.newLine();
                i++;
            }

            bw.close(); // VERY important - remember, folks; close files ASAP!
        } catch (IOException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
