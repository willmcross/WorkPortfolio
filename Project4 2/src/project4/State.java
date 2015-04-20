/*
 *  Project4 State.java
 *  Rachel Bennett, Waseem Beraz, Mike Cross, James Spinella
 */

package project4;

/*
    State - Contains methods for determing appropriate parameter and return types of States
 */


public class State {

    private String[] array;
    private String name;
    private String capital;
    private String abbr;
    private int population;
    private String region;
    private int regionNum;

    // Splits types of data from each line via , delimiter
    public State(String inputLine) {

        if (inputLine == null) {
            name = null;
        } else {
            array = inputLine.split(",");

            //substring that starts from index 0 w/ 15 characters removes excess spaces
            name = array[0];
            //substring from index 9 with 11 characters, trims extra spaces
            capital = array[1];
            //Converts string so it can be evaluated as integer, starts from index 19 and has 3 characters, trims spaces
            abbr = array[2];
            //Starts from index 19 w/ 3 characters, trims excess spaces
            population = Integer.parseInt(array[3]);
            //Starts from index 23 w/ 2 characters, trims excess spaces
            region = array[4];
            //Starts from index 24 w/ 4 characters, trims excess spaces
            regionNum = Integer.parseInt(array[5]);
        }
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String toString() {
        String printString;
        if (capital == null) {
            printString = name;
        } else {
            printString = String.format("%-17s%-17s%-7s%-13d%-18s%d", name, capital, abbr, population, region, regionNum);
        }
        return printString;
    }

}



