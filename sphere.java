/*
 * Design a class name sphere with three instance variables ie r,a,v(type double) and the following member methods to carry out the specified tasks
 * as listed below:
 * 1. Getdata():to ask user input radius of sphere
 * 2. Area():to calculate the area of sphere
 * 3. Volume():to calculate volume of sphere
 * 4. Dispdata():to display all the calculated values with the imput data.
 */

import java.util.Scanner;

class sphere {
    private double r; 
    private double a; 
    private double v;
    public void getData() {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        r = Scanner.nextDouble();
    }

    // Method to calculate the surface area of the sphere
    public void calculateArea() {
        a = 4 * Math.PI * r * r;
    }

    // Method to calculate the volume of the sphere
    public void calculateVolume() {
        v = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    // Method to display input data, area, and volume
    public void displayData() {
        System.out.println("Sphere Data:");
        System.out.println("Radius: " + r);
        System.out.println("Area: " + a);
        System.out.println("Volume: " + v);
    }

    public static void main(String[] args) {
        sphere sphere = new sphere();
        sphere.getData();
        sphere.calculateArea();
        sphere.calculateVolume();
        sphere.displayData();
    }
}


