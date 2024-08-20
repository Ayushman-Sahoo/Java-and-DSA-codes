package Project;
import java.util.*;
public class Course {
    static int maxCapacity=100;
    String Coursename;
    int enrollments;
    String[] enrolledstudents;
    Course(String courseName){
        this.Coursename=courseName;
        this.enrollments=0;
        this.enrolledstudents=new String[maxCapacity];
    }
      
    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity= maxCapacity;
    }
    void enrollstudents(String studentname){
        enrolledstudents[enrollments]= studentname;
        enrollments++;
    }
    void unenrollStudent(String studentname){
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    }
}
