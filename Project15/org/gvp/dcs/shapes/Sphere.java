package org.gvp.dcs.shapes;

public class Sphere {
    private double radius;

    // Constructor 
    public Sphere(double radius) {
        this.radius = radius;
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    
    public double calculateSurfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }
}