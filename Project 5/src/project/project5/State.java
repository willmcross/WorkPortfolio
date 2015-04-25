package project.project5;

/**
 * Project.java - Executes driver, etc.
 */

public class State {

        boolean strManip;
        private String stateName;
        private String capital;
        private String abbr;
        private String region;
        private int population;
        private int regionNumber;

        /**
         * array of String values separated by comma delimiters
        **/
        public State(String line) {


        //Overloaded the constructor with both functions, tokenization and string manipulation. User decides which?
        if (strManip = true) {
              try {
            // Substring that starts from index 0 w/ 15 characters removes excess spaces
            stateName = line.substring(0, 15).trim();
            // Substring from index 9 with 11 characters; trims spaces
            capital = line.substring(15, 30).trim();
            // Converts string so it can be evaluated as integer; starts from index 19 and has 3 characters; trims spaces
            abbr = line.substring(30, 32).trim();
            // Starts from index 19 with 3 characters and trims excess spaces
            population = Integer.parseInt(line.substring(32, 40).trim());
            // Starts from index 23 with 2 characters and trims excess spaces
            region = line.substring(40,55).trim();
            // Starts from index 24 with 4 characters and trims excess space
            regionNumber = Integer.parseInt(line.substring(55, 56).trim());
        } catch(StringIndexOutOfBoundsException e){
            stateName = line.substring(0, 15).trim();
        }
        } else {
            String[] data = new String[6];
            data = line.split(“,”);
            stateName = data[0];
            capital = data[1];
            abbr = data[2];
            population = Integer.parseInt(data[3]);
            region = data[4];
            regionNumber = Integer.parseInt(data[5]);
            }
        }








        /**
         * Returns the state name of the state
         * @return the state’s name
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
