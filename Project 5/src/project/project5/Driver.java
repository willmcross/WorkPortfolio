package project.project5;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 * Project.java - Executes driver, etc.
 */

public class Driver {
    
    void execute(String[] args) {

        HashTable HT = new HashTable();
        State state = new State();
        String[] stateName = new String[9];
        
        try{
                InputStream input = this.getClass().getResourceAsStream("States.Input.txt");
                InputStreamReader isr = new InputStreamReader(input);
                BufferedReader reader = new BufferedReader(isr);
                
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] split = line.split(",|\\ ");
                }
        }
            catch(IOException e){
                System.out.println("An error has occured.");
            }
    }
}