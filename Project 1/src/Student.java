

public class Student {

    String studentLastName, studentFirstName;
    int totalPoints, projectCompleted, projectAttempted, finalPosition;
    
    
    public  Student (String line) {
                
                studentFirstName = line.substring(0, 9).trim();
                studentLastName =  line.substring(10, 19).trim();
                finalPosition = Integer.parseInt(line.substring(19, 21).trim());
                projectAttempted = Integer.parseInt(line.substring(21, 23).trim());
                projectCompleted = Integer.parseInt(line.substring(23, 24).trim());
                totalPoints = Integer.parseInt(line.substring(24, 27).trim());
}          
    
    
    public String getFullName(){
        
        return (studentFirstName + " " + studentLastName);
    }
    
    public int getPoints(){
        
        return (totalPoints);
    }
    
    public String toString () {
        
        return null;
    }
    
    }   