package Project;
import java.util.*;

public class Student {
    String name;
    int age;
    String rollnumber;
    String house;

    public void student(String name, int age, String rollnumber, String house){
        this.name = name;
        this.age= age;
        this.house = house;
        this.rollnumber = rollnumber;
    }

    public String toString(){
        return "Student Details: { name: " + name + ", age: " + age + ", roll number: " + rollnumber + ", house: " + house + " }";
    }
    public static void main(String[] args) {
        Student stu= new Student("Ayushman", 20, "23412C2", "Ganga");
        System.out.println(stu);
    }
}
