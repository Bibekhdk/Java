/* create a class publication which has instance variables title and price. form this class derive two classes Book and CDROM. Book class has 
 * instance variables page and CDROM class has instance variable playtime.Both these classes have getdata() method to get input from the user and
 * putdata() to display the contents. write a program to create instances of these classes and demonstrate appropraite operations
 */
import java.util.Scanner;

class Publication {
    String title;
    float price;

    void getData() {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter title: ");
        title = Scanner.nextLine();
        System.out.print("Enter price: ");
        price = Scanner.nextFloat();
    }

    void putData() {
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
    }
}

class Book extends Publication {
    int pages;

    void getData() {
        super.getData();
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter number of pages: ");
        pages = Scanner.nextInt();
    }

    void putData() {
        super.putData();
        System.out.println("Pages: " + pages);
    }
}

class CDROM extends Publication {
    float playtime;

    void getData() {
        super.getData();
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter playtime (in minutes): ");
        playtime = Scanner.nextFloat();
    }

    void putData() {
        super.putData();
        System.out.println("Playtime: " + playtime + " minutes");
    }
}

public class Publication1 {
    public static void main(String[] args) {
        Book book = new Book();
        CDROM cdrom = new CDROM();

        System.out.println("Enter book details:");
        book.getData();
        System.out.println("\nEnter CDROM details:");
        cdrom.getData();

        System.out.println("\nBook details:");
        book.putData();
        System.out.println("\nCDROM details:");
        cdrom.putData();
    }
}
