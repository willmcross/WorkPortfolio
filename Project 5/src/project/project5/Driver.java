package project.project5;

import java.io.*; // Import all the things

/**
 * Project.java - Executes driver, etc.
 */

public class Driver {
    private HashTable ht;
    private String[] query;

    /**
     * executes program
     * @param args command line arguments
     */
    public void execute(String[] args){
        ht = new HashTable(10); // Number of States to output
        query = new String[10]; // Number of States to output
        readInputFile(args[0]);
        ht.display();
        readQueryFile(args[1]);
    }

    /**
     * Reads the data from the input file into the program
     * @param fileName input file
     */
    private void readInputFile(String fileName) {
        String line = "";
        String[] data = new String[6];

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) {
                if(line.indexOf(",") != -1){
                    data = line.split(",");
                    ht.insert(new State(data));
                }else{
                    ht.insert(new State(line));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * Reads the data from the input file into the program
     * @param fileName input file
     */
    private void readQueryFile(String fileName){
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            for(int i = 0; (line = br.readLine()) != null; i++) {
                query[i] = line;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

        //prints out query results
        for(int i = 0; i < query.length; i++){
            System.out.println(ht.findState(query[i]));
        }
    }

    /**
     * And this is where I'd put my State.Output.txt file... IF I HAD ONE!
     * @param meme.fairlyOddParentsDad
     */

}
