
public class Driver {

  // reference to Collection object to be created from read input
    private Collection coll;
    
    
   //executes all methods in Driver
    public void execute() throws IOException{
        calculateStatistics();
        searchCollection();
        displayReport();
        readInput();
    }


        public void execute() throws IOException {
           ArrayList<String> list = new ArrayList<>();

	// New BufferedReader.
	BufferedReader reader = new BufferedReader(new FileReader(
		"C:\\Contest.Input.A.txt"));

       
        
	// Add all lines from file to ArrayList.
	while (true) {
	    String line = reader.readLine();
	    if (line == null) {
		break;
	    }
	    list.add(line);
	}

	// Close it.
	reader.close();

	
            for(String line : list) {

                // splits each line into a token
                StringTokenizer st = new StringTokenizer(line);
                String info = st.nextToken();
           
                // Takes each line, creates a series of variables from the substrings. Values correlate to Contest.Description. 
                String studentFirstName = info.substring(0,9).trim();
                String studentLastName =  info.substring(9,18).trim();
                String finalPosition = info.substring(19, 20).trim();
                int projectAttempted = Integer.parseInt(info.substring(21,22).trim());
                int projectCompleted = Integer.parseInt(info.substring(23).trim());
                int totalPoints = Integer.parseInt(info.substring(24,27).trim());
     
               
            }
            
    }

        private void sortCollection () {             
            
        }
        
        private void searchCollection () {  
 
        }
               
  
        
        private void displayReport() {
             
        }
        
        private void calculateStatistics() {
            
        }
        
        
        
        
}
