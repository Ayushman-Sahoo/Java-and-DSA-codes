package Project;
import java.util.Scanner;

public class Circle {
    double radiusInMm;
    Circle(double radiusInMm){
        this.radiusInMm= radiusInMm;
    }
    double getCircumference(){
        return 2*Math.PI*radiusInMm; 
    }
    double getArea(){
        return Math.PI*Math.pow(radiusInMm, 2);
    }
    public String toString(){
        return "Circle Props: Radius in mm: " + radiusInMm + " \nCircumference in mm: " + getCircumference() + " \nArea in mm^2: " + getArea();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter Your Redius: ");
        double redius= sc.nextDouble();
        Circle c= new Circle(redius);
        System.out.println(c);
    }
}
