/* wap as per the given instructions make three Members method in public part as inut(),display() and largest().Input method takes input from
 * the user,largest method should indentify which number is largest number supplied by the user and display method should display the
 * final result.
 */
import java.util.Scanner;

class NumberProcessor {
    private double num1, num2, num3;

    public void input() {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = Scanner.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = Scanner.nextDouble();
        System.out.print("Enter the third number: ");
        num3 = Scanner.nextDouble();
    }

    public double largest() {
        return Math.max(num1, Math.max(num2, num3));
    }

    public void display() {
        double largestNumber = largest();
        System.out.println("The largest number is: " + largestNumber);
    }
}

public class largestnum {
    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();
        processor.input();
        processor.display();
    }
}