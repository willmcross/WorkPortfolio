
import java.io.*;
import java.util.*;

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

                // Splits each line into a token
                StringTokenizer st = new StringTokenizer(line);
                String info = st.nextToken();

                // Takes each line, creates a series of variables from the substrings.
                // Values correlate to Contest.Description.
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
            System.out.println("James Spinella, Waseem Baraz, Rachel Bennett, Mike Cross");
            System.out.println("Project 1"\n);
            // Sort Algorithm Report
            System.out.println("Sort Algorithm Report:");
            System.out.println("The Bubble Sort algorithm required " bubbleSortCopyCount " copies");
            System.out.println("The Selection Sort algorithm required " selectionSortCopyCount " copies");
            System.out.println("The Insertion Sort algorithm required " insertionSortCopyCount " copies"\n\n);
            // Records
            System.out.println("Student Name          Position  Attempted  Completed  Total Points")
            System.out.println("------------          -------------------  ---------  ------------")
            System.out.println(
            // ten records
            // Statistics Report
            System.out.println("Statistics Report:");
            System.out.println("The maximum points earned was" getMax);
            System.out.println("The minimum points earned was" getMin);
            System.out.println("The average points earned was" getAverage);
            System.out.println("The median points earned was" getMedian\n);
            // Linear Search Results
            System.out.println("Linear Search Results:");
            System.out.println("Search String        Found  Not Found  # Probes");
            System.out.println("-------------        -----  ---------  --------");
            // print 15 results \n
            // Binary Search Results
            System.out.println("Binary Search Results:");
            System.out.println("Search String        Found  Not Found  # Probes");
            System.out.println("-------------        -----  ---------  --------");
            // print 15 results \n
            // Contents of Contest.Output.txt (do not display on screen)
            System.out.println("Contents of Contest.Output.txt file:");
            // print 32 results \n
        }

        private void calculateStatistics() {

        }




}
