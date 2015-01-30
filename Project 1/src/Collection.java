
public class Collection {

  // Declare n-element Array
  // private int[] array = new int[]{};

  // Adds a Student object to the collection
  public string add() {
    Student records = new Student();
  }

  // Searches the collection using the Binary Search algorithm
  public int binarySearch()  {

  }

  // Sorts the collection on a student’s full name using the Bubble Sort algorithm
  public int bubbleSort()  {

  }

  // Displays the student object data stored in the collection
  public double display() {

  }

  // Calculates the average total points of the students stored in the collection
  public double getAverage()  {

  }

  // Calculates the maximum total points of the students stored in the collection
  public int getMax() {

  }

  // Calculates the minimum total points of the students stored in the collection
  public int getMin() {

  }

  // Calculates the median total points of the students stored in the collection
  public int getMedian()  {
      int median = array.length/2

      if (array.length % 2 ==0){
          return median[middle];
      else{
          return (median[middle+1] + median[middle])/2;
          }
      }

  }

  // Sorts the collection on a student’s full name using the Insertion Sort algorithm
  public int insertionSort() {
    int x, temp;

      for(int y = 1; y < numElems; y++){
          temp = array[y];
          x = y;
          while (x > 0 && array[x-1] >= temp){
              array[x] = array[x-1];
              x--;
          }
          array[x] = temp;
      }
  }

  // Tests whether the collection is empty
  public bool isEmpty() {

  }

  // Searches the collection using the Linear Search algorithm
  public int linearSearch(int value)  {
      int index = -1;

      for(int x = 0; x < array.length && index == -1; x++){
          if(value == array[x]){
              index = x;
          }
      }
      return index;

  }

  // Removes a Student object from the collection
  public double remove()  {

  }

  // Sorts the collection on a student’s full name using the Selection Sort algorithm
  public int selectionSort() {
      int min;

      for(int y = 0; y < array.length - 1; y++){
          min = y;
          for(int x = y + 1; x < array.length; x++){
              if(array[x] < array[min]){
                  min = x;
              }
          }
          if (min > y){
              swap(y, min);
          }
      }

  }

  //look at slide 16 for selection sort

  // Sorts the collection on a student’s total points using the Selection Sort algorithm
  public int sortArray()  {
      int min;

      for(int y = 0; y < array.length - 1; y++){
          min = y;
          for(int x =  y + 1; x < array.length; x++){
              if(array[x] < array[min]){
                  min = x;
              }
          }
          if (min > y){
              swap(y, min);
          }
      }

  }

}
