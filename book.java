/* create a class book with member variables book_id and pages, Then create a subclass FictionBooks with member variable called name.
 * Create some instances of FictionBooks class and set the values of both sub class and superclass and display all member variables that have been 
 * initialized.
 */
class Books {
    protected int book_id;
    protected int pages;

    public Books(int book_id, int pages) {
        this.book_id = book_id;
        this.pages = pages;
    }
}

class FictionBooks extends Books {
    private String name;

    public FictionBooks(int book_id, int pages, String name) {
        super(book_id, pages);
        this.name = name;
    }

    public void display() {
        System.out.println("Book ID: " + book_id);
        System.out.println("Pages: " + pages);
        System.out.println("Fiction Book Name: " + name);
    }
}

public class book{
    public static void main(String[] args) {
        FictionBooks fictionBook1 = new FictionBooks(1, 300, "helloworld");
        FictionBooks fictionBook2 = new FictionBooks(2, 250, "worldhello");

        fictionBook1.display();
        System.out.println("--------------------");
        fictionBook2.display();
    }
}