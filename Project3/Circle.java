// package Parikshit;
import java.util.*;
 class Circle {
    private double x; // x-coordinate of the center
    private double y; // y-coordinate of the center
    private double r; // radius

    // Constructor 1: Initialize with default values (center at origin and radius 1.0)
    public Circle() {
        x = 0.0;
        y = 0.0;
        r = 1.0;
    }
	

    // Constructor 2: Initialize with specified center coordinates and radius
    public Circle(double centerX, double centerY, double radius) {
        x = centerX;
        y = centerY;
        r = radius;
    }

    // Method to calculate and return the area of the circle
    public double area() {
        return Math.PI * r * r;
    }

    // Method to calculate and return the circumference (perimeter) of the circle
    public double circumference() {
        return 2 * Math.PI * r;
    }

    // Method to calculate and return the diameter of the circle
    public double diameter() {
        return 2 * r;
    }

    // Getter method for x-coordinate
    public double getX() {
        return x;
    }

    // Getter method for y-coordinate
    public double getY() {
        return y;
    }

    // Getter method for radius
    public double getRadius() {
        return r;
    }

    // Setter method for x-coordinate
    public void setX(double centerX) {
        x = centerX;
    }

    // Setter method for y-coordinate
    public void setY(double centerY) {
        y = centerY;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        r = radius;
    }
	
}
class CircleDome{ 
    public static void main(String[] args) {
        // Creating a circle with default values
        Circle circle1 = new Circle();
		Scanner sc= new Scanner(System.in);
        int op=1;
		 System.out.println(" Default Circle ");
		 System.out.println(" X-coordinate: "+ circle1.getX());
		 System.out.println(" Y-coordinate: " + circle1.getY());
		 System.out.println(" Circle Radius: "+ circle1.getRadius());
		 while(op!=7){
			System.out.println("1.Set x-coordinate " );
			System.out.println("2.Set y-coordinate " );
			System.out.println("3.Set Radius" );
			System.out.println("4.Faind area " );
			System.out.println("5.Faindcircumference " );
			System.out.println("6.Faind diameter " );
			System.out.println("7.Exit " );
			System.out.print("Select one Option: " );
			op = sc.nextInt();
			switch(op){
				case 1:System.out.print("Enter Your X-coordinate: " );
						double x = sc.nextInt();
						circle1.setX(x);
						System.out.println("Your Circle X-coordinate set: " + circle1.getX());
						break;
				case 2:System.out.print("Enter Your Y-coordinate: " );
						double y = sc.nextInt();
						circle1.setY(y);
						System.out.println("Your Circle Y-coordinate set: " + circle1.getY());
						break;
				case 3:System.out.print("Enter Your radius: " );
						double radius = sc.nextInt();
						circle1.setRadius(radius);
						System.out.println("Your Circle Radius set: " + circle1.getRadius());
						break;
				case 4:System.out.println("Circle - Area: " + circle1.area());
						break;
				case 5:System.out.println("Circle circumference: " + circle1.circumference());
						break;
				case 6:System.out.println("Circle diameter: " + circle1.diameter());
						break;
				case 7:System.out.println("Program is Exit ");
						break;
				default:System.out.println("Invalid Option");
						break;
			}
		}
       /* System.out.println("Circle 1 - Area: " + circle1.area());
        System.out.println("Circle 1 - Circumference: " + circle1.circumference());
        System.out.println("Circle 1 - Diameter: " + circle1.diameter());
          Creating a circle with specific values
        Circle circle2 = new Circle(3.0, 4.0, 2.5);
        System.out.println("Circle 2 - Area: " + circle2.area());
        System.out.println("Circle 2 - Circumference: " + circle2.circumference());
        System.out.println("Circle 2 - Diameter: " + circle2.diameter());*/
    }
}