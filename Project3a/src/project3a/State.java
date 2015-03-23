/*
 *  Project3 State.java
 *  Rachel Bennett, Waseem Beraz, Mike Cross, James Spinella
 */

package project3a;

/*
    State - Contains methods for determing appropriate parameter and return types of States
 */

public class State {
    
    private String name;
    private String capital;
    private String abbr;
    private int population;
    private String region;
    private int regionNum;


    // State
    public State(String inputLine){


        try {
            // Substring that starts from index 0 w/ 15 characters removes excess spaces
            name = inputLine.substring(0, 15).trim();
            // Substring from index 9 with 11 characters; trims spaces
            capital = inputLine.substring(15, 30).trim();
            // Converts string so it can be evaluated as integer; starts from index 19 and has 3 characters; trims spaces
            abbr = inputLine.substring(30, 32).trim();
            // Starts from index 19 with 3 characters and trims excess spaces
            population = Integer.parseInt(inputLine.substring(32, 40).trim());
            // Starts from index 23 with 2 characters and trims excess spaces
            region = inputLine.substring(40,55).trim();
            // Starts from index 24 with 4 characters and trims excess space
            regionNum = Integer.parseInt(inputLine.substring(55, 56).trim());
        } catch(StringIndexOutOfBoundsException e){
            name = inputLine.substring(0, 15).trim();
        }

    }

    // getName
    public String getName(){
        return name;
    }

    // toString
    public String toString(){
        String printString;
        if(capital==null){
            printString = name;
        }else{
            printString = String.format("%-17s%-17s%-7s%-13d%-18s%d", name, capital, abbr, population, region, regionNum);
        }
        return printString;
    }
}


