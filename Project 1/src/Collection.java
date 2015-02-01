
public class Collection {
    
  private int studentElement;
  private int max;
  
  
  
  // Declare n-element Array
  private Student[] array = new Student[max];

  
  
  // Adds a Student object to the collection
  public void add(Student newStudent) {
      array[studentElement++] = newStudent;
  }
  
  
// Searches the collection using the Binary Search algorithm
    public int binarySearch(int value) {
        int index = -1;
        int lower = 0;
        int upper = array.length - 1;
        int current;

        while (lower <= upper && index == -1) {
            current = (lower + upper) / 2;
            if ([current] == value) {
                index = current;
            } else {
                if (array[current] < value) {
                    lower = current + 1;
                } else {
                    upper = current - 1;
                }
            }
        }
        return index;
    }



    // Sorts the collection on a student’s full name using the Bubble Sort algorithm
    public int bubbleSort()  {
        for(int y = 0; y < numElems;  y++){
            for(int x = 0; x < numElems - 1; x++) {
                if(array[x] > array[x + 1]){
                    swap(x, x + 1);
                    bubbleSortCopyCount++;
                }
            }
        }


    }

    public void swap(int pos1, int pos2) {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }


    // Displays the student object data stored in the collection
    public double display(String name, int position, int attempted, int completed, int total) {

        showName = name;
        showPosition = position;
        showAttempted = attempted;
        showCompleted = completed;
        showTotal = total;
        System.out.println(showName + showPosition + showAtempted + showCompleted + showTotal);

    }

    // Calculates the average total points of the students stored in the collection
    public double getAverage()  {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        double result = sum / array.length;
        System.out.println(result);

        return result;

    }

    // Calculates the maximum total points of the students stored in the collection
    public int getMax() {
        int max = 0;
        for(int n = 0; n < array.length; n++){
            if(array[n] > max){
                max = array[n];
            }
        }
        return max;

    }

    // Calculates the minimum total points of the students stored in the collection
    public int getMin() {
        int min = 0;
        for (int n = 0; n < array.length; n++) {
            if (array[n] < min) {
                min = array[n];
            }

        }
        return min;
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
              selectionSortCopyCount++;
          }
          array[x] = temp;
      }
  }

  // Tests whether the collection is empty
  public bool isEmpty() {
      if(collection != null && collection.isEmpty()){
        return true;
      }
      else{
          return false;
      }

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
  public double remove(array[] item, int index){
      for (int i = 0; i < array.length; i++){
          item[i] = "";
      }

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
