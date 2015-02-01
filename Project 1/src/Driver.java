
import java.io.*;
import java.util.*;

/**
 *
 * @author Kanau
 */
public class Driver {
    
private final int SEARCH_LENGTH;
private Collection coll;    
  
    public Driver() {
        SEARCH_LENGTH = (int)(studentArray.length / 2); // Initialize the runtime constant
        coll = new Collection();
    }
    
    
    
  
    public void execute() throws IOException{
        calculateStatistics();
        searchCollection();
        displayReport();
        readInput();
    }

  
    
    public void readInput() throws IOException {
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
                String studentLastName =  info.substring(10,18).trim();
                int finalPosition = Integer.parseInt(info.substring(19, 20).trim());
                int projectAttempted = Integer.parseInt(info.substring(21,22).trim());
                int projectCompleted = Integer.parseInt(info.substring(23).trim());
                int totalPoints = Integer.parseInt(info.substring(24,27).trim());
            
                
            }  
            
            
    }
        
        
        private void sortCollection () {             
            coll.bubbleSort();
            coll.selectionSort();
            coll.insertionSort();
    }
        
        
        private void searchCollection () {  
            coll.linearSearch(SEARCH_LENGTH);
            coll.binarySearch(SEARCH_LENGTH);
        }
               
  
        
        private void displayReport() {
             
        }
        
        private void calculateStatistics() {
            
        }
        
        
        
        
}

