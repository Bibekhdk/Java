/* defne a class circle with instance variables radius and area and member methods getdata(),clacarea()and display().create some instances of the circle and display the calculated area.

 */
import java.util.Scanner;

public class Circle {
    private double radius;
    private double area;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
    }

    public void calcArea() {
        area = 3.14159 * radius * radius;
    }

    public void display() {
        System.out.printf("Circle - Radius: %.2f, Area: %.2f%n", radius, area);
    }


    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        circle1.getData();
        circle1.calcArea();
        circle1.display();
        circle2.getData();
        circle2.calcArea();
        circle2.display();
    }   }
