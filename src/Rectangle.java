import java.util.Scanner;

/*  1. Make a Java program (console application) which can be used to ask width and height for a rectangle. 
    Based on width and height program calculates area. Implement a class that contains all the necessary 
    fields (or member variables). Class should also have member methods to ask values to height/width, 
    to calculate are and to print out height/width and area. Implement also a test code which you use to test the class
    (just implement a class that contains main-method and in that method you allocate memory for you rectangle-class and use its methods). 
*/

public class Rectangle {
    // The member variables
    private double hight;
    private double width;

    // Ask the hight and width
    public void inputMeasurements() {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Enter the height of the rectangle (m): ");
            hight = scan.nextDouble();
          
            System.out.print("Enter the width of the rectangle (m): ");
            width = scan.nextDouble();
        }
    }

    // Calculate the area of the rectangle
    public double calculateArea() {
        return hight * width;
    }

    // print out height,width,and area
    public void calculationresults() {

        System.out.println("The rectangle hight (l) = " + hight + " m");
        System.out.println("The rectangle width (W) = " + width + " m");
        System.out.println("Rectangle Area (A) is: " + calculateArea() + " m\u00B2");
    }

}