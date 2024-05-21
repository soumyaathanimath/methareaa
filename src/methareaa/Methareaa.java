package methareaa;

public class Methareaa {

    // Method to calculate the area of a circle
    static double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    static double area(double length, double breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        // Example usage of the area methods
        double radius = 5.0;
        double length = 10.0;
        double breadth = 4.0;

        // Calculate and print the area of a circle
        System.out.println("Area of the circle with radius " + radius + " is: " + area(radius));

        // Calculate and print the area of a rectangle
        System.out.println("Area of the rectangle with length " + length + " and breadth " + breadth + " is: " + area(length, breadth));
    }
}
