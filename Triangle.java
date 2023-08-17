/* define a class traingle with instances variables base , height and area, similarly,define member methods getdata(),calcarea() adn display().create the objects of the class triangle and display the height,base and the area. */

import java.util.Scanner;

public class Triangle {
    private double base;
    private double height;
    private double area;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        height = scanner.nextDouble();
    
    }

    public void calcArea() {
        area = 0.5 * base * height;
    }

    public void display() {
        System.out.printf("Triangle - Base: %.2f, Height: %.2f, Area: %.2f%n", base, height, area);
    }
}

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();

        triangle1.getData();
        triangle1.calcArea();
        triangle1.display();

        triangle2.getData();
        triangle2.calcArea();
        triangle2.display();
    }
}
