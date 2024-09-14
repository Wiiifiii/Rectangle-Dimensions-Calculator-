import java.util.Scanner;

/*  1. Make a Java program (console application) which can be used to ask width and height for a rectangle. 
    Based on width and height program calculates area. Implement a class that contains all the necessary 
    fields (or member variables). Class should also have member methods to ask values to height/width, 
    to calculate are and to print out height/width and area. Implement also a test code which you use to test the class
    (just implement a class that contains main-method and in that method you allocate memory for you rectangle-class and use its methods). 
*/

public class Rectangle {
    // The member variables.
    private double hight;
    private double width;

    // Ask the hight and width.
    public void inputMeasurements() {
    // Create a Scanner object for reading input.
        try (Scanner scan = new Scanner(System.in)) {
    // Prompt the user for width and height.
            System.out.print("Enter the height of the rectangle (m): ");
    // Store the user's input in the height field.
            hight = scan.nextDouble();
    // Prompt the user for width.
            System.out.print("Enter the width of the rectangle (m): ");
    // Store the user's input in the width field.
            width = scan.nextDouble();
        }
    }

    // Method to calculate the area of the rectangle.
    public double calculateArea() {
        return hight * width;
    }

    // Method to print the details of the rectangle: width, height, and calculated area.
    public void calculationresults() {

        System.out.println("The rectangle hight (l) = " + hight + " m");
        System.out.println("The rectangle width (W) = " + width + " m");
        System.out.println("Rectangle Area (A) is: " + calculateArea() + " m\u00B2");
    }

}