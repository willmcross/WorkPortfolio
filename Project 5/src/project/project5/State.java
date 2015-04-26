package project.project5;

/**
 * State.java - Interprets data organized either by comma or by substring.
 */

public class State {

    private String name;
    private String capital;
    private String abbr;
    private String region;
    private int population;
    private int regionNumber;

    /**
     * Constructor for *comma separated values* being read in from text file.
     * @param data String array containing State data
     */
    public State(String[] data) {
        name = data[0].trim();
        capital = data[1].trim();
        abbr = data[2].trim();
        region = data[4].trim();
        population = Integer.parseInt(data[3].trim());
        regionNumber = Integer.parseInt(data[5].trim());
    }

    /**
     * Constructor for *substring values* being read in from the text file.
     * @param line String containing state data to be parsed
     */
    public State(String line) {
        name = line.substring(0, 15).trim();
        capital = line.substring(15, 30).trim();
        abbr = line.substring(30, 32).trim();
        region = line.substring(40, 55).trim();
        population = Integer.parseInt(line.substring(32, 40).trim());
        regionNumber = Integer.parseInt(line.substring(55).trim());
    }

    /**
     * Retrieves the name of the state
     * @return state name
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the capital of the state
     * @return state capital
     */
    public String getCaptial() {
        return capital;
    }

    /**
     * Retrieves the abbreviation of the state
     * @return state abbreviation
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * Retrieves the region of the state
     * @return state region
     */
    public String getRegion() {
        return region;
    }

    /**
     * Retrieves the population of the state
     * @return state population
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Retrieves the region number of the state
     * @return state region number
     */
    public int getRegionNumber() {
        return regionNumber;
    }

    /**
     * Prepares the state to be displayed as a string
     * @return state as a string
     */
    public String toString(){
        return String.format("%-15s %-15s %-15s %,-15d %-15s %-15d", name, capital, abbr, population,
                                region, regionNumber);
    }
}
