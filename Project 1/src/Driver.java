package Project1;


import java.io.*;
import java.util.*;

public class Driver {

    private final int SEARCH_LENGTH;
    private Collection coll;

    public Driver() throws IOException {
        SEARCH_LENGTH = (int)(array.length / 2); // Initialize the runtime constant
        coll = new Collection();
    }




    public void execute() throws IOException{
        calculateStatistics();
        searchCollection();
        displayReport();
        readInput();
    }







    public void readInput() throws IOException {
        ArrayList<String> list = new ArrayList<String>();

        // New BufferedReader
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

            coll.add(new Student(line));
        }


    }


    private void sortCollection () {
        coll.bubbleSort();
        coll.selectionSort();
        coll.insertionSort();
    }


    public void readInputC() throws IOException {
        ArrayList<String> list = new ArrayList<String>();

        // New BufferedReader.
        BufferedReader reader = new BufferedReader(new FileReader(
                "C:\\Contest.Search.txt"));



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

            coll.add(new Student(line));
        }


    }

    private void searchCollection () {
        coll.linearSearch(SEARCH_LENGTH);
        coll.binarySearch(SEARCH_LENGTH);
    }


    private void displayReport() {
        System.out.println("James Spinella, Waseem Baraz, Rachel Bennett, Mike Cross");
        System.out.println("Project 1\n");
        // Sort Algorithm Report
        System.out.println("Sort Algorithm Report:");
        System.out.println("The Bubble Sort algorithm required " + coll.bubbleSortCopyCount + " copies");
        System.out.println("The Selection Sort algorithm required " + coll.selectionSortCopyCount + " copies");
        System.out.println("The Insertion Sort algorithm required " + coll.insertionSortCopyCount + " copies\n");
        // Records
        System.out.println("Student Name          Position  Attempted  Completed  Total Points");
        System.out.println("------------          -------------------  ---------  ------------");
        System.out.println("\n");
                // ten records
                // Statistics Report
        System.out.println("Statistics Report:");
        System.out.println("The maximum points earned was" + coll.getMax);
        System.out.println("The minimum points earned was" + coll.getMin);
        System.out.println("The average points earned was" + coll.getAverage);
        System.out.println("The median points earned was" + coll.getMedian + "\n");
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

