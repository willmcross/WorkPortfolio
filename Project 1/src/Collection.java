package Project1;


public class Collection {

    private int studentElement;
    private int max;



    // Declare n-element studentArray
    private Student[] studentArray = new Student[max];



    // Adds a Student object to the collection
    public void add(Student newStudent) {
        studentArray[studentElement++] = newStudent;
    }


    // Searches the collection using the Binary Search algorithm
    public int binarySearch(int value) {
        int index = -1;
        int lower = 0;
        int upper = studentArray.length - 1;
        int current;

        while (lower <= upper && index == -1) {
            current = (lower + upper) / 2;
            if ([current] == value) {
                index = current;
            } else {
                if (studentArray[current] < value) {
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
                if(studentArray[x] > studentArray[x + 1]){
                    swap(x, x + 1);
                    bubbleSortCopyCount++;
                }
            }
        }


    }

    public void swap(int pos1, int pos2) {
        int temp = studentArray[pos1];
        studentArray[pos1] = studentArray[pos2];
        studentArray[pos2] = temp;
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
        for (int i = 0; i < studentArray.length; i++){
            sum = sum + studentArray[i];
        }
        double result = sum / studentArray.length;
        System.out.println(result);

        return result;

    }

    // Calculates the maximum total points of the students stored in the collection
    public int getMax() {
        int max = 0;
        for(int n = 0; n < studentArray.length; n++){
            if(studentArray[n] > max){
                max = studentArray[n];
            }
        }
        return max;

    }

    // Calculates the minimum total points of the students stored in the collection
    public int getMin() {
        int min = 0;
        for (int n = 0; n < studentArray.length; n++) {
            if (studentArray[n] < min) {
                min = studentArray[n];
            }

        }
        return min;
    }

    // Calculates the median total points of the students stored in the collection
    public int getMedian()  {
        int median = studentArray.length/2

        if (studentArray.length % 2 ==0){
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
            temp = studentArray[y];
            x = y;
            while (x > 0 && studentArray[x-1] >= temp){
                studentArray[x] = studentArray[x-1];
                x--;
                int selectionSortCopyCount = 0;
                selectionSortCopyCount++;
            }
            studentArray[x] = temp;
        }
    }

    // Tests whether the collection is empty
    public boolean isEmpty() {
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

        for(int x = 0; x < studentArray.length && index == -1; x++){
            if(value == studentArray[x]){
                index = x;
            }
        }
        return index;

    }

    // Removes a Student object from the collection
    public double remove(studentArray[] item, int index){
        for (int i = 0; i < studentArray.length; i++){
            item[i] = "";
        }

    }

    // Sorts the collection on a student’s full name using the Selection Sort algorithm
    public int selectionSort() {
        int min;

        for(int y = 0; y < studentArray.length - 1; y++){
            min = y;
            for(int x = y + 1; x < studentArray.length; x++){
                if(studentArray[x] < studentArray[min]){
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
    public int sortstudentArray()  {
        int min;

        for(int y = 0; y < studentArray.length - 1; y++){
            min = y;
            for(int x =  y + 1; x < studentArray.length; x++){
                if(studentArray[x] < studentArray[min]){
                    min = x;
                }
            }
            if (min > y){
                swap(y, min);
            }
        }

    }

}
