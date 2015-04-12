/*
 *  Project4 State.java
 *  Rachel Bennett, Waseem Beraz, Mike Cross, James Spinella
 */

package project4;

/*
    State - Contains methods for determing appropriate parameter and return types of States
 */


public class State {
    
        private String stateName;
        private String capital;
        private String abbr;
        private String region;
        private int population;
        private int regionNumber;

        public State(String line){
            String[] data = new String[6];
            data = line.split(",");
            stateName = data[0];
            capital = data[1];
            abbr = data[2];
            population = Integer.parseInt(data[3]);
            region = data[4];
            regionNumber = Integer.parseInt(data[5]);
        }

        /**
         * Returns the state name of the state
         * @return the state's name
         */
        public String getStateName(){
            return stateName;
        }

        /**
         * Returns the capital of the state
         * @return state capital
         */
        public String getCapital(){
            return capital;
        }

        /**
         * Returns the abbreviation of the state
         * @return state abbreviation
         */
        public String getAbbreviation(){
            return abbr;
        }

        /**
         * Returns the region of the state
         * @return state region
         */
        public String getRegion(){
            return region;
        }

        /**
         * Returns the population of the state
         * @return state population
         */
        public int getPopulation(){
            return population;
        }

        /**
         * Returns the region number of the state
         * @return state region
         */
        public int getRegionNumber(){
            return regionNumber;
        }
    }


