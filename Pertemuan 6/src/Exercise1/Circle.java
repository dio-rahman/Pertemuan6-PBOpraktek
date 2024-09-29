package Exercise1;

/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {
    private double radius;
    private String color;

   // Default constructor
    public Circle() {
      this.radius = 1.0; // Default radius
      this.color = "red"; // Default color
    }

   // Constructor with radius, default color is red
    public Circle(double r) {
        this.radius = r;
        this.color = "red";
    }

   // Constructor with radius and color
    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }

   // Getter for radius
    public double getRadius() {
    return this.radius;
    }

   // Getter for color
    public String getColor() {
        return this.color;
    }

   // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

   // Method to calculate area
    public double getArea() {
      return this.radius * this.radius * Math.PI; // Use Math.PI instead of hardcoding
    }

   // Method to provide a string representation of Circle
    public String toString() {
        return "Circle[radius = " + this.radius + ", color = " + this.color + "]";
    }
}